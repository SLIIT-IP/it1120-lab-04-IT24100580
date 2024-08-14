import java.util.Scanner;
   public class IT24100580LAB4Q1{
     public static void main(String[] arg){



       Scanner input=new Scanner(System.in);
       int number;
       String status;
 
       System.out.print("Enter a Number:");
       number=input.nextInt();

       if(number==0)
         status="zero";
       else if(number<0)
         status="negetive";
      else
         status="positive";

       System.out.print("the number is:"+status);
  }
}