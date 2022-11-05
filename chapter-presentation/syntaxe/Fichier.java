public class Fichier {

    @FunctionalInterface
    public interface OperateurMathematiqueUnaire<T,R > {

        public R apply(T param);
    }

    public static void main(String[] args) {
        OperateurMathematiqueUnaire<Integer, Integer> il = v -> v + 2;
    }
}