package oop;

class Addition {
//    public int add(int i, int j) {
//        return i + j;
//    }
//
//    public int add(int i, int j, int k) {
//        return i + j;
//    }
//
//    public int add(int i, int j, int k, int l) {
//        return i + j;
//    }

    // Variable length arguments
    int sum = 0;
    public int add(int ...i) {
        for(int val : i) {
            sum = sum + val;
        }
        return sum;
    }

}

public class VarArgsDemo {
    public static void main(String ...args) {
        Addition ad = new Addition();
//        int res = ad.add(5, 10);
//        int res1 = ad.add(5, 10, 15);
//        int res2 = ad.add(5, 10, 15, 20);
        int res = ad.add(5, 10, 15);
        System.out.println(res);
    }
}
