package OSproject;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProcedureCall {
  
  // The definition of all procedures
  public static void procedure0(){
    int a = 0;
    a += 5;
    return;
  }
  
  public static void procedure1(int a1){
    return;
  }
  
  public static void procedure2(int a1,int a2){
    return;
  }
  
  public static void procedure3(int a1,int a2,int a3){
    return;
  }
  
  public static void procedure4(int a1,int a2,int a3,int a4){
    return;
  }
  
  public static void procedure5(int a1,int a2,int a3,int a4,int a5){
    return;
  }
  
  public static void procedure6(int a1,int a2,int a3,int a4,int a5,int a6){
    return;
  }
  
  public static void procedure7(int a1,int a2,int a3,int a4,int a5,int a6,int a7){
    return;
  }
  
  
  public static void main(String[] args) throws InterruptedException{
    final int loops1 = 5;
    final int loops2 = 10;
    final int loops3 = 20;
    
    Date startTime = new Date();
    double start = System.nanoTime();
    for(int i=0 ;i<12345; i++){
      //procedure0();
    }
    Date finishTime = new Date();
    double end = System.nanoTime();
    double diff = finishTime.getTime() - startTime.getTime();
    System.out.println(end - start);
  }
}
