package questionLevel.medium;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 33, 22};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minindex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.println(num + "");
        }
    }
}
