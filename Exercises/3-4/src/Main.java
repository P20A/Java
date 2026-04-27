import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number amount: ");
        String str = input.nextLine();
        int n = Integer.valueOf(str);
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++){
            System.out.printf("row %d:\n",(i+1));
            for (int j = 0; j < n; j++) {
                System.out.printf("enter the number %d: ",(j+1));
                String str2 = input.nextLine();
                array[i][j] = Integer.valueOf(str2);
            }
        }

        boolean validRow = false;
        boolean validCol = false;
        boolean valid = false;
        int row = -1;
        int col = -1;
        for (int k = 0; k<n;k++){
            for (int i = 0; i<n; i++){
                valid = true;
                for (int j = i+1; j<n; j++){
                    if(array[k][i]>array[k][j]){
                        valid =false;
                        break;
                    }
                }
                if (valid){
                    validRow = true;
                    row = i;
                    break;
                }
            }
            for (int i = 0; i<n; i++){
                valid = true;
                for (int j = i+1; j<n; j++){
                    if(array[k][i]<array[k][j]){
                        valid =false;
                        break;
                    }
                }
                if (valid){
                    validCol = true;
                    col = i;
                    break;
                }
            }
            if (validRow && validCol) break;
            else validRow =false; validCol = false;

        }
        System.out.print(array[row][col]);



    }
}