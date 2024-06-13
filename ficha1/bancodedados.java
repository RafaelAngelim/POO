package POO.ficha1;
//.
import java.util.HashMap;
import java.util.Map;

public class bancodedados {
    
    private Map<String, String> dados;
    private String userC;

    public bancodedados(String userC) {
        this.dados = new HashMap<>();
        this.userC = userC;
    }

    public void add(String key, String valor, String user) {
        verify(user);
        dados.put(key, valor);
        System.out.println("registro adicionado");
    }

    public void att(String key, String wen, String user) {
        verify(user);
        if (dados.containsKey(key)) {
            dados.put(key, wen);
            System.out.println("registro atualizado");
        } else {
            System.out.println("registro nao encontrado");
        }
    }

    
    public void rm(String key, String user) {
        verify(user);
        if (dados.containsKey(key)) {
            dados.remove(key);
            System.out.println("registro removido");
        } else {
            System.out.println("registro nao encontrado");
        }
    }

    public void show() {
        System.out.println("Registros:");
        for (Map.Entry<String, String> entry : dados.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }

    private void verify(String user) {
        if (!user.equals(userC)) {
            throw new IllegalStateException("Acesso negado. Você não tem permissão para modificar os dados.");
        }
    }
}
