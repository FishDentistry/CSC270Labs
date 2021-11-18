import java.lang.Comparable;
import java.util.function.Consumer;


/**
   This is a smart Node that utilizes generics.
   Note how we ensured that the type T will always be comparable...

 */
public class BSTNode<T extends Comparable<T>>
{

   private T val;
   private BSTNode<T> left;
   private BSTNode<T> right;



   public BSTNode(T val)
   {
      this(val,null,null);
   }
    

   public BSTNode(T val, BSTNode<T> l,BSTNode<T> r)
   {
      this.val = val;
      left = l;
      right = r;
   }



   /*
     Uses recursion to insert the target into the tree
    */
   public void insert(T target)
   {
      /*
      Base case: empty tree, insert as root (done in Tree class)
      Base case: bottom of the tree, need to insert 
         Decide if left or right
      Recursive: in the tree somewhere, decide left or right and call insert again
      */
      if(left == null && right == null){
         // at the bottom of the tree/branch
         if(target.compareTo(val) <= 0){
            left = new BSTNode<T>(target);
         }
         else{
            right = new BSTNode<T>(target);
         }
      }
      // Recursive case
      else if(target.compareTo(val) <= 0){
         if(left == null){
            left = new BSTNode<T>(target);
         }
         else{
            left.insert(target); // recurses
         }
      }
      else{
         if(right == null){
            right = new BSTNode<T>(target);
         }
         else{
            right.insert(target); // recurses
         }
      }
      
   }


   /*
     Uses recursion to retrieved the value target from the tree.  
     Returns null if it can't find the value.
    */
   public T retrieve(T target)
   {
      if(val.compareTo(target) == 0){
         return target;
      }
      else if(target.compareTo(val) < 0){
         if(left == null){return null;}
         return left.retrieve(target);
      }
      else if(target.compareTo(val) > 0){
         if(right == null){return null;}
         return right.retrieve(target);
      }
      return null;
   }


    /**
       If it is present, what level is the node?
       If it is not present, what level would it be placed.
     */
   public int retrieveDepth(T target)
   {
      if(val.compareTo(target) == 0){
         return 0;
      }
      else if(target.compareTo(val) < 0){
         if(left == null){return 1;}
         else{return 1 + left.retrieveDepth(target);}
      }
      else if(target.compareTo(val) > 0){
         if(right == null){return 1;}
         else{return 1 + right.retrieveDepth(target);}
      }
      return -1; //!D
   }

   /**
      Uses recursion to return the largest value in the tree
    */
   // FIX THIS!!
   //public T getLargest()
   //{
   //}


   /**
      Uses recursion to do an inorder traversals.
      consume is part of a strategy pattern, to determine what the
      "Visit" should be.

    */
   public void inOrderTraversal(Consumer<T> consume)
   {
      /*
      LNR order
      Base case: if at bottom of tree
      */
      if(left != null){left.inOrderTraversal(consume);}
      consume.accept(val);
      if(right != null){right.inOrderTraversal(consume);}
   }


   /**
      returns true if this tree is equal to that tree.
      false otherwise.

      Note: While I must always be non-null.  
            Nothing prevents "that" from being null.
	    
	    This one is long!
    */
   public boolean myEquals(BSTNode<T> that)
   {   
      // Guardian if-statements
      if(val.compareTo(that.val) != 0){return false;}
      
      // if only one has left/right
      else if((left == null && that.left != null) || (left != null && that.left == null)){return false;}
      else if((right == null && that.right != null) || (right != null && that.right == null)){return false;}
      
      // if both nodes have no children, return true
      if(left == null && right == null && that.left == null && that.right == null){return true;}
      
      // call on left subtree, store answer
      boolean leftEquals = true;
      if(left != null){
         leftEquals = left.myEquals(that.left);
      }
      
      // call on right subtree, store answer
      boolean rightEquals = true;
      if(right != null){
         rightEquals = right.myEquals(that.right);
      }
      
      if(left != null && right != null){return(leftEquals && rightEquals);}
      else if(left != null){return leftEquals;}
      else{return rightEquals;}
      
   
      // if(left != null && that.left != null){return left.myEquals(that.left);}
//       //else if(left == null && that.left == null){return true;}
//       else if((left == null && that.left != null) || (left != null && that.left == null)){return false;}
//       
//       
//       
//       if(right != null && that.right != null){return right.myEquals(that.right);} 
//       //else if(right == null && that.right == null){return true;}
//       else if((right == null && that.right != null) || (right != null && that.right == null)){return false;} 
//       
//       return true; // need to add conditions so it doesn't always return true
   }

}
