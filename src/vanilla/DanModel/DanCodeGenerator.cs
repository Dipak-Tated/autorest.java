﻿using AutoRest.Core;
using AutoRest.Core.Model;
using System.Collections.Generic;
using System.Linq;

namespace AutoRest.Java.DanModel
{
    public static class DanCodeGenerator
    {
        public static IEnumerable<JavaFile> GetFiles(CodeModel codeModel, Settings settings)
        {
            IList<JavaFile> result = new List<JavaFile>();

            if (codeModel != null)
            {
                AddEnumJavaFiles(codeModel, settings, result);
            }

            return result;
        }

        public static IEnumerable<JavaFile> GetEnumJavaFiles(CodeModel codeModel, Settings settings)
        {
            List<JavaFile> enumJavaFiles = new List<JavaFile>();
            AddEnumJavaFiles(codeModel, settings, enumJavaFiles);
            return enumJavaFiles;
        }

        public static void AddEnumJavaFiles(CodeModel codeModel, Settings settings, IList<JavaFile> javaFiles)
        {
            string headerCommentText = settings.Header;

            string package = $"{codeModel.Namespace.ToLowerInvariant()}.{JavaEnum.RelativePackage}";
            int maximumMultipleLineCommentWidth = settings.MaximumCommentColumns;

            foreach (EnumType enumType in codeModel.EnumTypes)
            {
                JavaEnum javaEnum = GetEnum(headerCommentText, package, enumType);
                javaEnum.WithMaximumMultipleLineCommentWidth(maximumMultipleLineCommentWidth);
                JavaFile javaFile = javaEnum.GenerateJavaFile();
                javaFiles.Add(javaFile);
            }
        }

        public static JavaEnum GetEnum(string headerCommentText, string package, EnumType enumType)
        {
            string enumName = enumType.Name;

            IEnumerable<JavaEnumValue> enumValues = enumType.Values
                .Select((EnumValue value) => new JavaEnumValue(value.MemberName, value.SerializedName));

            return enumType.ModelAsString ?
                new JavaExpandableStringEnum(headerCommentText, package, enumName, enumValues) :
                new JavaEnum(headerCommentText, package, enumName, enumValues);
        }
    }
}