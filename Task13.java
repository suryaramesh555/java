import java.util.Scanner;
class Task13{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the Number:");
String reverse = "";
String num = sc.nextLine();
int length = num.length();
for(int i =length-1;i>=0;i--)
reverse = reverse + num.charAt(i);
if(num.equals(reverse))
System.out.println("the entered string"+num+" is a palindrome");
else
System.out.println("the entered string"+num+" is not a palindrome");
}
}



