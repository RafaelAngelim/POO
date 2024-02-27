import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        System.out.println("Digite um animal");
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();
        scan.close();
        System.out.println("você digitou" + animal);

    }    
}
