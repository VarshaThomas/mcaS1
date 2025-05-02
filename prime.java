public class prime extends Thread{
int num;
public prime(int n){
this.num=n;
}
public void run(){
int x,y,flag;
System.out.println("All the prime numbers within 1 and " + num + " are:");
for (x = 1;x <= num;x++){
if(x==1 || x==0)
continue;
flag = 1;
for (y=2;y<=x/2;++y) {
if(x%y==0) {
flag = 0;
break;
}
}
if (flag == 1)
System.out.print("\n prime number ="+x + "  ");
}
}
}