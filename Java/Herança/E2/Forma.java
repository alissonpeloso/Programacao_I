public class Forma extends Entidade{
    private int x;
    private int y;
    public void imprimePosicao(){
        System.out.println("x: " +this.x+" | y: "+this.y);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
