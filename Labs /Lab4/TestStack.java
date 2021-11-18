public class TestStack{
  public static void main( String args[] ){
   //StackUnderFlowException e = new StackUnderFlowException();
   IntStack myStack = new IntStack();
   assert myStack.isEmpty() == true: "Nothing has been pushed, should be empty";
   
   boolean caughtException; // flag indicating whether the method threw the correct exception
      caughtException = false; // set flag to false 
      try // some dangerous code
      {
         myStack.pop(); // could throw an exception
      }
      catch(StackUnderFlowException e) // clean up the problem here if one occurred
      {
         // assert(true); // <------ We can't just do this since this line may not be reached!
         caughtException = true;
         System.out.println("Caught stack underflow!"); 
      }
      assert(caughtException) : "Did not throw exception!"; // Assert exception was thrown and caught as expected
      
      boolean caughtException2; // flag indicating whether the method threw the correct exception
      caughtException2 = false; // set flag to false 
      try // some dangerous code
      {
         myStack.top(); // could throw an exception
      }
      catch(StackUnderFlowException e) // clean up the problem here if one occurred
      {
         // assert(true); // <------ We can't just do this since this line may not be reached!
         caughtException2 = true;
         System.out.println("Caught stack underflow!"); 
      }
      assert(caughtException2) : "Did not throw exception!";
     
   
   
   myStack.push(2);
   myStack.push(3);
   myStack.push(4);
   
   assert myStack.top() == 4: "Top of stack should be 4";
   assert myStack.pop() == 4: "Should have popped off 4";
   assert myStack.top() == 3: "Top should be 3 now";
   assert myStack.isEmpty() == false: "There are values in the stack now";







}

}