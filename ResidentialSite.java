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
        return _rate*base;
    }

    @Override
    public double getBaseAmount() {
        return _units*base;
    }
}
