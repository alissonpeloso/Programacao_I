import java.util.*;

class Pessoa {
    private String nome;
    private int idade;
    private float peso;

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
        System.out.println("Nome:\t" + this.nome);
        System.out.println("Idade:\t" + this.idade);
        System.out.println("Peso:\t" + this.peso);
    }
} 


public class E1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa a = new Pessoa();
        String nome = new String();
        int idade;
        float peso;

        System.out.println("Insira o nome: ");
        nome = s.nextLine();
        System.out.println("Insira a idade: ");
        idade = s.nextInt();
        System.out.println("Insira o peso: ");
        peso = s.nextFloat();

        a.setIdade(idade);
        a.setNome(nome);
        a.setPeso(peso);

        s.close();

        a.imprimeDados();
    }
}