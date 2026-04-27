//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] array = new int[]{2,4,63,6,13,5453,444,0,8,97};
        boolean valid = true;
        for (int i = 0; i<array.length;i++){
            valid = true;
            for (int j = i+1 ;j < array.length;j++){
                if (array[j]<array[i]) valid = false;
            }
            if (valid){
                System.out.println(array[i]);
                array[i] = Integer.MAX_VALUE;
                break;
            }
        }
        for (int i = 0; i<array.length;i++){
            valid = true;
            for (int j = i+1 ;j < array.length;j++){
                if (array[j]<array[i]) valid = false;
            }
            if (valid){
                System.out.println(array[i]); break;

            }
        }
    }
}