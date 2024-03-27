package POO.ficha1;

public class livro {
    
    private String titulo;
    private String autor;
    private int ano;

    
    public livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        if (ano > 0) {this.ano = ano;} 
        else {throw new IllegalArgumentException("Ano de publicação inválido. Deve ser um valor positivo.");}
    }

    
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }
}

