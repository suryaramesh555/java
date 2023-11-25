import java.util.Scanner;
class Task5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number1");
int num1 = sc.nextInt();
System.out.println("enter a number2");
int num2 = sc.nextInt();
System.out.println("before swapping num1:"+num1);
System.out.println("before swapping num2:"+num2);
 num1=num1+num2;
 num2=num1-num2;
 num1=num1-num2;
System.out.println("after swapping num1:"+num1);
System.out.println("after swapping num2:"+num2);
}
}