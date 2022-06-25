class armstrong{
public static void main(String[] args)
{
int n=153;

int remainder,initial,result=0;
initial=n;
while(n!=0)
{
remainder=n%10;
result+=Math.pow(remainder,3);
n=n/10;
}
if(result==initial)
System.out.println("Armstrong Number");
else
System.out.println(" not a Armstrong Number");
}
}
