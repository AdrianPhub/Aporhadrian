public class fibonacci{

    public static void main(String[] args) {
        int numero = 50;

        int inicial = 0, actual = 1;
        for (int i = 0; i < numero; i++) {
            System.out.println(inicial);
            int siguiente = inicial + actual;
            inicial = actual;
            actual = siguiente;
        }
    }
}
