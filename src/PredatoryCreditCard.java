public class PredatoryCreditCard extends CreditCard {
    private double apr; // annual percentage rate

         // Constructor for this class
         public PredatoryCreditCard(String cust, String bk, String acnt, int lim,
          double initialBal, double rate) {
             super(cust, bk, acnt, lim, initialBal); // initialize superclass attributes
        apr = rate;
         }
//    Assume that we change the CreditCard class (see Code Fragment 1.5) so that instance variable balance has private visibility.
//    Why is the following implementation of the PredatoryCreditCard.charge method flawed?

//    public boolean charge(double price) {
//        boolean isSuccess = super.charge(price);
//        if (!isSuccess)
//            charge(5); // the penalty
//        return isSuccess;
//    }
             // A new method for assessing monthly interest charges
            public void processMonth( ) {
             if (balance > 0) { // only charge interest on a positive balance
         double monthlyFactor = Math.pow(1 + apr, 1.0/12); // compute monthly rate
        balance *= monthlyFactor; // assess interest
         }
    }
//     Overriding the charge method defined in the superclass
    public boolean charge(double price) {
             boolean isSuccess = super.charge(price); // call inherited method
         if (!isSuccess)
            balance += 5; // assess a $5 penalty
         return isSuccess;
         }
}
