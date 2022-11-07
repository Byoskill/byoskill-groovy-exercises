class Calculatrice {
    def result = 0

    def ajouter(val) {
        result+=val
        this
    }

    def plus(val) {
        result += val
        this
    }

    def print() {
        println result
    }
}

new Calculatrice().ajouter(2).print()
def calculatrice = new Calculatrice()
calculatrice += 2
calculatrice.print()

class Buffer{
    StringBuilder stringBuilder = new StringBuilder()

    public Buffer leftShift(String str) {
        stringBuilder.append(str)
        this
    }

    def size() {
        stringBuilder.size()
    }
}


def buffer = new Buffer()
buffer << "test"
println buffer.size()
buffer << "gni"
println buffer.size()
buffer << "gna"
println buffer.size()

def builder = new StringBuilder()
builder << "Ceci";
builder << " ";
builder << "est";
builder << " ";
builder << "une" << " "<< "chaine";
println builder.toString()

Integer i  = 2;

String s = " "

println s * 5 + "ceci est indenté"
println s * 7 + "child"