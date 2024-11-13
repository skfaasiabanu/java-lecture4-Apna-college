import java.util.*;
public class fever{
    public static void main(String args[])
    {

       Scanner sc=new Scanner(System.in);
       double temp=sc.nextDouble();
       if(temp>=100) 
       {
        System.out.println("you are fevered");
       }
       else
       {
        System.out.println("you are not fevered");
       }
    }
}