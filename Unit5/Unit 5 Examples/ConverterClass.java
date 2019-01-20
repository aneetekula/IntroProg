public class ConverterClass {
    final double CONVERSION_FACTOR = 2.54;
    
    public double getCm(double in) {
        return in * CONVERSION_FACTOR;
    }
}