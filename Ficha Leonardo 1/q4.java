import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
        System.out.println("Digite dois números");

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        scan.close();

        int sum = num1 + num2;

        System.out.println("a soma de " + num1 + " com " + num2 + " é igual a " + sum) ;
    }
}
