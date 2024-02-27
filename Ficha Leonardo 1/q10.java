import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome e sobrenome");
        Scanner scan = new Scanner(System.in);
        
        String nome = scan.nextLine();
        String[] nomes = nome.split(" ");
        
        scan.close();

        System.out.println(String.valueOf(nomes[1] + " " + nomes[0]));


    }
}
