import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] array = new int[]{1,4,42,7,75,21,38412,44,8,927};
        int [] sorted = new int[array.length];
        for (int i= 0 ; i<array.length;i++){
            sorted[i] = smallest(array);
        }
        for (int i= 0 ; i<sorted.length;i++){
            System.out.print(sorted[i]+" ");
        }
    }
    public static int smallest(int [] array){
        boolean valid = true;
        int result = 0;
        for (int i = 0; i<array.length;i++){
            valid = true;
            for (int j = i+1 ;j < array.length;j++){
                if (array[j]<array[i]) valid = false;
            }
            if (valid){
                result = array[i];
                array[i] = Integer.MAX_VALUE;
                break;
            }
        }
        return result;
    }
}
