import java.util.Scanner;


public class q11 {
    public static void main(String[] args){
        System.out.println("Digite uma string");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        scan.close();
        System.out.println("o tamanho da sua string é de " + str.length());
    }    
}
