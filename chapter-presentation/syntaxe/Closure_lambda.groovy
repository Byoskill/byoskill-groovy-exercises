import groovy.transform.MapConstructor
import groovy.transform.ToString

import java.util.concurrent.ThreadLocalRandom
import java.util.function.Predicate
import java.util.stream.Collectors

// Java
class ObjectAvecEquals {
    private int i =  ThreadLocalRandom.current().nextInt()

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        ObjectAvecEquals that = (ObjectAvecEquals) o

        if (i != that.i) return false

        return true
    }

    int hashCode() {
        return i
    }
}

ObjectAvecEquals a = new ObjectAvecEquals()
ObjectAvecEquals b = new ObjectAvecEquals()

// vrai => false
if (a == a) {

}
if (a.equals(a)) {

}


if (a.is(a)) {

}

class Army {
    def soldiers = [];

    class Soldier {
        Soldier() {
            soldiers.add(this)
        }
    }
}

Army army = new Army();
new Army.Soldier(army)
20.times {it -> new Army.Soldier(army)}

println army.soldiers.size()

// Streams, closures, methodes
class Mathematic {
    static def estChiffrePair(chiffre) {
        (chiffre % 2) == 0
    }



    static def estChiffrePairClosure = {
        (it % 2) == 0
    }


    static def estChiffreMultiple4 = {
        (it % 4) == 0
    }
    static def estChiffreMultiple8 = {
        (it % 8) == 0
    }

    static def estChiffreMultiple5 = {
        (it % 5) == 0
    }


}

var res = [1,2,5,7,8].stream().filter(Mathematic::estChiffrePair).collect(Collectors.toList())
println res

var res2 = [1,2,5,7,8].stream().filter(Mathematic::estChiffrePair).toList()
var res3 = [1,2,5,7,8].findAll(Mathematic::estChiffrePair)

println res3

// Groovy < 3
var res4 = [1,2,5,7,8].findAll Mathematic.estChiffrePairClosure
println res4

/**
 * Closure vs Stream
 *
 * Stream => plus performants
 * Closure => programmation fonctionnelle
 */
var chiffresPairs = [1,2,5,7,8].findAll Mathematic.estChiffrePairClosure
println chiffresPairs

def listeExample = [1, 2, 5, 7, 8, 12, 16, 20]
var chiffresMultiple4 = listeExample.findAll Mathematic.estChiffreMultiple4
println chiffresMultiple4

var chiffresMultiple8 = listeExample.findAll Mathematic.estChiffreMultiple8
println chiffresMultiple8

var chiffresMultiple5 = listeExample.findAll Mathematic.estChiffreMultiple5
println chiffresMultiple5

Predicate mult4 = (chiffre) -> (chiffre % 4) == 0
Predicate mult5 = (chiffre) -> (chiffre % 5) == 0
Predicate mult4et5 = mult4.and(mult5)

def mult2 = { it -> it * 2}
def mult1000 = { it -> it * 1000}

// mult2(mult1000(x))
def mult2000 = mult2 << mult1000

println "4000 -> " + mult2000(2)
/**
var closureMultiple4et5 = Mathematic.estChiffreMultiple4 & Mathematic.estChiffreMultiple5

var chiffresMultiple5Et4 = listeExample.findAll closureMultiple4et5
println chiffresMultiple5Et4
 */

def enleveSpaces = { String it -> it.strip() }
def enMaj = { String it -> it.toUpperCase() }
def coupeEnDeux = { String it -> it[0..it.size()/2] }

//def coupeEnQuatre = coupeEnDeux.curry(2)
//def extractUserName = coupeEnQuatre << enMaj << enleveSpaces
// println coupeEnQuatre("chainechaine")

def coupeEnDeuxWithMemo = coupeEnDeux.memoize()
/**coupeEnDeuxWithMemo(0)
coupeEnDeuxWithMemo("DDFDFDF")
coupeEnDeuxWithMemo("DDFDFDF")
coupeEnDeuxWithMemo("DDFDFDF")
coupeEnDeuxWithMemo("DDFDFDF")
 **/

String chaineDeCaractere = "    je suis une chaine    ";

println enleveSpaces(chaineDeCaractere)
println enMaj(chaineDeCaractere)
println enleveSpaces(enMaj(chaineDeCaractere))
println coupeEnDeux(enleveSpaces(enMaj(chaineDeCaractere)))
//println extractUserName(chaineDeCaractere)

/**
 * ==
 */
class A implements  Comparable<A> {

    private int i;

    @Override
    int compareTo(A o) {
        return Integer.compare(i, o.i)
    }
}

new A() == new A() // Equals

if (new A() === new A()) {

}

if (new A().is(new A())) {

}

Map method() {
    if (true) {
        return "";
    }

    return [error: true, status:""]
}

def methodClosure(Closure closure) {
    int res = closure.call()
    println res;
}

def methodClosure2(int value=10, Closure closure) {
    int res = closure.call()
    value + res;
}

methodClosure({ it -> 2})

def closure = { it -> 4 }
methodClosure(closure)

methodClosure() { it -> 8}
methodClosure2(4) { it -> 8}
methodClosure2 4, { it -> 8}

[1,2,4].each({ it -> println it})
[1,2,4].each() { it -> println it}
[1,2,4].each { it -> println it}

def resultat = methodClosure2 4, { it -> 8 }
println "Closure " + resultat

def resultat2 = methodClosure2  { it -> 8 }
println "Closure2 " + resultat2

@ToString
class UserName {
    def firstName;
    def lastName;
    def birthDate;

    UserName(String firstName = "Pas prenom", String lastName = "Inconnu", Date birthDate = new Date()) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}

println new UserName()
println new UserName("prenom")
println new UserName("prenom", "nom")

@ToString
@MapConstructor
class Adresse {
    String ville
    Integer codePostal
    String pays
    String rue;

    public static Adresse newVille(String codePostal, String pays,String ville ) {
        return new Adresse(codePostal:codePostal, ville:ville, pays:pays, rue: "")
    }
}

println new Adresse(ville: "Fougeres", codePostal: 35300, pays: "France", rue : "Rue")
println new Adresse([codePostal: 35133, ville:"Fougeres", pays: "FR"])

//Adresse.newVille(codePostal:  35133, pays:  "FR",ville:  "ville")




