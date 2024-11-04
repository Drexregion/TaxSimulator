public class LifelineSite extends Site {
    int _units;
    double _rate;
    double base;

    public LifelineSite( int units, int rate ) {
        super();
        _units = units;
        _rate = rate;

    }


    public double getBaseAmount(){
        base = _units * _rate * 0.5;
        return base;
    }

    public double getTaxAmount(){
        return base * Site.Tax_Rate * 0.2;
    }
}
