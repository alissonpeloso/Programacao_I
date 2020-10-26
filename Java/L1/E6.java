import java.time.chrono.MinguoChronology;

// 6) Implemente uma classe chamada Parser que contenha um método estático analize(). O método deve receber
// como parâmetro um vetor de Strings e retornar quantas vezes a palavra "token" ou qualquer outra palavra que
// inicie pela letra 'h' aparecem no vetor.

class Parser{
    static public int analise(String vetor[]){
        int count = 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].equals("token") || vetor[i].startsWith("h")){
                count++;
            }

        }
        return count;
    }
}

public class E6{
    public static void main(String[] args) {
        String s[] = {"token", "alisson", "token", "home", "hoken"};
        System.out.println(Parser.analise(s));
    }
}