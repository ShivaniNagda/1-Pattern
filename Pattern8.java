import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns:");
        int n = sc.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i
            ; j++) {
                System.out.print(x); 
                x++;
            }
            System.out.println();
        }
        sc.close();
    }
}