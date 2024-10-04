public class fizzBuzz {
    public static void main(String[] args) {

        int numero1= 1;
        int numero2= 100;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                System.out.println(".");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                System.out.println(".");
            }
        }
    }   
}
