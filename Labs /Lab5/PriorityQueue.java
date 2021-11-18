import java.util.Comparator;

public class PriorityQueue<T> extends Queue<T>
{

   Comparator<T> compare;

   public PriorityQueue(Comparator<T> comp)
   {
      compare = comp;
   }


    //@Override
   public void push(T val)
   {
       Node newNode = new Node(val,null);
       //super.push(val); //right now this is just a normal Queue as it will do what its parent did.
       if(numElements == 0){
         front = newNode;
         rear = newNode;
         numElements++;
       }
      else if (numElements == 1){
        int check = compare.compare(val,front.value);
        if(check == 1){
           front = newNode;
           front.next = rear;
           numElements++;
        
        }
        else{
          rear = newNode;
          front.next = rear;
          numElements++;
        }
        
      
      }
     else{
       boolean inserted = false;
       Node trav = front;
       Node prev = front;
       while (trav != null){
         int check = compare.compare(val,trav.value);
         if (check == 1){
           newNode.next = trav;
           prev.next = newNode;
           inserted = true;
           numElements++;
         
         }
         prev = trav;
         trav = trav.next;
       
       
       }
       if(inserted == false){
         rear.next = newNode;
         numElements++;
       }
     
     }
       
       
   }


}
