import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("enter the rows: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.valueOf(str);
        int [][] array = new int[n][n];
        for (int i = 0; i < n; i++){
            array[i][0] = 1;
            array[i][i]= 1;
        }
        for (int i = 2; i < array.length; i++){
            for (int j = 1; j < array[i].length; j++){
                if(i == j) break;
                array[i][j] = array[i-1][j] + array[i-1][j-1];
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
                if(i == j) break;
            }
            System.out.println();
        }
    }
}
