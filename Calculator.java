import java.io.*;

class Calculator
{
public static void main(String args[]) throws IOException

{
 
 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 float x,y;
   String s;
 
   char c,c1;
 
 do
{
 br= new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Assign value to first number x = ");
  x=Float.parseFloat(br.readLine());


  System.out.print("Assign value to second number y = ");
  y=Float.parseFloat(br.readLine());

  System.out.print("Choose your operator: " );
  c=(char)br.read();

switch(c)
{

case '+': System.out.println("Addition of x and y= " +(x+y));
break;
case '-': System.out.println("Substraction of x and y= " +(x-y));
break;
case '*': System.out.println("Multiplication of x and y= "+(x*y));
break;
case '%': System.out.println("Modulus of x and y= " +(x%y));
break;
case '/': System.out.println("Division of x and y= " +(x/y));
break;
default: System.out.println("Enter a valid operator(+,-,%,*,/)");
}

br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Calculate again? y or n");
c1=(char)br.read();
}
while(c1=='y');

br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("Thank you for using calculator, please give your feedback: ");
s=br.readLine(); 


System.out.println("Feedback Recieved!!, Do visit again :-D"); 

}

}