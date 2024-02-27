import java.util.Scanner;
public class q13 {
    public static void main(String[] args){
        System.out.println("Digite um número");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        if(num > 0){ System.out.println("O número é positivo");}
        else{ System.out.println("O número é negativo");}
    }    
}
