import java.util.Scanner;
class Task17{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter a odd Number");
int num = scan.nextInt();
int a = 0;
for(int i=0; i<=num;i++){
if(!(i%2==0))
{
a+=i;
System.out.println(i);
}
}
System.out.println("the sum is :"+a);
}
}