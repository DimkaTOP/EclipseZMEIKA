interface Converter {
    double getConvertedValue(double baseValue);
}
class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}
class KelvinConverter implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

public class BasseConvert {

	public static void main(String[] args) {
		double temperature = 23.5;
        System.out.println("t = " + new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t = " + new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " + new FahrenheitConverter().getConvertedValue(temperature));

	}

}
