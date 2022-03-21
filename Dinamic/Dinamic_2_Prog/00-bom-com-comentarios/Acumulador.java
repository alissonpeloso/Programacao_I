/**
 * Descreve um acumulador de para números de ponto flutuante. A classe permite
 * um valor inicial seja criado e, a partir disso, que várias operações sejam feitas
 * sobre esse valor, como somar ele com algum outro valor, multiplicar, etc.
 * 
 * @author Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
class Acumulador {
    /**
     * Valor do acumulador. Todas as operações feitas no acumulador irão
     * alterar o valor dessa propriedade.
     */
    private double valor;

    /**
     * Conta quantos valores o acumulador já recebeu até agora. Cada vez que
     * um dos métodos de operação for chamado, por exemplo soma(), o valor dessa
     * propriedade é incrementado em 1. Se setValor() for chamado, o valor dessa
     * propriedade é setado em 1 (o acumulador recebeu apenas um valor).
     */
    private int contagemValoresRecebidos;

    public Acumulador() {
        setValor(0);
    }

    /**
     * Instancia um objeto da classe e seta o valor inicial do acumulador.
     * 
     * @param v valor inicial do objeto.
     */
    public Acumulador(double v) {
        setValor(v);
    }

    /**
     * Obtem o valor atual do acumulador.
     * 
     * @return valor atual do acumulador
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * Altera o valor atual do acumulador para algum valor arbitrário.
     * 
     * @param v novo valor que o acumulador passará a ter
     */
    public void setValor(double v) {
        this.valor = v;
        this.contagemValoresRecebidos = 1;
    }

    /**
     * Multiplica o valor atual do acumulador por um valor arbitrário.
     * 
     * @param v valor que será multiplicado ao valor atual do acumulador.
     */
    public void multiplica(double v) {
        this.valor = this.valor * v;
        this.contagemValoresRecebidos++;
    }

   /**
     * Soma o valor atual do acumulador com um valor arbitrário.
     * 
     * @param v valor que será somado ao valor atual do acumulador.
     */
    public void soma(double v) {
        this.valor = this.valor + v;
        this.contagemValoresRecebidos++;
    }

    /**
     * Subtrai o valor atual do acumulador por um valor arbitrário.
     * 
     * @param v valor que será subtraído do valor atual do acumulador.
     */
    public void subtrai(double v) {
        this.valor = this.valor - v;
        this.contagemValoresRecebidos++;
    }

    /**
     * Divide o valor atual do acumulador por um valor arbitrário.
     * 
     * @param v valor que será dividido do valor atual do acumulador.
     */
    public void divide(double v) {
        this.valor = this.valor / v;
        this.contagemValoresRecebidos++;
    }

    /**
     * Retorna quantos valores o acumulador já recebeu até agora. Cada vez que
     * um dos métodos de operação for chamado, por exemplo soma(), o contador de valores
     * recebidos é incrementado em 1. Se setValor() for chamado, o contador de valores
     * recebidos é setado em 1 (o acumulador recebeu apenas um valor).
     * 
     * @return um inteiro que representa quantos valores o acumulador recebeu até agora.
     */
    public int getContagemValoresRecebidos() {
        return this.contagemValoresRecebidos;
    }
}