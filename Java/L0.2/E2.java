import java.util.*;

class Pessoa1 {
    private String nome;
    private int idade;
    private float peso;

    public Pessoa1(){
        this.nome = "Vazio";
        this.idade = 0;
        this.peso = 0;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    int getIdade() {
        return this.idade;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }
    float getPeso() {
        return this.peso;
    }
    void setPeso(float peso) {
        this.peso = peso;
    }
    // Imprime todas as propriedades da classe
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome:\t" + this.nome);
        System.out.println("Idade:\t" + this.idade);
        System.out.println("Peso:\t" + this.peso);
    }
} 

public class E2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa1 p = new Pessoa1();
        p.imprimeDados();

        System.out.println("Insira o novo nome: ");
        String newNome = s.nextLine();
        System.out.println("Insira a nova idade: ");
        int newIdade = s.nextInt();
        System.out.println("Insira o novo peso: ");
        float newPeso = s.nextFloat();

        p.setNome(newNome);
        p.setIdade(newIdade);
        p.setPeso(newPeso);

        p.imprimeDados();

        s.close();
    }
}
