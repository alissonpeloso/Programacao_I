/**
 * Descreve as propriedades de um arquivo, como nome, conteúdo, etc.
 * A classe disponibiliza métodos para manipulação dos elementos do
 * arquivo, como alteração de uma linha, contagem de quantas linhas
 * existem, etc.
 * 
 * @author Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */
class Arquivo {
    /**
     * Nome do arquivo, e.x.: "teste.txt"
     */
    private String nome;

    /**
     * Caminho do arquivo no sistema de arquivos, e.x.: "/home/fulano/" 
     */
    private String caminho;

    /**
     * Vetor com o conteúdo de cada linha do arquivo.
     * A entrada 0 no vetor, por exemplo, se refere à primeira linha do arquivo.
     */
    private String[] linhas;

    /**
     * Testa se o indice informado é válido para acessar o vetor de linhas da classe.
     * 
     * @param indice valor inteiro que representa o indica
     * @return true se o valor do incide é válido, ou false caso contrário.
     */
    private boolean ehIndiceValido(int indice) {
        if(indice < 0 || indice > quantasLinhas()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Instancia um objeto arquivo cujo nome e caminhos são desconhecidos.
     * O conteúdo do arquivo é inicializado como uma única linha cujo valor é "?".
     */
    public Arquivo() {
        this("?", "?", new String[1]);
        setLinha(0, "?");
    }

    /**
     * Instancia um objeto arquivo cujo conteúdo é informado através de parâmetros.
     * 
     * @param nome nome do arquivo, ex.: "teste.txt"
     * @param caminho caminho do arquivo no sistema de arquivos, ex.: "/home/fulano/"
     */
    public Arquivo(String nome, String caminho) {
        this(nome, caminho, new String[1]);
    }

    /**
     * Instancia um objeto arquivo cujo conteúdo é informado através de parâmetros.
     * 
     * @param nome nome do arquivo, ex.: "teste.txt"
     * @param caminho caminho do arquivo no sistema de arquivos, ex.: "/home/fulano/"
     * @param linhas vetor de strings que descreve o conteúdo do arquivo.
     */
    public Arquivo(String nome, String caminho, String[] linhas) {
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