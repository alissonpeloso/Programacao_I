// 5) O código abaixo contem as propriedades que descrevem um post de um blog. Não há o código dos métodos.
// Escreva o código dos métodos necessários para ambas as classes e escreva um programa que instancie um objeto
// Post, leia do teclado as informações necessárias para preencher todas as propriedades do objeto e, por último,
// imprima essas informações através do método imprimeResumo(). As classes devem conter métodos
// getters/setters.

class Autor {
    private String nome;
    private int id;

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Post{
    private Autor autor = new Autor();
    private String texto;
    // Imprime todas as propriedades da classe no formato:
    public void imprimeResumo() {
        System.out.println("Autor: " + this.autor.getNome() + " | ID: " + this.autor.getId());
        System.out.println("\""+this.texto+"\"");
    }
    public Autor getAutor() {
        return autor;
    }
    public String getTexto() {
        return texto;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}

public class E5{
    public static void main(String[] args) {
        Post p = new Post();
        Autor a = new Autor();
        a.setId(112);
        a.setNome("Alisson Peloso");
        p.setAutor(a);
        p.setTexto("bla bla bla");
        p.imprimeResumo();
    }
}