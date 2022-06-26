import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required

private const val EXPECTED_VALUE = "öööÖÖÖäääÄÄÄåååÅÅÅ"

fun main(args: Array<String>) {
    Cli().main(args)
}

class Cli : CliktCommand() {
    private val envVar: String by option(envvar = "NON_ASCII_ENVVAR").required()

    override fun run() {
        if (envVar != EXPECTED_VALUE) error("$EXPECTED_VALUE != $envVar")
    }
}