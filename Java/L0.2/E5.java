import java.util.*;

class Circulo {
    private int raio;
    Circulo(int raio) {
        this.raio = raio;
    }
    double area() {
        double calc = (Math.PI * Math.pow(raio, 2));
        return calc;
    }
    double circunf() {
        double calc = 2 * Math.PI * raio;
        return calc;
    }
    void imprimeTudo(){
        System.out.println("---------------------------");
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area());
        System.out.println("Circunferência: " + this.circunf());
    }
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
}

public class E5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circulo c = new Circulo(5);
        c.imprimeTudo();

        System.out.printf("Insira o novo valor do Raio: ");
        int newRaio = s.nextInt();

        c.setRaio(newRaio);

        c.imprimeTudo();

        s.close();
    }
}
