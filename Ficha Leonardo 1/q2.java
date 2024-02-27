import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        System.out.println("Qual sua idade?");

        Scanner scan = new Scanner(System.in);
        String idade = scan.nextLine();

        int idadenum = Integer.parseInt(idade);

        scan.close();

        System.out.println("Sua idade é " + idadenum);
    }
}
