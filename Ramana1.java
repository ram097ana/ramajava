/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int a;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the value of a :");
	  a=s.nextInt();
	  if (a>0)
	  {
	  	System.out.println("the entered value of a is positive");
	  }else{
	  	
	  if (a<0)
	  {
	  	System.out.println("the entered value of a is negative");
	  }
	  else
	  {
	  	System.out.println("the entered value is zero");
	  }}
	}
	
}