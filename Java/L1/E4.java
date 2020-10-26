// 4) Dado o código abaixo, qual a saída do programa na tela? Justifique sua resposta desenhando e explicando a
// representação na memória dos elementos do programa:

//saída: 2.7 Box 9 0.0;

class MyClass {
public static void main(String[] args) {
    double d = 2.7;
    Box b = new Box(); 
    b.doMinus(d);
    System.out.println(d);
    System.out.println(b.explain());
    }
}
class Box {
    public double d;
    private int i;
    public void doMinus(double d) {
    d = d - 10;
    i = 9;
    }
    public String explain() {
        return "Box: " + this.i + " " + this.d;
    }
}
