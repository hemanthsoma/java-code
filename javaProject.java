import java.util.*;
public class javaProject
{
  public static void main(String[] args) {
    Customer c1 = new Customer();
    Customer c2 = new Customer("CustomerName2");
    c1.display();
    c2.display();
    c1.personName();
    System.out.println(c1.noOfCustomer(1));
    System.out.println(c1.noOfCustomer(1,1));
  }
}
class Customer
{
  static String details = "Customer Details";
  final String name = "CustomerName";
  private String mulName;
  static{
    System.out.println(details);
  }
  void personName()
  {
    System.out.println(name);
  }
  public Customer()
  {
    mulName = "CustomerName1";
  }
  public Customer(String name2)
  {
    mulName = name2;
  }
  public void display()
  {
    System.out.println("Customer Name : "+mulName);
  }
  static int noOfCustomer(int a){return a;}
  static int noOfCustomer(int a,int b){return a+b;}
}
