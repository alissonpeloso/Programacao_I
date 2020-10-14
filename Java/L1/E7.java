// 7) Dadas as classes abaixo:

class Var {
    public int valor;
    public String nome;
}
class Dicionario {
    public static Var tabela[];
}

// Implemente o método estático getVariavelByNome() na classe Dicionario. Esse método recebe como
// parâmetro uma String e retorna um objeto do tipo Var. O método procura dentro do vetor tabela por uma
// entrada cujo campo nome seja igual à String passada como parâmetro. Se encontrar um objeto Var que tenha o nome
// igual ao parâmetro, retorna esse objeto, caso contrário retorna null.