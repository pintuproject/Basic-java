class palindrome{
public static void main(String[] args)
{
int n=123;

int remainder,initial,result=0;
initial=n;
while(n!=0)
{
remainder=n%10;
result=result*10+remainder;
n=n/10;
}
if(result==initial)
System.out.println(" palindrome Number");
else
System.out.println(" not a palindrome Number");
}
}