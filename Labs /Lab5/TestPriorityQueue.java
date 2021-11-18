public class TestPriorityQueue{
public static void main( String args[] ){
Customer.LoyaltyComparator myLoyal = new Customer.LoyaltyComparator();
PriorityQueue<Customer> myQ = new PriorityQueue<Customer>(myLoyal);
assert myQ.isEmpty() == true:"Queue should be empty";

Customer customer1 = new Customer(1500,15,30);
Customer customer2 = new Customer(1000,16,35);
Customer customer3 = new Customer(900,14,25);
Customer customerX = new Customer(1500,14,25);

myQ.push(customer3);
myQ.push(customer1);
myQ.push(customer2);
assert myQ.isEmpty() == false:"Queue should not be empty";
assert myLoyal.compare(customer3,customer2) < 0:"Customer 3 is less than customer 2";
assert myLoyal.compare(customerX,customer3)==0:"Customer 3 is same as customer X";

assert myQ.pop().equals(customer2):"First customer off should be customer 2";
assert myQ.pop().equals(customer1):"Second customer off should be customer 1";
assert myQ.pop().equals(customer3):"Third customer off should be customer 3";
assert myQ.isEmpty() == true:"Queue should not be empty";

Customer.WorthComparator myWorth = new Customer.WorthComparator();
PriorityQueue<Customer> myQ2 = new PriorityQueue<Customer>(myWorth);
myQ2.push(customer3);
myQ2.push(customer1);
myQ2.push(customer2);
assert myQ2.isEmpty() == false:"Queue should not be empty";
assert myWorth.compare(customer3,customer2) < 0:"Customer 3 has less worth";
assert myWorth.compare(customer1,customerX) == 0:"Have the same worth";

assert myQ2.pop().equals(customer1):"First customer off should be customer 1";
assert myQ2.pop().equals(customer2):"Second customer off should be customer 2";
assert myQ2.pop().equals(customer3):"Third customer off should be customer 3";
assert myQ2.isEmpty() == true:"Queue should not be empty";

Customer customer4 = new Customer(1500,15,30);
Customer customer5 = new Customer(1500,16,35);
Customer customer6 = new Customer(900,14,25);
Customer customer7 = new Customer(1600,17,30);

Customer.WorthPoliteComparator myWorthPolite = new Customer.WorthPoliteComparator();
assert myWorthPolite.compare(customer4,customer5) < 0:"Customer 4 less than 5";

PriorityQueue<Customer> myQ3 = new PriorityQueue<Customer>(myWorthPolite);
myQ3.push(customer6);
myQ3.push(customer5);
myQ3.push(customer4);
myQ3.push(customer7);
assert myQ3.isEmpty() == false:"Queue should not be empty";

assert myQ3.pop().equals(customer7):"First customer off should be customer 7";
assert myQ3.pop().equals(customer5):"Second customer off should be customer 5";
assert myQ3.pop().equals(customer4):"Third customer off should be customer 4";
assert myQ3.pop().equals(customer6):"Fourth customer off should be customer 6";
assert myQ3.isEmpty() == true:"Queue should be empty";













 }
}