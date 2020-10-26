// 3) Dado o código das classes abaixo, qual será a saída do programa na tela? Justifique.

//A saída será goodbye\n hello. Entra no contructor principal printando "goodbye". depois, entra no contructor com int de parametro e chama a mesma função com uma string "hello" como parâmetro que acaba chamando o constructor com string que printa o parametro.

class Tester {
    private int var;
    public Tester(double var) { this.var = (int)var; }
    public Tester(int var) { this("hello"); }
    public Tester() { System.out.println("good­bye"); }
    public Tester(String s) {
        this();
        System.out.println(s);
    }
}
    class MainTester {
    public static void main(String[] args) {
        Tester t = new Tester(5);
    }
}
