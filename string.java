import java.io.*;
import java.lang.*;
import java.util.Scanner;
class string{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
StringBuilder s2=new StringBuilder();
s2.append(s1);
s2=s2.reverse();
System.out.println(s2);
}
}
