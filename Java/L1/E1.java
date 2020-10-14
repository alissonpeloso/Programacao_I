//1) Dado o código da classe abaixo:

class BlurayDisc {
    private String rotulo;
    protected int id;
    protected float densidade;
    public char[] dados;

    public BlurayDisc(String rotulo, int id) {
        setIdentificação(rotulo, id);
        this.dados = new char[4096];
    }
    public void setIdentificação(String rotulo, int id) {
        this.rotulo = rotulo;
        this.id = id;
    }
    private String getRotulo() {
        return this.rotulo;
    }
}


// Dadas as variáveis abaixo, indique se cada uma dos comandos seguintes funciona. Se houver algum erro nesses comandos, diga qual é esse erro (e justifique).
// BlurayDisc c;
// BlurayDisc h = new BlurayDisc("Teste", 1);
// String st = "teste";
// float num;

// a) c.dados[10] = ' i ';                        | Não funciona, não há alocação de espaço para o c
// b) h.setIdentificacao(st, num);                | Não funciona, num precisa ser inteiro
// c) c.setIdentificacao(12, "Outro rótulo");     | Não funciona, não há alocação de espaço para o c
// d) c = new BlurayDisc();                       | Não funciona, não há construtor vazio
// e) h.rotulo = "Outro rótulo";                  | Não funciona, rotulo é uma váriavel privada
// f) num = 2.34f;                                | Ok, num recebe 2.34
// g) num = h.densidade;                          | Ok, num recebe o valor de h.densidade
// h) st = h.getRotulo();                         | Não funciona, getRotulo é privado
// i)c = new BlurayDisc(st, 234);                 | Ok, c é alocado e c.rotulo = st, c.id = 234 e c.dados recebe "4096"
// j) c.dados[100] = "Dado posição 100";          | Não funciona, c não foi alocado

public class E1{
        public static void main(String[] args) {
        BlurayDisc c; //Cria um objeto de classe BlurayDisc, porém não aloca espaço
        BlurayDisc h = new BlurayDisc("Teste", 1);//Cria um objeto de classe BlurayDisc, h.rotulo = "Teste" e h.id = 1
        String st = "teste"; //Cria Strig com valor "teste"
        float num; //Cria um float num, recebe valor NULL
    }
}