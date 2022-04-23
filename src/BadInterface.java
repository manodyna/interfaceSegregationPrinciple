//This is an example of a bad interface when we add the loanPayment method to it,
// all classes implementing this interface are now forced to implement 
// the loanPayment method now causing complications.
public interface BadInterface {
    public void initiatePayment(String customerId);
    public void disburseLoan(String customerId, int amount);
}
