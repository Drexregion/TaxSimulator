public class LifelineSite extends Site {
    int _units;
    double _rate;
    double base;

    public LifelineSite( int units, int rate, double base ) {
        super(rate);
        _units = units;
        _rate = rate;
        this.base = base;
    }

    public double getBillableAmount() {
        double doubleBase = _units * _rate * 0.5;
        double tax = base * Site.Tax_Rate * 0.2;
        return base+tax;
    }

    public double getBaseAmount(){
        return base;
    }

    public double getTaxAmount(){
        return _rate;
    }
}
