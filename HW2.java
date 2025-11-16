public class HW2 {
    public static int factorial(int n) {
    //Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
    //CODE GOES HERE
    if (n == 1){
        return 1;
    }
    return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(8));
        //Declare the int array arr and print the number of even ints in the array. Do this once with a for loop and once with a while loop.
        //CODE GOES HERE
        int[] arr = {2, 5, 8, 11, 14, 16, 7}; 
        int evenCountFor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCountFor++;
            }
        }
        System.out.println(evenCountFor);
        int b = 0;
        evenCountFor = 0;
        while (b < arr.length) {
            if (arr[b] % 2 == 0) {
                evenCountFor++;
            }
            b++;
        }
        System.out.println(evenCountFor);
        //Declare an array of ints, then print true if the array contains a 2 next to a 2 somewhere. 
        //Do this twice, once with a for loop and once with a while loop.
        //CODE GOES HERE
        int[] shrekbals = {2, 2, 1, 2, 1, 2};
        boolean next2for = false;
        for (int i = 0; i < shrekbals.length-1; i++) {
            if (shrekbals[i] == 2 && shrekbals[i + 1] == 2){
                next2for = true;
            }
        }
        System.out.println(next2for);
        int i = 0;
        next2for = false;
        while (i < shrekbals.length-1) {
            if (shrekbals[i] == 2 && shrekbals[i + 1] == 2){
                next2for = true;
            } 
            i++;
        }
        System.out.println(next2for);
    }
}