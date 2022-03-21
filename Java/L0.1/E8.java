public class E8 {
    public static void main(String[] args) {
        Sprite a = new Sprite(), b = new Sprite(); // alocação de memória da classe Sprite para a e b;
        a.clona(b); // b = h (b.value = 2 e b.id = 3 | a.id = 3) print: "Sprite 2.0, 3"
        b.clona(a); // a = h (a.value = 2 e a.id = 3 | b.id = 3) print: "Sprite 2.0, 3"
        b.value = 90; // b.value = 90;
        a.print(); // print: "Sprite 0.0, 3"
        b.print(); // print: "Sprite 90.0, 3"
    }
}

class Sprite {
    public double value;
    public int id;
    public void print() {
        this.printPrefix("Sprite ");
    }
    private void printPrefix(String p) {
        System.out.println(p + value + ", " + id);
    }
    public void clona(Sprite s) {
        Sprite h = new Sprite();
        h.value = 2;
        h.id = 3;
        s = h;
        id = h.id;
        h.print();
    }
}