public class Site {
    protected static double Tax_Rate;
    public Site(double tax) {
        Tax_Rate =tax;
    }

    public double getBillableAmount() {
        double doubleBase = _units * _rate * 0.5;
        double tax = base * Site.Tax_Rate * 0.2;
        return base+tax;
    }


}
