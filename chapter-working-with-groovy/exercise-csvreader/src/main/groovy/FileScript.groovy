import org.apache.commons.lang3.SystemUtils

import java.nio.file.Files

import static java.lang.Runtime.*

def file = new File("test.txt")
def content = file.text
println content

// JDK 11
var content2 = Files.readString(file.toPath());
println content2

if (SystemUtils.IS_OS_WINDOWS) {
    def process3 = ["cmd.exe", "-l"].execute()
} else {
    def process = ["ls", "-wwewe3"].execute()
    println "Stdout:" + process.getInputStream().text
    println "Stderr:" + process.getErrorStream().text
}

/**VAR=args[0]
["ls", VAR].execute()
def process = ["appelProgram", VAR, "-l", -d].execute()
if (process.exitValue() != 0) {
    println "Le programme a planté"
}

VAR=basename $0
ls VAR
appelprogram VAR -l -d
 */

def fichierAEcrire = new File("test2.txt")
fichierAEcrire << "ligne 1" << "\n"
fichierAEcrire << "ligne 2" << "\n"
fichierAEcrire << "ligne 3" << "\n"

def fichierAEcrire2 = new File("test3.txt")
def message =
        """
        ligne1
        ligne2
        ligne3
        """
fichierAEcrire2.write(message.unexpand())
