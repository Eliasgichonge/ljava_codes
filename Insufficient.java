public class Insufficient extends Exception {
    private double amount;
    private double needs;
    public Insufficient(double needs) {
        this.needs = needs;
    }
    public void insufficient(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public double getNeeds() {
        return needs;
    }
    public void printStackTrace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printStackTrace'");
    }
}
