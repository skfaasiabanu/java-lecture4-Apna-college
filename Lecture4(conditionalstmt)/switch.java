import java.util.*;
public class switch{
    public static void main(String args[])
    {

       Scanner sc=new Scanner(System.in);
       int item=sc.nextInt();
       switch(item)
       {
        case 1:System.out.println("samosa");
        break;
        case 2:System.out.println("biryani");
        break;
        case 3:System.out.println("sweets");
        break;
        default:System.out.println("we wake up");

       }
    }
}