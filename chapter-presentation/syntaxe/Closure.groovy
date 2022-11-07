import java.util.function.Predicate
import java.util.stream.Collectors

def closure = { }

def closure2 = { println it}

def cl3 = { p -> println p}

def cl4  = { x,y -> x+y }

def cl5 = { -> ""}

String variable;
def str = "${-> variable}"

def cl6 = { String s -> s.length()}

def map = new HashMap<>()
map.computeIfPresent("key", (k, v) -> v + "fdfdf");
map.computeIfPresent("key", (_, v) -> v + "fdfdf");

def liste = [1,2,3,4,5,6]
def chiffresPair = liste.stream().filter(i -> (i % 2) == 0).toList();
println chiffresPair


// Java4
class IsChiffrePairPredicate implements Predicate<Integer> {

    @Override
    boolean test(Integer integer) {
        return (integer % 2) == 0;
    }
}
// Java 5+
Predicate<Integer> isChiffrePair = new Predicate<Integer>() {
    @Override
    boolean test(Integer integer) {
        return (integer % 2) == 0;
    }
}
// Java 8
Predicate<Integer> isChiffrePair2 = integer -> (integer % 2) == 0;

public interface OperateurMathematiqueUnaire<T,R > {

    public R apply(T);
}

OperateurMathematiqueUnaire<Integer, Integer> il = v -> v + 2;
OperateurMathematiqueUnaire<Integer, Integer> il2 = { v -> v + 2 };

public interface Robot {
    void hello()
    void stop()
    void temperature(int degrees)
}

Robot robot = [
        hello: { -> println "Hello"},
        stop: { -> println "Stop"},
        temperature: { int degree -> println "Il fait $degree degrés aujourd'hui"}
] as Robot

robot.hello()
robot.stop()
robot.temperature 10

enum Statut {
    OUVERT, FERME, BLOQUE
}

Statut val = "OUVERT";
// Ne fonctionne pas Statut val2 = "OUVERT_DS";

println val//,val2


def thread = new Thread(new Runnable() {
    @Override
    void run() {

    }
})
thread.start();
thread.stop();

def thread2 = new Thread({
     println "Je suis un thread"
})
thread2.start();
thread2.join();
thread2.stop();

def chiffresPair2 = liste
        .stream()
        .filter(isChiffrePair)
        .toList();

println chiffresPair2





