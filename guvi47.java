import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	int a[]=new int[] {7,3,2};
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		if(min>a[i])
		{
			min=a[i];
		}
	}
		System.out.println("max num is"+max);
			System.out.println("min num is"+min);
		}
		}
