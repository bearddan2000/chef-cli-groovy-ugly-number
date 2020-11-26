#!/usr/bin/env groovy

class UglyNumber {
/*This function divides a by greatest
	 divisible power of b*/
	 def maxDivide(int a, int b)
	 {
			 while(a % b == 0)
					 a = a/b;
			 return a;
	 }

	 /* Function to check if a number
	 is ugly or not */
	 def isUgly(int no)
	 {
			 no = maxDivide(no, 2);
			 no = maxDivide(no, 3);
			 no = maxDivide(no, 5);

			 return (no == 1)? 1 : 0;
	 }

	 /* Function to get the nth ugly
	 number*/
	 def getNthUglyNo(int n)
	 {
			 int i = 1;

			 // ugly number count
			 int count = 1;

			 // check for all integers
			 // until count becomes n
			 while(n > count)
			 {
					 i++;
					 if(isUgly(i) == 1)
							 count++;
			 }
			 return i;
	 }

	// Driver code
	def main(String[] args)
	{
		int limit = 150;
    println "[INPUT] " + limit
		int no = getNthUglyNo(limit);
		System.out.println("[OUTPUT] ugly " + "no. is "+ no);
	}
}
new UglyNumber().main()
