import java.util.List;
import java.util.ArrayList;

public class TestTree{
public static void main(String[] args) {
BSTree tree1 = new BSTree();
assert tree1.isEmpty() == true:"Tree should currently be empty";
assert tree1.getSize() == 0:"Tree is empty";
assert tree1.largest() == null:"Tree is empty currently";
tree1.insert(6);
tree1.insert(4);
tree1.insert(8);
tree1.insert(3);
tree1.insert(5);
tree1.insert(7);
tree1.insert(9);
assert tree1.getSize() == 7:"Tree has 7 elements";
assert tree1.isEmpty() == false:"Tree should now have items";
assert tree1.retrieve(8) == 8:"8 is in the tree";
assert tree1.retrieve(10) == null:"10 is not in the tree";
assert tree1.retrieveDepth(3) == 2:"3 is on second level";
assert tree1.retrieveDepth(2) == 3:"2 is not in tree, but it would be on level 3";
assert tree1.sum() == 42:"Sum should be 42";
assert tree1.largest() == 9:"Largest in tree is 9";
List<Integer> myList = tree1.toList();
int[] intArray = new int[]{ 3,4,5,6,7,8,9};
for(int i=0;i<=intArray.length-1;i++){
assert intArray[i] == myList.get(i);

} 



BSTree tree2 = new BSTree();
tree2.insert(6);
tree2.insert(4);
tree2.insert(8);
tree2.insert(3);
tree2.insert(5);
tree2.insert(7);
tree2.insert(10);
assert tree2.largest() == 10:"Largest in tree is 10";

BSTree tree3 = new BSTree();
tree3.insert(6);
tree3.insert(4);
tree3.insert(8);
assert tree3.largest() == 8:"Largest in tree is 8";

BSTree tree4 = new BSTree();
tree4.insert(6);
tree4.insert(4);
tree4.insert(8);
tree4.insert(3);
tree4.insert(5);
tree4.insert(7);
tree4.insert(9);
assert tree4.largest() == 9:"Largest in tree is 9";
assert tree4.myEquals(tree1) == true:"Trees are the same";
assert tree4.myEquals(tree2) == false:"Trees are not the same";
assert tree4.myEquals(tree3) == false:"Trees are not the same";

BSTree tree5 = new BSTree();
tree5.insert(9);
tree5.insert(7);
tree5.insert(5);
tree5.insert(3);
tree5.insert(8);
tree5.insert(4);
tree5.insert(6);
assert tree5.myEquals(tree1) == false:"Trees are not the same";
assert tree5.myEquals(tree2) == false:"Trees are not the same";
assert tree5.largest() == 9:"Largest in tree is 9";

BSTree tree6 = new BSTree();
BSTree tree7 = new BSTree();
assert tree6.myEquals(tree7) == true:"Trees are the same";
tree6.insert(5);
tree6.insert(7);
tree6.insert(9);
assert tree6.myEquals(tree7) == false:"Trees are not the same";
assert tree7.myEquals(tree6) == false:"Trees are not the same";
tree7.insert(9);
tree7.insert(7);
tree7.insert(5);
assert tree6.myEquals(tree7) == false:"Trees are not the same";
assert tree7.myEquals(tree6) == false:"Trees are not the same";

BSTree tree8 = new BSTree();
BSTree tree9 = new BSTree();
assert tree9.largest() == null:"Tree is empty currently";
tree8.insert(12);
tree9.insert(12);
assert tree8.myEquals(tree9) == true:"Trees are the same";
assert tree9.myEquals(tree8) == true:"Trees are the same";
assert tree8.largest() == 12;
assert tree9.largest() == 12;
BSTree tree10 = new BSTree();
tree10.insert(12);
tree10.insert(13);
tree10.insert(14);
assert tree10.largest() == 14;
assert tree10.myEquals(tree8) == false:"Trees are not the same";

BSTree tree11 = new BSTree();
BSTree tree12 = new BSTree();
assert tree11.myEquals(tree12) == true:"Trees are the same";
assert tree12.myEquals(tree11) == true:"Trees are the same";
assert tree11.myEquals(tree10) == false:"Trees are not the same";
assert tree10.myEquals(tree11) == false:"Trees are not the same";
tree11.insert(12);
tree11.insert(15);
tree11.insert(10);
tree11.insert(13);
tree11.insert(18);
tree11.insert(25);

tree12.insert(12);
tree12.insert(15);
tree12.insert(10);
tree12.insert(13);
tree12.insert(18);
tree12.insert(25);
assert tree11.myEquals(tree12) == true:"Trees are the same";
assert tree12.myEquals(tree11) == true:"Trees are the same";
assert tree11.largest() == 25;
assert tree11.myEquals(tree10) == false:"Trees are not the same";
assert tree10.myEquals(tree11) == false:"Trees are not the same";

BSTree tree13 = new BSTree();
BSTree tree14 = new BSTree();

tree13.insert(1);
tree13.insert(2);
tree13.insert(3);
tree14.insert(2);
tree14.insert(3);
tree14.insert(1);
assert tree13.myEquals(tree14) == false:"Trees are the same";
assert tree14.myEquals(tree13) == false:"Trees are the same";

BSTree tree15 = new BSTree();
BSTree tree16 = new BSTree();
tree15.insert(5);
tree15.insert(1);
tree15.insert(10);
tree16.insert(1);
tree16.insert(5);
tree16.insert(10);
assert tree15.myEquals(tree16) == false:"Trees are the same";
assert tree16.myEquals(tree15) == false:"Trees are the same";
BSTree tree17 = new BSTree();
tree17.insert(5);
tree17.insert(1);
tree17.insert(10);
assert tree17.myEquals(tree15) == true:"Trees are the same";
assert tree15.myEquals(tree17) == true:"Trees are the same";
assert tree15.myEquals(tree1) == false:"Trees are the same";
assert tree17.myEquals(tree1) == false:"Trees are the same";

BSTree tree18 = new BSTree();
BSTree tree19 = new BSTree();
assert tree18.myEquals(tree19) == true:"Trees are the same";
assert tree19.myEquals(tree18) == true:"Trees are the same";
tree18.insert(20);
tree19.insert(20);
assert tree18.myEquals(tree19) == true:"Trees are the same";
assert tree19.myEquals(tree18) == true:"Trees are the same";
tree18.insert(21);
assert tree18.myEquals(tree19) == false:"Trees are the same";
assert tree19.myEquals(tree18) == false:"Trees are the same";
}











}