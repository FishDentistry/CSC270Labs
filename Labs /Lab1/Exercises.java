public class Exercises
{

/**This function will return the sum of the squares from 1 to n.
* For instance if the number is 5, the solution would be 1*1+2*2+3*3+4*4+5*5= 55. 
* If the value of n is less than 0, return -1
*/
   public static int squares(int n)
   {
      int total = 0;
      int currentVal = 0;
      if (n < 0){
        return -1;
        } else{
      for(int i = 0; i < n + 1; i++){
         currentVal = i * i;
         total = total + currentVal; 
      }
      return total;
      }
   }

/**
* This function that takes an array of integers and
* an integer that describes how many numbers are in the array.  
* The function will return the index(position) in the array with the largest number.
* If the array is empty or there is an error, return -1.
* If the maximum value is not unique, return the index of the first maximuim value.
*/
   public static int maxIndex(int array[],int len)
   {
      
      if (len == 0){
        return -1;
        }else if (len > array.length){
        return -1;
        }
        else{
        int largestIndex = 0; 
        int largest = array[0];
        int comparison = 0;
      for (int i = 0; i < len; i++){
         comparison = array[i];
         if (comparison > largest){
            largestIndex = i; 
            largest = comparison; 
         }
      }
      return largestIndex; 
      }

   }

/**
* This function that takes an array of integers, 
* an integer that describes how many numbers are in the array.  
* and a target number to look for.
* This function will return true if the target number is within the array and false otherwise.
*/
   public static boolean seek(int array[],int len,int target)
   {
   
     boolean isInList = false; 
     for (int i = 0; i < len; i++){
       int comparison = array[i];
       if (comparison == target){
          isInList = true; 
       }
     }
     return isInList; 

      
      
   }



/**
* This function takes an integer parameter and returns the nth number in the Fibonacci 
* sequence.  The first 6 numbers of the sequence are as follows.  1,1,2,3,5,8.  Note
* that 8 is the 6th number.  Be sure that your algorithm can return the
* first and second Fibonacci numbers correctly.  You should solve this without recursion. 
* If the input is below 1, retun 0;
*/
   public static int fib(int n)
   {
     int n1 = 1;
     int n2 = 1; 
     int count = 0; 
     int nth = 0;
     if (n < 1){
       return 0;
       } else if (n == 1){
         return n2; 
       } else if (n == 2){
         return n2;
       } else{
       while (count < n - 1){
         nth = n1 + n2; 
         n1 = n2; 
         n2 = nth; 
         count = count + 1; 
         }
       }
       return n1; 
   }




   private static void testSquares()
   {
      assert squares(5)==55:"square 5 should be 55 not "+squares(5);
      assert squares(1)==1:"square 1 should be 1 not "+squares(1);
      assert squares(0)==0:"square 0 should be 0 not "+squares(0);
      assert squares(-10)== -1:"square -10 should be -1 not "+squares(-10);
      assert squares(-1)== -1:"square -1 should be -1 not "+squares(-1);
   
   
   }

   private static void testMaxIndex()
   {
   //Use at least 3 to check
      int [] one = {10,20,30,30};
      assert maxIndex(one,3)==2:"max Index should have been 2 not "+maxIndex(one,3);
   
      int [] two = {10,30,20};
      assert maxIndex(two,3)==1:"max Index should have been 1 not "+maxIndex(two,3);
   
      int [] three = {30,10,20};
      assert maxIndex(three,3)==0:"max Index should have been 0 not "+maxIndex(three,3);
   
   
      assert maxIndex(null,0)==-1:"max Index should have been -1 not "+maxIndex(null,0);
      
      //use a trick to reuse other arrays
      assert maxIndex(one,2)==1:"max Index should have been 1 not "+maxIndex(one,2);
   
   
      int []  five = {30,10};
      assert maxIndex(five,2)==0:"max Index should have been 0 not "+maxIndex(five,2);
   
      assert maxIndex(one,1)==0:"max Index should have been 0 not "+maxIndex(one,1);
   
   
      assert maxIndex(one,4)==2:"max Index should have been 2 not "+maxIndex(one,4);
   
   
   }
   
   public static void testSeek()
   {
      int [] one = {1,2,3,4,5};
      
      assert seek(one,5,1) : "should have found 1";
      assert seek(one,5,5) : "should have found 5";
      assert seek(one,5,3) : "should have found 3";
      assert ! seek(one,5,-10) : "should not have found -10";
   
      assert ! seek(one,0,1) : "should not have found 1";
   
   
   }




   public static void testFib()
   {
      assert fib(6)==8: "fib 6 should be 8 not "+fib(6);
      assert fib(3)==2: "fib 3 should be 2 not "+fib(3);
      assert fib(1)==1: "fib 1 should be 1 not "+fib(1);
      assert fib(9)==34: "fib 9 should be 34 not "+fib(9);
      assert fib(-1)==-0: "fib -1 should be 0 not "+fib(-1);
   
   
   }



   public static void main(String [] args)
   {
   
      testSquares();
      testFib();
      testMaxIndex();
      testSeek();
      
      
      
      System.out.println("It all works!");
      System.out.println(fib(3));
   
   }



}
