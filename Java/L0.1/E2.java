import java.util.*;

class Autor1 {
    private String nome;
    private int id;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void carregaDoTeclado() {
        final Scanner s = new Scanner(System.in);
        System.out.print("Escreva o nome: ");
        this.nome = s.nextLine();
        System.out.print("Escreva o ID: ");
        this.id = s.nextInt();

        s.close();
    }

    public void printAutor(){
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
    }
}

public class E2 {
    public static void main(final String[] args) {
        final Autor1 a = new Autor1();
        a.carregaDoTeclado();
        a.printAutor();

        final int x = a.getId();
        final String y = a.getNome();
        System.out.printf("Nome: %s e ID: %d\n", y, x);
        
        a.setId(18);
        a.setNome("N/A");

        System.out.println(" Alterado para ID:18 e nome N/A");
        a.printAutor();
    }

}
