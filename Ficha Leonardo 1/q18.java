import java.util.Scanner;

public class q18 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base e a altura de um retângulo");
        float base = scan.nextFloat(), altura = scan.nextFloat(), area = base * altura;

        scan.close();
        System.out.println("A área do retângulo equivle a: " + area);

    }   
}
