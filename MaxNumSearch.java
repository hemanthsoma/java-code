import java.util.*;
public class MaxNumSearch
{
  public static void main(String[] args)
  {
    int a = 8,b = 4,c = 9;
    int max;
    max = (a>b)?(a>c?a:c):(b>c?b:c);
    System.out.println("Maximum Search " + max);
  }
}
