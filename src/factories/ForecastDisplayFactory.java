package factories;

import displays.Display;
import displays.ForecastDisplay;

public class ForecastDisplayFactory implements WhetherDisplayFactory {
    @Override
    public Display createDisplay() {
        return new ForecastDisplay();
    }
}
