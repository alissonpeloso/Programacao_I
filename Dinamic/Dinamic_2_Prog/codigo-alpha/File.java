/**
 * Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
class File {
    private String nome;
    private String caminho;
    private String[] linhas;

    private boolean ehIndiceValido(int indice) {
        if(indice < 0 || indice > quantasLinhas()) {
            return false;
        } else {
            return true;
        }
    }

    public File() {
        this("?", "?", new String[1]);
        setLinha(0, "?");
    }

    public File(String nome, String caminho) {
        this(nome, caminho, new String[1]);
    }

    public File(String nome, String caminho, String[] linhas) {
        this.nome = nome;
        this.caminho = caminho;
        this.linhas = linhas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String[] getLinhas() {
        return this.linhas;
    }

    public String getLinhaPeloIndice(int indice) {
        if(ehIndiceValido(indice) == false) {
            return null;
        }

        return this.linhas[indice];
    }

    public int quantasLinhas() {
        return this.linhas.length;
    }

    public void setLinhas(String[] linhas) {
        this.linhas = linhas;
    }

    public boolean setLinha(int indice, String valor) {
        if(ehIndiceValido(indice) == false) {
            return false;
        }

        this.linhas[indice] = valor;
        return true;
    }

    /**
     * Retorna uma representação em texto do objeto arquivo. A representação é
     * no formato "{nome='XYZ', caminho='XYZ', linhas=DD}", por exemplo:
     * 
     *   {nome='teste.txt', caminho='/home/fulano/', linhas=30}
     * 
     * Você pode usar esse método implicitamente quanto imprimir um objeto arquivo.
     * Ex.:
     *   Arquivo a = new Arquivo();
     *   System.out.println(a); // imprime {nome='?', caminho='?', linhas=1}
     */
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", caminho='" + getCaminho() + "'" +
            ", linhas='" + getLinhas().length + "'" +
            "}";
    }


}