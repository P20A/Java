
public class Main {
    public static void main(String[] args) {

        int number = 2;
        boolean valid = false;
        for (int j = 0; number <= 100; j++) {
            valid = true;
            for (int i = 2; i < number; i++) {
                if (number <= 100) {
                    if (number % i == 0) {
                        valid = false;
                        continue;
                    }
                }
            }
            if (valid){
                System.out.printf(number+" ");
            }
            number++;
        }

    }
}
