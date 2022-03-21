import java.util.Scanner;

// 2) A classe abaixo representa uma compra num software de comércio. A classe está com o código de seus métodos
// incompleto. Escreva o código faltante dos métodos da classe Compra e escreva um programa em Java que instancie
// um objeto da classe Compra, leia do teclado as informações necessárias para preencher todas as propriedades do
// objeto e, por último, imprima essas informações através do método imprimeResumo().

class Compra {
    private String nomeProduto;
    private float preço;
    private int quantidade;

    public Compra(String produto, float preço, int quantidade) {
        this.setNomeProduto(produto);
        this.setPreço(preço);
        this.setQuantidade(quantidade);
    }
    public void setNomeProduto(String novo) {
        this.nomeProduto = novo;
    }
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public void setPreço(float preço) {
        this.preço = preço;
    }
    public float getPreço() {
        return this.preço;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    // Imprime todas as propriedades da classe
    public void imprimeResumo() {
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Preço: " + this.preço);
        System.out.println("Quantidade: " + this.quantidade);
    }
}

public class E2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        float preço = s.nextFloat();
        int quantidade = s.nextInt();

        Compra c = new Compra(nome,preço,quantidade);
        c.imprimeResumo();
        s.close();
    }
}
