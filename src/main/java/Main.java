public class Main {
        public static void main(String args[]) {

            Calculator calc1 = new Calculator();

            System.out.println("Сумма: " + calc1.sum(1, 3));
            System.out.println("Сумма: " + calc1.sum(5.5, 30));
            System.out.println("Разность: " + calc1.subtr(9.3, 6));
            System.out.println("Произведение: " + calc1.multiply(5.9, 9));
            System.out.println("Частное: " + calc1.divide(1, 0));


        }
}
