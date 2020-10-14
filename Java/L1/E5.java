// 5) O código abaixo contem as propriedades que descrevem um post de um blog. Não há o código dos métodos.
// Escreva o código dos métodos necessários para ambas as classes e escreva um programa que instancie um objeto
// Post, leia do teclado as informações necessárias para preencher todas as propriedades do objeto e, por último,
// imprima essas informações através do método imprimeResumo(). As classes devem conter métodos
// getters/setters.

class Autor {
    private String nome;
    private int id;
}

class Post{
    private Autor autor;
    private String texto;
    // Imprime todas as propriedades da classe no formato:
    public void imprimeResumo() {}
}