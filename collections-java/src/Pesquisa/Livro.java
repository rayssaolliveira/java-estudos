package Pesquisa;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo: '" + titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", anoPublicacao: " + anoPublicacao +
                '}';
    }
}
