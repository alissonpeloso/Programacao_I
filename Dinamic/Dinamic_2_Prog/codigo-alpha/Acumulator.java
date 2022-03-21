/**
 * Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
class Acumulator {
    private double valor;
    private int contagemValoresRecebidos;

    public Acumulator() {
        setValor(0);
    }

    public Acumulator(double v) {
        setValor(v);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double v) {
        this.valor = v;
        this.contagemValoresRecebidos = 1;
    }

    public void multiplica(double v) {
        this.valor = this.valor * v;
        this.contagemValoresRecebidos++;
    }

    public void soma(double v) {
        this.valor = this.valor + v;
        this.contagemValoresRecebidos++;
    }

    public void subtrai(double v) {
        this.valor = this.valor - v;
        this.contagemValoresRecebidos++;
    }

    public void divide(double v) {
        this.valor = this.valor / v;
        this.contagemValoresRecebidos++;
    }

    public int getContagemValoresRecebidos() {
        return this.contagemValoresRecebidos;
    }
}