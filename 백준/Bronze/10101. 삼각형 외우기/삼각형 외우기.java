import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b == c ) {
            System.out.print("Equilateral");
        } else{
            if(a+b+c == 180) {
                if(a==b||a==c||b==c) System.out.print("Isosceles");
                else System.out.print("Scalene");
            } else {
                System.out.print("Error");
            }
        }
    }
}
