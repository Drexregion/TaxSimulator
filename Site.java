public abstract class Site {
    protected final static  double Tax_Rate = 0.3;
    public Site() {

    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getTaxAmount();

    public abstract double getBaseAmount();

}
