import java.util.Scanner;
class Task11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the Number:");
int num = sc.nextInt();
int i=1,fact=1;
while(i<num)
{
fact=fact*i;
i++;
}
System.out.println("factorial of the number:"+fact);
}
}