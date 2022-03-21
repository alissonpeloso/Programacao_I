// 8) Dado o código abaixo, qual a saída do programa na tela? Justifique sua resposta desenhando e explicando a
// representação na memória dos elementos do programa:

class Main {
    public static void main(String[] args) {
        Sprite a = new Sprite(), b = new Sprite();
        a.clona(b);
        b.clona(a);
        b.value = 90;
        a.print();
        b.print();
    }
}

class Sprite {
    public double value;
    public int id;
    public void clona(Sprite s) {
        Sprite h = new Sprite();
        h.value = 2;
        h.id = 3;
        s = h;
        id = h.id;
        h.print();
    }
    public void print() { 
        System.out.println("Sprite " + value + ", " + id); 
    }
}