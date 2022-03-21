class ErroHoraNegativa extends Exception{
    public String getMessage() {
        return "A hora não pode ser negativa nem maior que 23";
    }
}

class ErroMinutoNegativo extends Exception{
    public String getMessage() {
        return "O minuto não pode ser negativo nem maior que 59";
    }
}

class ErroSegundoNegativo extends Exception{
    public String getMessage() {
        return "O segundo não pode ser negativo nem maior que 59";
    }
}

class Data{
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setHora(int hora) throws ErroHoraNegativa {
        if(hora < 0 || hora > 23){
            throw new ErroHoraNegativa();
        }
        this.hora = hora;
    }
    public void setMinuto(int minuto) throws ErroMinutoNegativo {
        if(minuto < 0 || minuto > 59){
            throw new ErroMinutoNegativo();
        }
        this.minuto = minuto;
    }
    public void setSegundo(int segundo) throws ErroSegundoNegativo{
        if(segundo < 0 || segundo > 59){
            throw new ErroSegundoNegativo();
        }
        this.segundo = segundo;
    }
}

class Main{
    public static void main(String[] args) {
        Data d = new Data();

        try {
            d.setHora(-2);
            d.setMinuto(35);
            d.setSegundo(22);
            System.out.printf("Data (porém são só as horas): %d:%d:%d\n", d.getHora(),d.getMinuto(),d.getSegundo());
        } 
        catch (ErroHoraNegativa e) {
            System.out.println(e.getMessage());
        } 
        catch (ErroMinutoNegativo e1){
            System.out.println(e1.getMessage());
        } 
        catch (ErroSegundoNegativo e2){
            System.out.println(e2.getMessage());
        }        
    }
}