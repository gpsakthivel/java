package questionLevel.basic;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {1,9, 7, 6,2 ,3,4, 5};
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}

class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 9, 7, 6,2 ,3,4, 5};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println(second);
    }
}
