/*
 Déclaration de classes
 Déclarations d'interface
 Déclarations d'énumération
 Définitions d'annotations
 Traits => Groovy
 Record => Groovy 4.0 / JDK 15
 */

// Une classe => une structure de données + logique
// Un record => une structure données
// Une interface => un contrat qui définit un ensemble de méthodes que doivent implémenter un objet ( une classe )
// Une énumération : un ensemble de valeurs prédéfinies
// Une annotation => une méta donnée que l'on attache à un élément du code

/**
 * @deprecated : will be removed in the next release
 */
@Deprecated
def method() {

}


method();

/**
 * Déclaration de classe
 */
class Client {
    // type identifiant [ = initialisation ]
    private String prenom
    private String nom
    private Date dateNaissance
    def pays;

    // Déclaration une propriété , un champ + getter + setter
//    def prenom;

}

class ClientWithLogic {
    // Modificateur
    // - visibilité de la variable / méthode : public, private, protected
    // - comportement ( thread ) : transient
    // - comportement ( parallélisme ) : synchronized

    private String prenom
    public String nom
    public Date dateNaissance

    // [modifier] type nomMethod ( parametres ) { }
    String getIdentiteComplete() {
        return prenom + " " + nom
    }

}

// Equivalent java
class ClientWithLogicJava {
    private Object prenom;
    private Object nom
    private Object dateNaissance

    public Object getPrenom() {
        prenom
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom
    }

    // [modifier] type nomMethod ( parametres ) { }
    String getIdentiteComplete() {
        return prenom + " " + nom
    }

}

var clientA = new Client();
clientA.pays

var client = new ClientWithLogic()
client.prenom = "Sylvain"
// Java
//client.setPrenom( "Sylvain")
client.nom = "Leroy"
println client.getIdentiteComplete()

class UserAccount {
    public String userName;
    private String password;
    private def cipher;

    boolean isPasswordValid(String passwordATester) {
        return password == passwordATester
    }

    public String toString() {
        return "User Account ${userName}"
    }
}

var account = new UserAccountGroovy();
account.userName = "Nom"
println account.isPasswordValid("Test")

/**
 * Groovy : déclaration des champs
 *  - def fieldName
 *  - Type fieldName
 *
 *   ===> créer une propriété
 *
 *   ==> cacher des données =>
 *    private String var;
 *    def private var2;
 */

class UserAccountGroovy {
    def userName;
    def password;
    private String cipher;

    boolean isPasswordValid(String passwordATester) {
        return password == passwordATester
    }
}

class CompteBancaire {
    private int solde = 0;
    private boolean ouvert = false;

    def open() {
        if (!ouvert ) {
            // QQ operation
            ouvert = true
        }
    }

    def close() {
        if (ouvert) {
            ouvert = false;
        }
    }

    def retrait(int montant) {
        solde-= montant
    }

    def depot(int montant) {
        solde+= montant
    }
}

var compte = new CompteBancaire()
compte.open()
compte.depot(100)
compte.depot(100)
compte.retrait(100)
compte.close()
//compte.setSolde(4344)

/*
image": {
        "src": "Images/Sun.png",
        "name": "sun1",
        "hOffset": 250,
        "vOffset": 250,
        "alignment": "center"
    },
 */
class Image {
    def src;
    def name;
    def hOffset;
    def vOffset;
    def alignment;
}

public class HelloClass {

    String hello() {
        return "Hello world"
    }

    String helloUser(String user) {
        return "Hello ${user}"
    }

    def helloGroovy() {
        return "Hello world"
    }

    // Entier, Chaine
    def helloUserGroovy(user) {
        return "Hello ${user}"
    }

    // Entier, Chaine
    def xmlHello(user) {
        return "<hello>${user}</hello>"
    }
}

def helloClass = new HelloClass();
println ( helloClass.hello() )
println  ( helloClass.helloUser("Sylvain") )
println ( helloClass.helloGroovy() )
println ( helloClass.helloUserGroovy("Sylvain") )
println ( helloClass.helloUserGroovy(new UserAccountGroovy()) )
println ( helloClass.xmlHello(new UserAccountGroovy()) )
println ( helloClass.xmlHello("sylvain") )



//
