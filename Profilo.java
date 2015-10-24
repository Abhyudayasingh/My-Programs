import java.io.*;
import java.lang.*;
class Profilo
{
public static void main(String args[]) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
char c, c1, c2;
String s, s1;
int x;


do
{
br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Welcome to Profilo, enter your name:" );
s=br.readLine();

System.out.print("Sex(M/F):" );
c=(char)br.read();

System.out.print("Enter you age:");
br=new BufferedReader(new InputStreamReader(System.in));
x=Integer.parseInt(br.readLine());

System.out.println("Tell us about yourself:" );
s1=br.readLine();

System.out.println("Thank you "+ s.toUpperCase() +", your details are in our database now :-)");
 
System.out.print("Want to review: y/n ?");
c1=(char)br.read();

if(c1=='y')

{
System.out.println("Name: "+s);
System.out.println("Sex:" +c);
System.out.println("Age:" +x);
System.out.println("About:" +s1);
}
else System.out.println("Seems perfect then!");


System.out.print("Want to add a new profile?? (y/n):- ");
br= new BufferedReader(new InputStreamReader(System.in));
c2=(char)br.read();
}
while(c2=='y');

System.out.println("Thank you for using Profilo, do visit again :-D");
}
}
