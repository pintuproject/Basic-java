class CheckEvenOddSwitch{
public static void main (String args[]){
int num1=100;

switch(num1%2){//this will return 0
case 0:
    System.out.println(num1+" is an Even number");
    break;
case 1:
    System.out.println(num1+" is an Odd number");
}
}
}