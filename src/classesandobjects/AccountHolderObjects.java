package classesandobjects;

public class AccountHolderObjects {
    public static void main(String[] args) {
        //create objects
        AccountHolder tom = new AccountHolder();
        AccountHolder john = new AccountHolder();
        AccountHolder finch = new AccountHolder();

        //get details
        tom.firstName="Tom";
        tom.lastName="Smith";
        tom.age=21;
        tom.accountBalance=10000;
        tom.testEligibleForCreditCard(); //call the function
        System.out.println("Is Tom eligible for credit card? "+tom.eligibleForCreditCard);

        john.firstName="John";
        john.lastName="Reese";
        john.age=31;
        john.accountBalance=100000;
        john.testEligibleForCreditCard(); //call the function
        System.out.println("Is John eligible for credit card? "+john.eligibleForCreditCard);

        finch.firstName="Finch";
        finch.lastName="Harold";
        finch.age=26;
        finch.accountBalance=20001;
        finch.testEligibleForCreditCard(); //call the function
        System.out.println("Is Finch eligible for credit card? "+finch.eligibleForCreditCard);
    }
}
