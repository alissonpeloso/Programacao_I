class Pessoa {
    private String nome;
    private double peso;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public Pessoa(String nome, double peso, int idade){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    void printPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Idade: " + this.idade);
    }
}

public class E5 {
    public static void main(String[] args) {
        Pessoa a = new Pessoa("Alisson");
        Pessoa b = new Pessoa("Pedro", 94.5);
        Pessoa c = new Pessoa("Luan", 298.6, 15);

        a.printPessoa();
        b.printPessoa();
        c.printPessoa();
    }
}
