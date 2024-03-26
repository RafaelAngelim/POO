import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class projeto_estoque {
    // struct que forma os dados do produto no estoque
    static class Prod {
        String nome;
        int qtd;
        double valor;

        Prod(String nome, int qtd, double valor) { // construtor para produto
            this.nome = nome;
            this.qtd = qtd;
            this.valor = valor;
        }
    }
    
    // adicionar produto ao estoque
    static void add(Scanner scan, Prod[] estoque, int qtdprd) {
        System.out.print("Produto: ");
        String nome = scan.nextLine();
        System.out.print("Quantidade: ");
        int qtd = scan.nextInt();
        System.out.print("Preço: ");
        double preco = scan.nextDouble();

        estoque[qtdprd] = new Prod(nome, qtd, preco);
        System.out.println("Produto adicionado ao estoque");
    }

    // remover produto do estoque
    static void rm(Scanner scan, Prod[] estoque, int qtdprd) {
        System.out.print("Produto para remover: ");
        String nome = scan.nextLine();

        boolean validate = false;
        for (int i = 0; i < qtdprd; i++) {
            if (estoque[i].nome.equals(nome)) {
                for (int j = i; j < qtdprd - 1; j++) {
                    estoque[j] = estoque[j + 1];
                }
                qtdprd--;
                validate = true;
                break;
            }
        }

        if (validate) System.out.println("Produto removido do estoque");
        else System.out.println("Produto não encontrado no estoque.");

    }

    
    static void cons(Scanner scan, Prod[] estoque, int qtdprd) {
        System.out.print("Produto para consultar: ");
        String nome = scan.nextLine();

        for (int i = 0; i < qtdprd; i++) {
            if (estoque[i].nome.equals(nome)) {
                System.out.println("Nome: " + estoque[i].nome);
                System.out.println("Quantidade: " + estoque[i].qtd);
                System.out.println("Preço: " + estoque[i].valor);
                return;
            }
        }

        System.out.println("Produto não encontrado no estoque.");
    }

    // atualiza o prod
    static void att(Scanner scan, Prod[] estoque, int qtdprd) {
        System.out.print("Produto para ser atualizado: ");
        String nome = scan.nextLine();

        for (int i = 0; i < qtdprd; i++) {
            if (estoque[i].nome.equals(nome)) {
                System.out.print("Nova quantidade: ");
                estoque[i].qtd = scan.nextInt();
                System.out.print("Novo preço: ");
                estoque[i].valor = scan.nextDouble();
                System.out.println("Produto atualizado");
                return;
            }
        }

        System.out.println("Produto não encontrado no estoque.");
    }

    // mostra o estoque
    static void show(Prod[] estoque, int numProdutos) {
        if (numProdutos == 0) {
            System.out.println("Estoque vazio.");
            return;
        }
        
        Set<String> tipo = new HashSet<>(); // cria um array de string unicas sem repeticao usando hashset
        System.out.println("----- Estoque -----");
        System.out.println("Total de produtos: " + numProdutos);
        
        int qtdun = 0; // variável para armazenar o total de unidades
        for (int i = 0; i < numProdutos; i++) {
            tipo.add(estoque[i].nome); // add o nome único
            System.out.println("Produto: " + estoque[i].nome);
            System.out.println("Quantidade: " + estoque[i].qtd);
            System.out.println("Preço: " + estoque[i].valor);
            System.out.println("-------------------");
            qtdun += estoque[i].qtd; // atualiza o total de unidades
        }
        
        System.out.println("Tipos de produtos diferentes: " + tipo.size());
        System.out.println("Total de unidades: " + qtdun);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Prod[] estoque = new Prod[100]; // array contendo produtos
        int qtdprod = 0; // número (variavel) de produtos

        // escolhas
        while (true) {
            System.out.println("1. Adicionar produto no estoque");
            System.out.println("2. Remover produto do estoque");
            System.out.println("3. Atualizar preço e quantidade do produto");
            System.out.println("4. Consultar preço e quantidade do produto");
            System.out.println("5. Mostrar todo o estoque");
            System.out.println("6. Finalizar alterações");
            System.out.print("Escolha uma das opções acima: ");
            int caso = scan.nextInt();
            scan.nextLine(); //impede que seja lida uma linha vazia

            if (caso == 1) {
                add(scan, estoque, qtdprod);
                qtdprod++;
            } 
            else if (caso == 2) rm(scan, estoque, qtdprod);
            else if (caso == 3) att(scan, estoque, qtdprod); 
            else if (caso == 4) cons(scan, estoque, qtdprod);
            else if (caso == 5) show(estoque, qtdprod);
            else if (caso == 6) {
                System.out.println("Finalizando");
                return;
            } 
            else System.out.println("Opção inválida, favor inserir uma entrada correta");
            
        }
    }
}
