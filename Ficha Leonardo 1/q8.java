import java.util.Scanner;


public class q8 {
    public static void main(String[] args){
        System.out.println("Digite vários números separados por espaço");
        Scanner scan = new Scanner(System.in);
        String numeros = scan.nextLine();
        String[] separados = numeros.split(" ");

        int qty = separados.length;
        scan.close();
        System.out.println("Você digitou " + qty + " números");

    }    
}
