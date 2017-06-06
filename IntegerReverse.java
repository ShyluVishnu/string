import java.io.*;
import java.util.Scanner;
class IntegerReverse
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String num2=Integer.toString(num);
        StringBuilder rev=new StringBuilder();
        rev.append(num2);
        rev=rev.reverse();
        System.out.println(rev);
    }
}
