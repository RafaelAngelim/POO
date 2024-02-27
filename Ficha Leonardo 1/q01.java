import java.util.Scanner; //importa para poder receber um input

public class q1{
    public static void main(String[] args){
        System.out.println("Qual seu nome?");

        Scanner input = new Scanner(System.in);
        String nomepessoa = input.nextLine();

        System.out.println("Seja bem vindo, " + nomepessoa + "!");
        
        input.close();

    }
}
