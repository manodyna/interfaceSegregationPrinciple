public class ComplicatedClass implements BadInterface{
//This class is now forced to implement both the methods to initiate the payment
//and to disburse the loan
//This causes side effects and complications
    @Override
    public void initiatePayment(String customerId) {
//        complex code to initiate the payment
    }

    @Override
    public void disburseLoan(String customerId, int amount) {
//        complex code to disburse the loan
    }
}
