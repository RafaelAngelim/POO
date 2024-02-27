import java.util.Scanner;
public class q14 {
    public static void main(String[] args){
        System.out.println("Digite dois números");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        if(num1 > num2){ System.out.println(num1 + " é maior que " + num2);}
        else{ System.out.println(num2 + " é maior que " + num1);}
    }    
}
