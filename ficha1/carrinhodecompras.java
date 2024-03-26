package POO.ficha1;
import java.util.ArrayList;
import java.util.List;
public class carrinhodecompras {
    private String user;
    private List<String>itens;
    public carrinhodecompras(String user){
        this.user = user;
        this.itens = new ArrayList<>();
    }
    public void add(String novo, String ruser){
        if(ruser.equals(user)){
            itens.add(novo);
            System.out.println(novo + "adicionado");
        }
        else System.out.println("Sem permissão de adicionar um item ao carrinho");
    }


    public void rem(String novo, String ruser){
        if(ruser.equals(user)){
            if(itens.contains(novo)){
                itens.remove(novo);
                System.out.println(novo + "removido");
            }
            else{System.out.println(novo + "não está no carrinho");}
        }
        else System.out.println("Sem permissão de remover um item do carrinho");
    }

    public void list(){
        System.out.println("Itens de " + user + ":");
        for(String item : itens) System.out.println("- " + item);
    } 
    
}
