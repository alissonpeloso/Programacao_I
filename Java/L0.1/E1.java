import java.util.*;

class Autor {
    public String nome;
    public int id;
}

public class E1 {
    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        final Autor eu = new Autor();
        eu.nome = s.nextLine();
        eu.id = s.nextInt();

        s.close();
    }
}