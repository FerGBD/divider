import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you want to know the divisors:");
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++){
            if(x % i == 0){
                System.out.println("Number:" + i);
            }
        }
        sc.close();
    }
}