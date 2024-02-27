import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        System.out.println("Digite um número inteiro");

        Scanner scan = new Scanner(System.in);
    

        float num = (float) scan.nextInt();

        scan.close();

        System.out.println("o numero em float é " + num);
    }
}
