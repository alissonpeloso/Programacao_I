class Retangulo1 {
    private int base;
    private int altura;

    Retangulo1(int base, int altura) {
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
}

public class E4 {
    public static void main(String[] args) {
        Retangulo1 a = new Retangulo1(5, 10);
        a.imprimeDimensoes();
        a.imprimeAreaPerDiag();
    }
}
