/**
 * Exemplo de utilização das classes Acumulador e Arquivo.
 * 
 * @author Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
class Main {
    public static void main(String[] args) {
        Acumulador valores = new Acumulador();

        valores.soma(30);
        valores.soma(10);
        valores.soma(20);
        valores.soma(12);
        valores.soma(14);
        valores.soma(9);
        valores.soma(45);
        
        valores.divide(7);

        System.out.println("A média é: "+valores.getValor());

    }
}