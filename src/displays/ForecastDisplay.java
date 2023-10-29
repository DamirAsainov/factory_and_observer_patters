package displays;

import observers.ForecastObserver;
import observers.WhetherObserver;

public class ForecastDisplay implements Display {
    private WhetherObserver forecastObserver = new ForecastObserver();
    public void display(){
        System.out.println("Forecast Display:" +
                "\nTemperature:  " + forecastObserver.getWhether().getTemperature() +
                "\nHumidity:  " + forecastObserver.getWhether().getHumidity() +
                "\nPressure:  " + forecastObserver.getWhether().getPressure() + "\n");
    }

    public WhetherObserver getObserver() {
        return forecastObserver;
    }
}
