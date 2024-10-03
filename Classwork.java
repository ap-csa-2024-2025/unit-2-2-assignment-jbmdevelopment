import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item = sc.nextLine();
    System.out.println("How many are you buying??");
    int amount = sc.nextInt();
    System.out.println("How much does each one weigh?"); // 11, 3.75, 41.25
    double weight = sc.nextDouble();
    System.out.println(item + " at " + weight + " pounds each will weigh " + (amount * weight) + " pounds total");
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\" \nAda Lovelace\nThe first computer programmer");
    System.out.println("(\\(\\) \n(- -) \n((') ('))");
  }
}
