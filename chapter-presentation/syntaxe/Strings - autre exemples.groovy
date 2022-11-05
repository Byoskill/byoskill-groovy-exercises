import groovy.transform.Field

import java.util.concurrent.ThreadLocalRandom
import java.util.regex.Pattern

def str1 = "Je suis une chaine de caractères"

def prenom = "Sylvain"
def hello = "Bonjour je m'appelle $prenom"
def hello2 = "Bonjour je m'appelle ${prenom.substring(0, 3)}"

println hello
println hello2

println "Sylvain".class.name // type de l'objet : String ? GString ?
println "$prenom".class.name // type de l'objet : String ? GString ?

def prenom1 = 'Sylvain'
def dynStr = 'Sylvain $prenom'
println "prenom1 : " + prenom1
println "dynStr : " + dynStr

char c = 'c'
println c


def method(char c) {
    println "Caractère $c"
}

def method2(Character c) {
    println "Caractère $c"
}


method((char) "c")
method((char) 'c')

method2((char) "c")
method2((char) 'c')

String str3 = "abcdef"

/**
 * Résumé
 * : "..." => interpolation des variables
 * : '..." :  on ne pas injecter de variables dedans
 * : 'a' : chaine de caractères sauf si vous l'affecter à une variable de type char
 * : convertir une chaine de caractères contenant un unique caractère en variable de type char :
 * en faisant (char) str
 */

def templateMail =
        '''
        Bonjour Sylvain
        
        Voici un exemple de mail.
        
        Cordialement        
        '''

def templateMail2 =
        """
        Bonjour $prenom
        
        Voici un exemple de mail.
        
        Cordialement        
        """
assert templateMail == templateMail2

def templateMail3 = """
{
    "users" : [
        {
            "firstName" : "Sylvain"
        }
    ]    
}
"""

def templateMail4 = '{"users" : [{"firstName" : "Sylvain"}]}'
def templateMail5 = "{\"users\" : [{\"firstName\" : \"Sylvain\"}]}"

/** Evaluation de chaînes de caractères paresseuses **/


def templateMail_lazy =
        """
        Bonjour ${-> prenom}
        
        Voici un exemple de mail.
        
        Cordialement        
        """
println "v1 " + templateMail_lazy
println "v1 statique : " + templateMail2
prenom = "Nicolas"
println "v2 : " + templateMail_lazy
println "v2 statique : " + templateMail2

def generationTemplate(prenom, nom) {
    return """
        Bonjour ${prenom} ${nom}
        
        Voici un exemple de mail.
        
        Cordialement        
        """
}

def nom = "";

def nomAleatoire() {
    return (0..5)
            .collect { it -> (char) (ThreadLocalRandom.current().nextInt(26)  + (int) 'A') }
            .join("")
}

def prenomAleatoire() {
    return (0..5)
            .collect { it -> (char) (ThreadLocalRandom.current().nextInt(26)  + (int) 'A') }
            .join("")
}

def templateDyn = """
        Bonjour ${-> nomAleatoire()} ${-> prenomAleatoire()}
        
        Voici un exemple de mail.
        
        Cordialement        
        """

println templateDyn
println templateDyn
println templateDyn
println templateDyn


//println generationTemplate("sylvain", "leroy")
//println generationTemplate("eric", "dupont")
prenom = "Sylvain"
nom = "Leroy"
println templateDyn

prenom = "Eric"
nom = "Dupont"
println templateDyn

/**
 * Java / Groovy
 */

// Pattern
// Matcher

String digitRegexp = "[0-9]+"
// Création de l'objet coûteuse
Pattern pattern = Pattern.compile(digitRegexp);
assert pattern.matcher("0").matches() == true
assert pattern.matcher("011212").matches() == true
assert pattern.matcher("A").matches() == false

// Regexp en Groovy
/*
+ : un ou plus
* : zero ou plus
? : zero ou 1
 */
def regexp1 = "a?"
assert Pattern.compile(regexp1).matcher("a").matches() == true
assert Pattern.compile(regexp1).matcher("").matches() == true

def regexp2 = "a*"
assert Pattern.compile(regexp2).matcher("a").matches() == true
assert Pattern.compile(regexp2).matcher("aaaa").matches() == true
assert Pattern.compile(regexp2).matcher("").matches() == true

def regexp3 = "a+"
assert Pattern.compile(regexp3, Pattern.CASE_INSENSITIVE | Pattern.MULTILINE).matcher("a").matches() == true
assert Pattern.compile(regexp3).matcher("aaaa").matches() == true
assert Pattern.compile(regexp3).matcher("").matches() == false

/
 [...] : tous les caractères sur lesquels tu veux faire une correspondance
 [0123456789]
 [abcdefh]
 [car_debut-car_fin]
 [a-z]
 [0-9]
 \d : entier [0-9]
 \w : 
 /
def regexp3_groovy = ~"a+"
assert regexp3_groovy.matcher("a").matches() == true
assert regexp3_groovy.matcher("aaaa").matches() == true
assert regexp3_groovy.matcher("").matches() == false

def regexp4_groovy = ~"a+"
assert ("a" ==~ regexp4_groovy) == true
assert ("aaaa" ==~ regexp4_groovy) == true
assert (!("" ==~ regexp4_groovy)) == true

assert ("a" ==~ "a+") == true
assert ("aaaa" ==~ "a+") == true
assert (!("" ==~ "a+")) == true

def createUser(String firstName ) {
    if (! ( firstName ==~ "\\w+" )) {
        throw new IllegalArgumentException("Invalid user name '$firstName'")
    }
}

createUser("sylvain")
createUser("")

// Slash strings

def createUser2(String firstName ) {
    if (! ( firstName ==~ /\w+/ )) {
        throw new IllegalArgumentException("Invalid user name '$firstName'")
    }
}
createUser2("sylvain")
createUser2("")

def pattern1 = ~/[A-Z]\s[0-9]{3}/











