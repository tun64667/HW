public class HW1{
	public static void main(String[] args){
		System.out.println("PROBLEM 1");
                //Make(declare) four integer variables a, b, c, and d with values 1, 2, 2, and 5.
                //Print the following:
                //The numerator of the first fraction is [PUT VARIABLE a HERE]
                //The denominator of the first fraction is [PUT VARIABLE b HERE]
                //The numerator of the second fraction is [PUT VARIABLE c HERE]
                //The denominator of the second fraction is [PUT VARIABLE d HERE]
                //Then, print the value of the numerator and denominator of the sum of the two fractions.
                //The command to print is System.out.println(THING TO PRINT);

                //code goes here
                int a = 1, b = 2, c = 2, d = 5;
                
                System.out.println("The numerator of the first fraction is " + a);
                System.out.println("The denominator of the first fraction is " + b);
                System.out.println("The numerator of the second fraction is " + c);
                System.out.println("The denominator of the second fraction is " + d);
                System.out.println("The numerator is 9 and the denominator is 10");

                System.out.println("PROBLEM 2");
                //Make a double F with a value of 50.0
                double F = 50.0;
        
                //Calculate and print its equivalent in Celsius.
              
                //code goes here
                double C = (F - 32.0)*(5.0/9.0);
                System.out.println("Its equivalent in celcius is " + C);
                
                System.out.println("PROBLEM 3");
                //Make an integer array with the values 1, 3, 6, 4, 7, 9, 2, 6, 3 in that order.
                //Use a for loop and no built-in Math methods to find its max and min. Print these two values.
	
                //code goes here
                int[] array = {1, 3, 6, 4, 7, 9, 2, 6, 3};
                int min = array[0];
                int max = array[0];
                for(int x: array){
                     if (x < min){
                        min = x;
                     }   
                     else if (x > max){
                        max = x;
                     }
                }
                System.out.println("The min is " + min);
                System.out.println("The max is " + max);
        }
}