import java.util.*;
public class Loops {

    public static void main(Strings[] args) {

        System.out.println("Enter the value of N :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        for (i = 0; i < n; i++){
             sum = sum + i;
            System.out.println(sum);
        }
    }
}
