import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number amount: ");
        String str = input.nextLine();
        int n = Integer.valueOf(str);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the number " + (i+1) + ": ");
            String str2 = input.nextLine();
            arr[i] = Integer.valueOf(str2);

        }
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
