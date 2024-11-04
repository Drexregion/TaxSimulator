public class ResidentialSite extends Site {
    int _units;
    double _rate;
    double base;

    public ResidentialSite( int units, int rate, double base ) {
        super(rate);
        _units = units;
        _rate = rate;
        this.base = base;
    }

    public double getBillableAmount() {
        double doubleBase = _units * _rate;
        double tax = base * Site.Tax_Rate;
        return base+tax;
    }
}
