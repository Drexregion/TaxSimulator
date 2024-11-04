public class LifelineSite extends Site {
    int _units;
    double _rate;
    double base;

    public LifelineSite( int units, int rate, double base ) {
        super();
        _units = units;
        _rate = rate;
        this.base = base;
    }


    public double getBaseAmount(){
        return base;
    }

    public double getTaxAmount(){
        return _rate;
    }
}
