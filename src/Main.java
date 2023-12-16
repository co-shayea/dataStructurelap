public class Main {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }
        for (CreditCard card : wallet) {
            CreditCard.printSummary(card); // calling static method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }

        }
        PredatoryCreditCard qus1 = new PredatoryCreditCard("Azad","FBI","55555555",50,20,10);

        System.out.println(qus1.charge(60));
        System.out.println(qus1.charge(70));
        System.out.println(qus1.charge(80));
        System.out.println(qus1.charge(80));

//     ques3    Give a short fragment of Java code that uses the progression classes from Section 2.2.3
//        to find the eighth value of a Fibonacci progression that starts with 2 and 2 as its first two values.
      FibonacciProgression fibobj1 = new FibonacciProgression(2,2);
      Progression progression = new Progression(8);
    }
}