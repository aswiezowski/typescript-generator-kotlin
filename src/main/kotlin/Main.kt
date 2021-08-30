import cz.habarta.typescript.generator.*

fun main() {
    val settings = Settings()
    settings.outputKind = TypeScriptOutputKind.module
    settings.jsonLibrary = JsonLibrary.jackson2
    settings.nullabilityDefinition = NullabilityDefinition.nullInlineUnion
    settings.outputFileType = TypeScriptFileType.implementationFile
    settings.mapClasses = ClassMapping.asClasses
    val typeScriptGenerator = TypeScriptGenerator(settings)
    val parameters: Input.Parameters = Input.Parameters()
    parameters.classNamePatterns = listOf("typescript.**")
    val input = Input.from(parameters)
    val generateTypeScript = typeScriptGenerator.generateTypeScript(input)

    println(generateTypeScript)
}