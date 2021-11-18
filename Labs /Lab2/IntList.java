
public class IntList
{



   protected int maxSize=0;
   protected int[] array = null;
   protected int size = 0;

   public IntList(int maxSize)
   {
      array = new int[maxSize];
      size=0;
      //FIX #1 - Need to set maxSize for getMaxSize() to work 
      this.maxSize = maxSize;
   }


/**
   returns the maximum number of integers that can be stored in the array
*/

   public int getMaxSize()
   {
      return maxSize;
   }



/**
returns the element at position, pos.
If the position pos does not exist simply return -1
*/
   public int getPos(int pos)
   //FIX #2- Check for out of range position, return -1 if found 
   {
   if (pos >= size){
       return -1;
     }
     else if (pos < 0){
     return array[size + pos];
     
     }
     else{
     
       return array[pos];
       
     }
   }

   
   public int length()
   {
   
      return size;
   
   }


/**
removes the element at position, pos
returns true if the element was removed successfully, and false otherwise.
*/
   public boolean remove(int pos)
   {
   
      if(pos<0 || pos >=size)
      { 
         return false;
      }
      
      //FIX- have to decrement size in if statement 
                   
      if(size==1 && pos==0)
      {
	  //no need to move things down.
     size--;
	  return true;
      }
      //FIX #3- i should go until size - 1, not size itself
      for(int i=pos;i<size - 1;i++)
      {
         array[i] = array[i+1];
      }
      //array[size - 1] = 0;
      size--;      
      return true;
   }


/**
adds the element right before the positions listed.  
(I.e) the new element will become the element at position pos.
All other elements will be shifted down to make room.
If the insert is successful, this will return true.
Otherwise, if there is no room in the list or if the insert position occured after empty spaces, return false
*/
   public boolean insertBefore(int element, int pos)
   {
      //FIX #4- pos can't be greater than maxSize MINUS one, not size plus one 
      if(pos<0 || pos>=size + 1 || size==maxSize)
      {
         return false;   
      }
      //Fix #5- i needs to start at maxSize - 1, not size
      //Fix #6- Loop needs to go while i is greater than position 
      for(int i = size; i>pos;i--)
      {
         array[i] = array[i-1];
      }
      array[pos] = element;
      size++;
      return true;
   
   
   }
   
   
   public boolean append(int element){
   if (size >= maxSize){
     return false;
     }
     array[size] = element;
     size++;
     return true;
   
   
   }
   
   public boolean prepend(int element){
   if (size >= maxSize){
     return false;
     }
     for(int i = size; i > 0; i--){
       array[i] = array[i-1];
     }
     array[0] = element;
     size++;
     return true;
   
   
   }
   
   public boolean reverse(){
     int[] temp = new int[maxSize];
     for(int i=0;i<size;i++){
       temp[i] = array[size - (i+1)];
     
     }
     array = temp;
     return true;
   
   
   }
   
   public boolean resize(){
     int[] temp = new int[maxSize * 2 ];
     for(int i=0;i<size;i++){
       temp[i] = array[i];
     
     }
     array = temp;
     maxSize = maxSize * 2;
     return true; 
   
   
   }
   
   
   public ABL clone(){
   int[] clone = new int[maxLength];
   for(int i=0;i<length;i++){
       clone[i] = array[i];
     
     }
     
     ABL cloneList = new ABL(maxLength);
     cloneList.array = clone;
     cloneList.size = this.length;
     return cloneList;
   
   
   }
   
   public static void main(String[] args) 
    { 
    IntList myList = new IntList(5);
    myList.append(2);
    myList.append(4);
    myList.append(3);
    //System.out.println(myList.reverse());
    System.out.println(myList.getPos(0));
    System.out.println(myList.getPos(1));
    System.out.println(myList.getPos(2));
    System.out.println(myList.getPos(3));
    myList.resize();
    myList.append(2);
    myList.append(4);
    myList.append(3);
    System.out.println(" ");
    System.out.println(myList.getPos(0));
    System.out.println(myList.getPos(1));
    System.out.println(myList.getPos(2));
    System.out.println(myList.getPos(3));
    System.out.println(myList.getPos(4));
    System.out.println(myList.getPos(5));
    System.out.println(myList.getPos(-2));
    IntList myList2 = myList.clone();
    System.out.println(myList2.getPos(-2));
    
    }

   
   

 



}
