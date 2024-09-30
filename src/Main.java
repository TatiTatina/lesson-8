public class Main {
    public static void main(String[] args) {

        Calculate calc = new Calculate();

        double result1 = calc.sumAll(2, 3/5, 2.3);

        double result2 = calc.sumAll(3.6, 49/12, 3, 3/2);

        double result3 = calc.sumAll(1.3, 1);

        System.out.println("Первый пример: " + result1);

        System.out.println("Второй пример: " + result2);

        System.out.println("Третий пример: " + result3);
    }
}

