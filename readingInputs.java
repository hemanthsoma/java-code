import java.util.*;
public class readingInputs
{
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String firstName = read.nextLine();
    String secondName = read.nextLine();
    int age = read.nextInt();
    System.out.println("FirstName : "+firstName);
    System.out.println("SecondName : "+secondName);
    System.out.println("Age : "+age);
  }
}
