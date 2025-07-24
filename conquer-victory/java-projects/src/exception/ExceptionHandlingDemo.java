package exception;

// try, catch, throw, throws, finally
public class ExceptionHandlingDemo {

    public void throwsDemo() throws NullPointerException {
        String str = null;
        System.out.println(str.length());
    }

    public void slave() {
        try {
            throwsDemo();
        } catch (NullPointerException e) {
            System.out.println("Exception : " + e);
        }
    }

    public static void main(String[] args) {
//        try {
//            int a = 5 / 0;
////            System.out.println("Hi");
//            try {
//                int c[] = {2};
//                c[0] = 25;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Inner try exception : " + e);
//            }
//        } catch (ArithmeticException e){
//            System.out.println("Exception --> " + e);
////            System.out.println("Hi");
//        } finally {
//            System.out.println("Hi");
//        }

//        try {
//            int a = 5/0;
//            throw new ArithmeticException();
//        } catch (Exception e) {
//            System.out.println("Exception : " + e);
//        }

        ExceptionHandlingDemo obj = new ExceptionHandlingDemo();
        obj.slave();
    }
}
