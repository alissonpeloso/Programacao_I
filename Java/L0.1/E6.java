class Quadrado1 {
    public int lado;
    public int x;
    public int y;
    public Quadrado1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void imprime() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
    }
}

public class E6 {
    // public static void main(String[] args) { // <- Letra A)
    //     Quadrado1 q1, q2;
    //     q1 = new Quadrado1(2, 4); //q1 é um quadrado com x = 2 e y = 4
    //     q2 = new Quadrado1(5, 6); //q2 é um quadrado com x = 5 e y = 6
    //     q1.lado = 10; //o int lado de q1 recebe 10
    //     q1.x = 2; // x de q1 recebe 2
    //     q1.y = 3; // y de q1 recebe 3
    //     q1.imprime(); // "x = 2 \n y = 3"
    //     q2.imprime(); // "x = 5 \n y = 6"
    // }

    //------------------------------------------------------------------------------------------

    // public static void main(String[] args) { // <- Letra B
    //     Quadrado1 q1, q2;
    //     int i = 3, a = 4;
    //     q1 = new Quadrado1(8, 5); //q1 é um quadrado com x = 8 e y = 5
    //     q2 = q1; // q2 recebe q1
    //     a = i; //a recebe i, a = 3
    //     q1.lado = 10; //lado de q1 recebe 10
    //     q2.x = 2; //q2.x recebe 2
    //     q2.y = 3; //q2.y recebe 3
    //     q2.imprime(); // "x = 2 \n y = 3"
    //     q1.imprime(); // "x = 2 \n y = 3"
    // }

    //------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Quadrado1 q1, q2, q3;
        q1 = new Quadrado1(4, 7); //q1 é um quadrado com x = 4 e y = 7
        q2 = q1; // q2 recebe q1
        q3 = q2; // q3 recebe q2
        q1.imprime(); // "x = 4 \n y = 7"
        q2.imprime(); // "x = 4 \n y = 7"
        q1.lado = 10; // lado de q1 recebe 10
        q3.x = 2; // x de q3 recebe 2
        q3.y = 3; // y de q3 recebe 3
        q3.imprime(); // "x = 2 \n y = 3"
    }
}
