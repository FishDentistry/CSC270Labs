public class TestQueue{
public static void main( String args[] ){
Queue<Integer> myQ = new Queue<Integer>();
System.out.println(myQ.isEmpty());
assert myQ.isEmpty() == true:"Queue should currently be empty";

myQ.push(3);
myQ.push(4);
myQ.push(5);

assert myQ.isEmpty() == false:"Queue should not be empty";
assert myQ.pop() == 3:"First popped value should be 3";
assert myQ.pop() == 4:"Second popped value should be 4";
assert myQ.pop() == 5:"First popped value should be 5";

boolean caughtException; // flag indicating whether the method threw the correct exception
caughtException = false; // set flag to false 
try // some dangerous code
  {
    myQ.pop(); // could throw an exception
  }
  catch(QueueUnderFlowException e) // clean up the problem here if one occurred
  {
     // assert(true); // <------ We can't just do this since this line may not be reached!
      caughtException = true;
      System.out.println("Caught queue underflow!"); 
   }
   assert(caughtException) : "Did not throw exception!,but should have";











 }
}