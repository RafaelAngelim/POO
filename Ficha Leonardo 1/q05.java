import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        System.out.println("digite um número decimal");

        Scanner scan = new Scanner(System.in);

        float num = scan.nextFloat();

        scan.close();

        float quadrado = num*num;

        System.out.println(num + " ao quadrado é " + quadrado);
    }
}
