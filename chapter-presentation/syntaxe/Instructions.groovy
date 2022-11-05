#!/home/formation/groovy/groovy-4.0.5/bin/groovy
import org.spockframework.util.JsonWriter

// je suis un commentaire

/*
 Je
 Suis
 Un
 Commentaire
 */

class A {

    /**
     *  Cette méthode sert à quelque chose.
     */
    def method() {

    }

}

/**
 *
 */

// Variables
// Instructions

// Structures de contrôles

//  if () { } else if {} else { }
if ( true ) {

} else if (false) {

}

if ( true ) println "Valeur vraie"
else if (false) println "Valeur fausse"

if ( true ) println "Valeur vraie"
else println "Valeur fausse"

boolean aGagneAuLoto = false

// Switch

switch(aGagneAuLoto) {
    case true:
        println "Youpie";
        break;
    case false:
        println "Je vais encore dépenser pour rejouer"
        break;
}

switch(aGagneAuLoto) {
    case true:
        println "Youpie";
        break;
    default:
        println "Je vais encore dépenser pour rejouer"
        break;
}

int chiffreEntre0Et09 = 0;

switch(chiffreEntre0Et09) {
    case 0:

    case 2:

    case 4:

    case 6:

    case 8:
        println "Ce chiffre est pair"
        break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 9:
        println "Ce chiffre est impair"
        break;
}

// Boucles

liste = [1,2,5]

for ( int il = 0 ; i < liste.size() ; ++i) {
    println liste[i]
}

for ( int il in 0..<liste.size()) {
    // 0.. n -1
    println liste[i]
}

for ( il in liste) {
    println il
}

int counter = 10;
do {
    println counter
    counter--;
} while ( counter > 0)

int counter2 = 10;
while ( counter2 > 0 ) {
    println counter2
    counter2--;
}

// Maps

/*
 {
  "firstName" : "Sylvain",
  "lastName" : "Leroy"
 }
 */

Map<String, String> map = new HashMap<>();
map.put("firstName", "Sylvain")
map.put("lastName", "Leroy")

Map<String, String> map2 = Map.of(
        "firstName", "Sylvain",
        "lastName", "Leroy"
)

Map map3 = [
    firstName : "Sylvain",
    lastName : "Leroy"
]

var writer = new JsonWriter(new StringWriter())
var str = writer.write(map3);
print str;

// type nomVariable [ = valeurInitialisée ]
String str0 = "Une chaine de caractères"
int i = 2

// types primitifs | Objects
// int, float, double, short, byte, boolean, long
int j = 2;
int k;
String s = new String("str")
String str2 = "str";

class Personne { }
Personne moi = new Personne();
moi.nom = "Foobar"
Personne toto = new Personne();


byte b =  // 8bits
byte b = 0

// chaine de caractères UTF
char c = 'f';
short valChar = c;

short c1 ; // 16 bits
int k1 ; //  32 bits
long l1 ; // 64

int i2;
int i3 = 0;
def i4 = 0;
var i5 = 0;


boolean val;
boolean val2 = false;

public class Classe {
    String 字;

    public String get字() {
        return 字;
    }

    public void setRésiliation(boolean résiliation) {
        this.résiliation = résiliation;
    }
}


Writer unicodeFileWriter = new OutputStreamWriter(
        new FileOutputStream("a.txt"), "UTF-8");
unicodeFileWriter.write("漢字");



int i4 = 0; // 0 => int
i = 0;
str = "dfdfd" // => String
c = 'c' // => Character










var writer = new JsonWriter(new StringWriter())
writer.write(map3);



