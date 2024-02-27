import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        System.out.println("Digite o ano em que você nasceu");

        Scanner scan = new Scanner(System.in);

        int ano = scan.nextInt();
        int idade = 2024 - ano;
        scan.close();
        System.out.println("você tem " + idade + " anos");
    }
}
