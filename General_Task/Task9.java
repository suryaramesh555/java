import java.util.Scanner;
class Task9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a seconds");
int sec = sc.nextInt();
System.out.println("minutes="+(sec/60));
System.out.println("hour="+(sec/3600));
}
}