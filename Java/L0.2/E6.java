class Circulo1 {
    private int raio;
    Circulo1(int raio) {
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

class Retangulo2 {
    private int base;
    private int altura;

    Retangulo2(int base, int altura) {
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

    public int area(){
        return (this.altura * this.base);
    }

    public int perimetro(){
        int calc = (this.altura * 2) + (this.base * 2);
        return calc;
    }

    public double diagonal(){
        double a = (Math.pow(this.altura, 2) + Math.pow(this.base, 2));
        double calc = Math.sqrt(a);
        return calc;
    }

    void imprimeAreaPerDiag() {
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Diagonal: " + diagonal());
    }

    void aumenta(int valor){
        this.altura += valor;
        this.base += valor;
    }

    void aumentaParaConterCirculo (Circulo1 circulo){
        if(circulo.getRaio() > this.altura){
            this.aumenta(circulo.getRaio()-this.altura);
        }

        if(circulo.getRaio() > this.base){
            this.aumenta(circulo.getRaio()-this.base);
        }
    }
}

public class E6 {
    public static void main(String[] args) {
        Retangulo2 ret = new Retangulo2(5, 3);
        Circulo1 circ = new Circulo1(6);

        ret.imprimeDimensoes();
        circ.imprimeTudo();

        ret.aumentaParaConterCirculo(circ);

        ret.imprimeDimensoes();
        circ.imprimeTudo();
    }
}
