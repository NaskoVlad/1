public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        Calculator calc = Calculator.instance.get();
        // Ошибка происходит из-за того, что деление на ноль невозможно.
        //
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1,1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль невозможно.\nХотя смотря в каких случаях, но не в нашем.");
        }





    }
}