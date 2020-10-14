public class Data{
  public int month;
  public int day;
  public int hour;
  public int min;

  public void printTime(){
    System.out.printf("%d/%d - %d:%d\n", this.day, this.month, this.hour, this.min);
  }

  public void printampm(){
    if(this.hour < 12){
      System.out.println("AM");
    }
    else{
      System.out.println("PM");
    }
  }
}
