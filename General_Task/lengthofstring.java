import java.util.Scanner;
class lengthofstring{
public static void main(String args[]){
System.out.println("enter alphaNumeric with special character its able to identify length");
Scanner sc=new Scanner(System.in);
StringBuilder sb=new StringBuilder();
sb.append(sc.nextLine());
System.out.println(sb.length());
}
}