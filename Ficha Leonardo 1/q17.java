import java.util.Scanner;

public class q17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu estado civil");
        String estado = scan.nextLine();
        scan.close();
        System.out.println("Você é " + estado);
    }    
}
