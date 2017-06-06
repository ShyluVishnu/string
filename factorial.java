import java.io.*;
import java.util.Scanner;
class factorial
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int fact=1;
while(num!=0)
{
fact=fact*num;
num--;
}
System.out.println(fact);
}
}
