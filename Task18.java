import java.util.Scanner;
class Task18{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter a first number");
int num1 = scan.nextInt();
System.out.println("enter a second number");
int num2 = scan.nextInt();
System.out.println("enter a option");
String str=scan.next();
switch(str){
case "add":
    System.out.println("result: "+(num1+num2));
	break;
case "sub":
    System.out.println("result: "+(num1-num2));
	break;
case "mul":
    System.out.println("result: "+(num1*num2));
	break;
case "div":
    System.out.println("result: "+(num1/num2));
	break;
case "mod":
    System.out.println("result: "+(num1%num2));
	break;
default:
	System.out.println("enter the valid option");

}
}
}