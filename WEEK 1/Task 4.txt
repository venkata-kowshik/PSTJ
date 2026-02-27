public class Task4 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 15, 6};

        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        System.out.println("Max = " + max);
    }
}
