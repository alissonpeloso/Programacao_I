import java.util.*;

public class Ex1{

  public static void getDay(Data cl){
    Scanner scan = new Scanner(System.in);
    System.out.printf("Insira o dia de hoje: ");
    String Date = scan.nextLine();
    String[] DateArray = Date.split("/");
    int day = Integer.parseInt(DateArray[0]);
    int month = Integer.parseInt(DateArray[1]);
    cl.day = day;
    cl.month = month;
  }

  public static void getHours(Data cl){
    Scanner scan = new Scanner(System.in);
    System.out.printf("Insira a hora: ");
    String Clock = scan.nextLine();
    String[] ClockArray = Clock.split(":");
    int hour = Integer.parseInt(ClockArray[0]);
    int min = Integer.parseInt(ClockArray[1]);
    cl.hour = hour;
    cl.min = min;
  }

  public static void main(String args[]){
    Data h = new Data();
    getDay(h);
    getHours(h);
    h.printTime();
    h.printampm();
  }
}
