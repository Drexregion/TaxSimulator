public class ResidentialSite extends Site {
    int _units;
    double _rate;
    double base;

    public ResidentialSite( int units, int rate) {
        super();
        _units = units;
        _rate = rate;
    }


    @Override
    public double getTaxAmount() {
        return Site.Tax_Rate*base;
    }

    @Override
    public double getBaseAmount() {
        base = _units * _rate;
        return base;
    }
}
