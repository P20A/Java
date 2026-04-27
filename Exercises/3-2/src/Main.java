import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number amount: ");
        String str = input.nextLine();
        int n = Integer.valueOf(str);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("enter the number %d: ",(i+1));
            String str2 = input.nextLine();
            array[i] = Integer.valueOf(str2);
        }
        int temp = 0;
        int counter = 0;
        for (int i = 0;i< array.length;i++){
            if(array[i] % 2 == 0){
                temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        for (int i = 0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}