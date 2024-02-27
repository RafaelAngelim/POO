import java.util.Scanner;
public class q20 {
    public static void main(String[] args){
        Scanner scan = new Scanner  (System.in);
        System.out.println("insira dois números decimais");

        float num1 = scan.nextFloat(), num2 = scan.nextFloat(), resto = num1 % num2;
        scan.close();
        System.out.println("o resto da divisão entre " + num1 + " e " + num2 + " é " + resto);
    }
}
