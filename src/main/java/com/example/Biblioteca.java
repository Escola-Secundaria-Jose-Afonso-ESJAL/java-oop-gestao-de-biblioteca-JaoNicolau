package  com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if(this.livros.size() < MAX_LIVROS)
        {
            this.livros.add(livro);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean removerLivro(String titulo) {
        for(Livro livroExiste : this.livros)
        {
            if(titulo == livroExiste.getTitulo())
            {
                this.livros.remove(titulo);
                return true;
            }            
        }
        return false; 
    }

    public void listarLivros() {
        for(Livro l1 : this.livros)
        {
            this.livros.toString();
            System.out.println(l1.getTitulo() + " " + l1.getAutor() + " " + l1.getAno());
        }
    }
}















