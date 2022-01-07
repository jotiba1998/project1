public class exceptionRuntime {
    public static void main(String[] args) {
        try{
            int divideByZero=5/0;

        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception=>"+e.getMessage());
        }
    }
}
