import java.util.Scanner;


public class q7 {
    public static void main(String[] args){
        System.out.println("Digite seu primeiro nome");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println("Agora digite seu sobrenome");
        String sobrenome = scan.nextLine();
        scan.close();
        String conc = nome + " " + sobrenome;
        System.out.println("Seu nome é: " + conc);

    }
}
