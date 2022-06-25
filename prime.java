class prime{
public static void main(String[] args)
{
int number=19;
int n1=number/2;
int i,count=0;
for(i=2;i<=n1;i++)
{
if(number%i==0)
{
System.out.println("not a prime number");
count=1;
break;
}
}
if(count==0)
System.out.println("prime numbver");
}
}