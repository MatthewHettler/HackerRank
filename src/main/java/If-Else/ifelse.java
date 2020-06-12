import java.util.*;

public class ifelse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5 || N > 20){
                System.out.println("Not Weird");
            }
            else {
                System.out.println("Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }
}
