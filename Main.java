import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{

    File fileName1 = new File("Lower.txt");
    PrintWriter outFile1 = new PrintWriter(fileName1);

    for (int i=0;i<1000;i++)
    {
      outFile1.println((int)((Math.random()*26)+97));
    }
    outFile1.close();

    Scanner fileScan1 = new Scanner(fileName1);
    int[] lowerInts=new int[1000];
    
    int index1=0;
    while(fileScan1.hasNextInt())
    {
      lowerInts[index1]=fileScan1.nextInt();
      index1++;
    }
    fileScan1.close();

    char[] lower=new char[1000];
    for (int i=0;i<1000;i++)
    {
      lower[i]=(char)lowerInts[i];
    }

    File fileName2 = new File("Upper.txt");
    PrintWriter outFile2 = new PrintWriter(fileName2);
    
    for (int i=0;i<1000;i++)
    {
      outFile2.println((int)((Math.random()*26)+65));
    }
    outFile2.close();

    Scanner fileScan2 = new Scanner(fileName2);
    int[] upperInts=new int[1000];
    
    int index2=0;
    while(fileScan2.hasNextInt())
    {
      upperInts[index2]=fileScan2.nextInt();
      index2++;
    }
    fileScan2.close();

    char[] upper=new char[1000];
    for (int i=0;i<1000;i++)
    {
      upper[i]=(char)upperInts[i];
    }

    File fileName3 = new File("Mixed_letters.txt");
    PrintWriter outFile3 = new PrintWriter(fileName3);
    for (int i=0;i<1000;i++)
    {
      int r=(int)(Math.random()*2);
      if (r==1)
      {
      outFile3.println((int)((Math.random()*26)+97));
      }
      else
      {
      outFile3.println((int)((Math.random()*26)+65)); 
      }
    }
    outFile3.close();

    Scanner fileScan3 = new Scanner(fileName3);
    int[] mixedLetInts=new int[1000];
    
    int index3=0;
    while(fileScan3.hasNextInt())
    {
      mixedLetInts[index3]=fileScan3.nextInt();
      index3++;
    }
    fileScan3.close();

    char[] mixed=new char[1000];
    for (int i=0;i<1000;i++)
    {
      mixed[i]=(char)mixedLetInts[i];
    }

    File fileName4 = new File("Mixed_letters_numbers.txt");
    PrintWriter outFile4 = new PrintWriter(fileName4);
    for (int i=0;i<1000;i++)
    {
      int r=(int)(Math.random()*3);
      if (r==2)
      {
      outFile4.println((int)((Math.random()*26)+97));
      }
      else if (r==1)
      {
      outFile4.println((int)((Math.random()*26)+65)); 
      }
      else
      {
      outFile4.println((int)((Math.random()*10)+48));
      }
    }
    outFile4.close();

    Scanner fileScan4 = new Scanner(fileName4);
    int[] mixedLetNumInts=new int[1000];
    
    int index4=0;
    while(fileScan4.hasNextInt())
    {
      mixedLetNumInts[index4]=fileScan4.nextInt();
      index4++;
    }
    fileScan4.close();

    char[] mixedNum=new char[1000];
    for (int i=0;i<1000;i++)
    {
      mixedNum[i]=(char)mixedLetNumInts[i];
    }

    File fileName5 = new File("Mixed_chars.txt");
    PrintWriter outFile5 = new PrintWriter(fileName5);
    for (int i=0;i<1000;i++)
    {
      outFile5.println((int)((Math.random()*94)+33));
    }
    outFile5.close();

    Scanner fileScan5 = new Scanner(fileName5);
    int[] allCharsInts=new int[1000];
    
    int index5=0;
    while(fileScan5.hasNextInt())
    {
      allCharsInts[index5]=fileScan5.nextInt();
      index5++;
    }
    fileScan5.close();

    char[] allChars=new char[1000];
    for (int i=0;i<1000;i++)
    {
      allChars[i]=(char)allCharsInts[i];
    }

    Scanner scan = new Scanner(System.in);

    System.out.println("\nAdvanced Password Generator:\n");
    System.out.println("Select the type of password you want to generate.\n");

    System.out.println("1 - Lowercase Letters\n2 - Uppercase Letters\n3 - Lowercase and Uppercase Letters\n4 - Lowercase, Uppercase, and Numbers\n5 - Uppercase, Lowercase, Numbers, and Symbols\n0 - Exit\n");
    int input=scan.nextInt();
    if (input==1)
    {
      File fileName6=new File("Lowerpw.txt");
      PrintWriter outFile6 = new PrintWriter(fileName6);
      for (int i=0;i<1000;i++)
      {
      if ((i!=0) && (i%8==0))
      {
        outFile6.println();
      }
      outFile6.print(lower[i]);
      }
      outFile6.close();
      System.out.println("Your passwords have been generated.");
    }
    else if (input==2)
    {
      File fileName7=new File("Upperpw.txt");
      PrintWriter outFile7 = new PrintWriter(fileName7);
      for (int i=0;i<1000;i++)
      {
      if ((i!=0) && (i%8==0))
      {
        outFile7.println();
      }
      outFile7.print(upper[i]);
      }
      outFile7.close();
      System.out.println("Your passwords have been generated.");
    }
    else if (input==3)
    {
      File fileName8=new File("Mixedpw.txt");
      PrintWriter outFile8 = new PrintWriter(fileName8);
      for (int i=0;i<1000;i++)
      {
      if ((i!=0) && (i%8==0))
      {
        outFile8.println();
      }
      outFile8.print(mixed[i]);
      }
      outFile8.close();
      System.out.println("Your passwords have been generated.");
    }
    else if (input==4)
    {
      File fileName9=new File("MixedNumpw.txt");
      PrintWriter outFile9 = new PrintWriter(fileName9);
      for (int i=0;i<1000;i++)
      {
      if ((i!=0) && (i%8==0))
      {
        outFile9.println();
      }
      outFile9.print(mixedNum[i]);
      }
      outFile9.close();
      System.out.println("Your passwords have been generated.");
    }
    else if (input==5)
    {
      File fileName10=new File("AllCharspw.txt");
      PrintWriter outFile10 = new PrintWriter(fileName10);
      for (int i=0;i<1000;i++)
      {
      if ((i!=0) && (i%8==0))
      {
        outFile10.println();
      }
      outFile10.print(allChars[i]);
      }
      outFile10.close();
      System.out.println("Your passwords have been generated.");
    }
    else if (input==0)
    {
    System.out.println("Thank you for using our service.");
    }
    else
    {
      System.out.println("Invalid Entry. Please try again.\n");
    }
  }
}