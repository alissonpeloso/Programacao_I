class Compra1 {
    private String nomeProduto;
    private float preco;
    private int quantidade;

    public Compra1(String produto, float preco, int quantidade) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Compra1(String produto, float preco) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = 0;
    }
    public Compra1(String produto) {
        this.nomeProduto = produto;
        this.preco = 5.0f;
        this.quantidade = 0;
    }
    public Compra1() {
        this.nomeProduto = "Nenhum";
        this.preco = 2.0f;
        this.quantidade = 0;
    }

    void imprime(){
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}

public class E7 {
    public static void main(String[] args) {
        Compra1 c1, c2 = new Compra1("Livro java"); //c1 = NULL; c2.produto = "Livro java"
        Compra1 c3; //c3 recebe NULL
        c3 = new Compra1("Arroz", 2.5f, 3); //c3.produto = "Arroz", c3.preco = 2.5, c3.quantidade = 3;
    }
}
