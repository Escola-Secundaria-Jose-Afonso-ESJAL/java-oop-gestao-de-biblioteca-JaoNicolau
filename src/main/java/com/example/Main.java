package com.example;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro l3 = new Livro("1984", "George Orwell", 1949);
        
        Biblioteca panhonhas = new Biblioteca();
        
        boolean primeiroLivroAdd = panhonhas.adicionarLivro(l1);
        boolean segundoLivroAdd = panhonhas.adicionarLivro(l2);
        boolean terceiroLivroAdd = panhonhas.adicionarLivro(l3);
        
        System.out.println(primeiroLivroAdd);
        System.out.println(segundoLivroAdd);
        System.out.println(terceiroLivroAdd);
        
        boolean primeiroLivroRemove = panhonhas.removerLivro("O Senhor dos Anéis");
        
        System.out.println(primeiroLivroRemove);
        
        panhonhas.listarLivros();
    }
}
