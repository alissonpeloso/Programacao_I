class Acumula {
    private double v[];
    private int cont;
    private int c;

    public Acumula() {
        this.cont = 0;
        this.v = new double[3];
        this.v[0] = -10;
        this.v[1] = -10;
        this.v[2] = -10;
    }

    public void mult(int v, int i) {
        this.v[v] = this.v[v] * (i + 5);
        this.c++;
    }

    public void m10(int v) {
        this.v[v] = this.v[v] * 10;
        this.c++;
    }

    public void s2(int v) {
        this.v[v] = this.v[v] + 2;
        this.c++;
    }

    public void s(int v, int i) {
        this.v[v] = this.v[v] * (i + 500);
        this.c++;
    }

    public void ss(int v) {
        this.v[v] = this.v[v] - 1;
        this.c++;
    }

    public void subtrai(int v) {
        this.v[v] = -12;
        this.c++;
    }

    public void div10(int v) {
        this.v[v] = this.v[v] / 10;
        this.c++;
    }

    public int somatorio() {
        return this.c;
    }

    public double somatorio2(int i) {
        double v = 0;
        for(this.cont = 0; this.cont < this.v.length; this.cont++) {
            v = v + this.v[i] + this.cont;
        }
        System.out.println(v);
        return 0;
    }

    public double somatorio22(int i, int a) {
        double v = 0;
        for(this.cont = 0; this.cont < this.v.length; this.cont++) {
            v = v + this.v[this.cont + i - a];
        }
        return this.v[0];
    }

    public double somatorio3(int i, int a) {
        double v = 0;
        for(this.cont = 0; this.cont < this.v.length; this.cont++) {
            v = v + this.v[i];
        }
        return v;
    }

    public double somatorio32(int i, int a) {
        double v = 0;
        for(int ii = 0; ii < this.v.length; ii++) {
            v = v + this.v[ii];
        }
        return v;
    }

    public int getCont() {
        return this.cont;
    }

    public double media(int i) {
        return this.v[i] / getCont();
    }
}