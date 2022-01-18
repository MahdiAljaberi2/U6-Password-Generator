import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    File fileName1 = new File("Lower.txt");
    File fileName2 = new File("Upper.txt");
    File fileName3 = new File("Mixed_letters.txt");
    File fileName4 = new File("Mixed_letters_numbers.txt");
    File fileName5 = new File("Mixed_chars.txt");

    System.out.println("\nAdvanced Password Generator:\n");
    System.out.println("Select the type of password you want to generate.\n");

    System.out.println("1 - Lowercase Letters\n2 - Uppercase Letters\n3 - Lowercase and Uppercase Letters\n4 - Lowercase, Uppercase, and Numbers\n5 - Uppercase, Lowercase, Numbers, and Symbols\n0 - Exit\n");
    int input=scan.nextInt();
    if (input==1)
    {
      
    }
    else if (input==2)
    {

    }
    else if (input==3)
    {

    }
    else if (input==4)
    {

    }
    else if (input==5)
    {

    }
    else if (input==0)
    {

    }
    else
    {
      System.out.println("Invalid Entry. Please try again.\n");
    }





  
  }
}