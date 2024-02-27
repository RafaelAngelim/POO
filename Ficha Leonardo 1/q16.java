import java.util.Scanner;

public class q16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        scan.close();
        if(nome.length() > 5){System.out.println("Seu nome contém mais de 5 caracteres");}
        else{System.out.println("Seu nome contém menos de 5 caracteres");}
    }
}
