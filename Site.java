public abstract class Site implements SiteFrame {
    protected static double Tax_Rate;
    public Site(double tax) {
        Tax_Rate =tax;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getTaxAmount();

    public abstract double getBaseAmount();

}
