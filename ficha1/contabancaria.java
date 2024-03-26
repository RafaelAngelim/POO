package POO.ficha1;

public class contabancaria{
    
    private String nome;
    private String numero;
    private double saldo;

    public contabancaria(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}