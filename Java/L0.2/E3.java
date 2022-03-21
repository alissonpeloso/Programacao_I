import java.util.*;

class Retangulo {
    private int base;
    private int altura;

    Retangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    // Imprime as dimensoes do retangulo
    void imprimeDimensoes() {
        System.out.println("----------");
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
    }

    public int getAltura() {
        return this.altura;
    }

    public int getBase(){
        return this.base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setBase(int base){
        this.base = base;
    }

}

public class E3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Retangulo a = new Retangulo(7, 4);
        a.imprimeDimensoes();

        System.out.printf("Nova Base: ");
        int newBase = s.nextInt();
        System.out.printf("Nova Altura: ");
        int newAltura = s.nextInt();

        a.setAltura(newAltura);
        a.setBase(newBase);

        s.close();

        a.imprimeDimensoes();
    }
}
