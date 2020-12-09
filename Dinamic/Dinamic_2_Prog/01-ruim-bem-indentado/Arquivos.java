class Arquivos {
    private String[] n;
    private String[] p;
    private String[] ls;

    public Arquivos(String n, String p, String[] ls) {
        this.n = new String[4];
        this.p = new String[4];
        this.ls = ls;

        for(int i = 0; i < 4; i++) {
            this.n[i] = "linha";
            this.p[i] = "linha";
        }
    }

    public String getn(int i) {
        return this.n[i];
    }

    public void setn(String n, int i) {
        i = i >= ls.length - 1 ? ls.length - 1 : i;
        this.n[i] = n;
    }

    public String getp(int i) {
        return this.p[i];
    }

    public void setCaminho(String n, int i) {
        i = i >= ls.length - 1 ? ls.length - 1 : i;
        this.p[i] = n;
    }

    public String getNome() {
        return this.n[3];
    }

    public String[] ls() {
        return this.ls;
    }

    public String linha(int i, int n) {
        return this.ls[i - n];
    }

    public void imprime() {
        System.out.println("{" +
            " n='" + getn(0) + "'" +
            ", p='" + getp(0) + "'" +
            ", linhas='" + this.ls.length + "'" +
            "}"
        );
    }


}