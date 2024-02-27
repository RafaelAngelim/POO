import java.util.Scanner;
public class q19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de uma cidade");
        String cidade = scan.nextLine();
        scan.close();
        if(cidade.charAt(0) == 'h' || cidade.charAt(0) == 'H'){ System.out.println("A cidade começa com a letra H");}
        else{ System.out.println("Sua cidade não começa com a letra H");}
    }    
}
