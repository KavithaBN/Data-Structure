package eclipsepackage;

import java.util.*;

public class swapwithouttemp{

public static void main(String[] args)
{

System.out.println("enter the values of A and B\n");
Scanner number = new Scanner(System.in);
int a= number.nextInt();
int b= number.nextInt();

System.out.println("The values entered for A and B are"+a+":"+ +b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("the values after swapping are"+a +":"+ +b);
}
}