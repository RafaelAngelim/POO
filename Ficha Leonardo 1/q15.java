import java.util.Scanner;

public class q15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu peso");
        float peso = scan.nextFloat();
        System.out.println("Digite sua altura em metros");
        
        
        float altura = scan.nextFloat();
        scan.close();
        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é " + imc ); 
    }    
}
