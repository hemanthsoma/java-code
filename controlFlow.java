import java.util.*;
public class controlFlow
{
  public static void main(String[] args) {
    System.out.println("-------If Statements--------");
    int num = 10;
    //If Condition
    if(num>8)
    {
      System.out.println("If "+"-"+"True");
    }
    //If-else
    else if(num>=10)
    {
      System.out.println("else if "+"-"+"True");
    }
    //else
    else
    {
      System.out.println("else "+"-"+"False");
    }
    //Switch Statement
    System.out.println("-------Switch Statement-------");
    switch(num)
    {
      case 0:
      System.out.println("Num is +ve");
      break;
      case 1:
      System.out.println("Num is -ve");
      break;
      default:
      System.out.println(num);
    }
    System.out.println("-------For Statement------");
    //For loop
    for(int i=1;i<=num;i++){
      System.out.print(i+" ");
    }
    System.out.println(" ");
    //for each
    System.out.println("-------For each Statement-------");
    String arr[]={"rock","paper","scissor"};
    for(String var:arr){
      System.out.println(var+" ");
    }
    //While Loop
    System.out.println("--------while Loop--------");
    while(num>0){
      num-=1;
      if(num==5){
        break;
      }
      else if(num==10){
        continue;
      }
      else{
        System.out.println(num);
      }
    }
    //do-while loop
    System.out.println("-----Do while loop------");
    num=0;
    do{
      System.out.println(num);

      num+=1;
    }
    while(num>0 && num<5);
  }
}
