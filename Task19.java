import java.util.Scanner;
class Task19{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int x=-1,y=1,next;
int n=10;
for(int i=0;i<n;i++){
next =x+y;
System.out.println(next);
x=y;
y=next;
}
}
}