class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;
    public Compra(String produto, float preco, int quantidade) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Compra(String produto, float preco) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = 0;
    }
    public Compra(String produto) {
        this.nomeProduto = produto;
        this.preco = 5.0f;
        this.quantidade = 0;
    }
    public Compra() {
        this.nomeProduto = "Nenhum";
        this.preco = 2.0f;
        this.quantidade = 0;
    }

    // Funções Getter
    public String getNomeProduto() {
        return nomeProduto;
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //Funções Setter
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

public class E4 {
    public static void main(String[] args) {
        Compra a = new Compra();

        a.setNomeProduto("Cabeça de Criança");
        a.setPreco(2);
        a.setQuantidade(5);

        System.out.printf("%s, %f, %d\n", a.getNomeProduto(), a.getPreco(), a.getQuantidade());
    }
}
