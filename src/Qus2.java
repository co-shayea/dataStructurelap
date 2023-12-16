public class Qus2 {

//  ques 5  Can two interfaces mutually extend each other? Why or why not?

//    لا، لايمكن تطبيق الوراثة العكسية بناءاً على التجربة

//    Give an example of a Java code fragment that performs an array reference that is possibly out of bounds, and if it is out of bounds,
//    the program catches that exception and prints the following error message: “Don’t try buffer overflow attacks in Java!”
public static void main(String[] args) {
    int[] array = {1, 2, 3};

    try {
        int value = array[3]; // Accessing an index that is out of bounds
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Don’t try buffer overflow attacks in Java!");
    }
}


// last question in lab 2 If the parameter to the makePayment method of the CreditCard class (see Code Fragment 1.5)
// were a negative number, that would have the effect of raising the balance on the account.
// Revise the implementation so that it throws an IllegalArgumentException if a negative amount is sent as a parameter

    private double balance;

    public void makePayment(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative Amount! try again with positive ");
        }
        balance -= amount; // Deduct the amount from the balance

    }
}
