package onlinevideos;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];
        String[] b = {"Ragul", "Ram", "Roy"};

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
