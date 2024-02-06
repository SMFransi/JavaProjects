package classesandobjects;

public class AccountHolder {

    //variables
    String firstName;
    String lastName;
    int age;
    float accountBalance;
    boolean eligibleForCreditCard;

    public void testEligibleForCreditCard(){
        if (age>25 && accountBalance>20000){
            eligibleForCreditCard=true;
        }
    }

}
