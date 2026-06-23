package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private static List<Livro> LivroList;

    public CatalogoLivros() {
        this.LivroList = new ArrayList<>();
    }

    public static void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        LivroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!LivroList.isEmpty()) {
            for (Livro l : LivroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);

                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!LivroList.isEmpty()) {
            for (Livro l : LivroList) {
                if (l.getAnoPublicacao() >= anoInicial
                        && l.getAnoPublicacao() <= anoFinal) {

                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!LivroList.isEmpty()) {
            for (Livro l : LivroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;

                }
            }
        }
        return livroPorTitulo;
    }

    // Testando os métodos

    public static void main(String[] args) {

        // Adicionando Livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        CatalogoLivros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        CatalogoLivros.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        CatalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        CatalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);

        System.out.println(LivroList);

    }

}