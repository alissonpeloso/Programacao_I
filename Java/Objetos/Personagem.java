import java.util.*;

class PersonagemSerie{
    String nome;
    String lado;
    String serie;

}

class Personagem{
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final PersonagemSerie p1 = new PersonagemSerie(), p2 = new PersonagemSerie(), p3 = new PersonagemSerie();

        System.out.println("Insira o nome do Personagem 1:");
        p1.nome = scan.nextLine();
        System.out.println("Insira o lado do Personagem 1 (bem/mau):");
        p1.lado = scan.nextLine();
        System.out.println("Insira a Série do Personagem 1:");
        p1.serie = scan.nextLine();

        System.out.println("Insira o nome do Personagem 2:");
        p2.nome = scan.nextLine();
        System.out.println("Insira o lado do Personagem 2 (bem/mau):");
        p2.lado = scan.nextLine();
        System.out.println("Insira a Série do Personagem 2:");
        p2.serie = scan.nextLine();

        System.out.println("Insira o nome do Personagem 3:");
        p3.nome = scan.nextLine();
        System.out.println("Insira o lado do Personagem 3 (bem/mau):");
        p3.lado = scan.nextLine();
        System.out.println("Insira a Série do Personagem 3:");
        p3.serie = scan.nextLine();

        
        System.out.printf("P1 Nome:\t %s\n",  p1.nome);
        System.out.printf("P1 Lado:\t %s\n",  p1.lado);
        System.out.printf("P1 Série:\t %s\n",  p1.serie);

        System.out.printf("P1 Nome:\t %s\n",  p2.nome);
        System.out.printf("P1 Lado:\t %s\n",  p2.lado);
        System.out.printf("P1 Série:\t %s\n",  p2.serie);

        System.out.printf("P1 Nome:\t %s\n",  p3.nome);
        System.out.printf("P1 Lado:\t %s\n",  p3.lado);
        System.out.printf("P1 Série:\t %s\n",  p3.serie);
    }
}