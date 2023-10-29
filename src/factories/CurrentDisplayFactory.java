package factories;

import displays.CurrentDisplay;
import displays.Display;

public class CurrentDisplayFactory implements WhetherDisplayFactory {
    @Override
    public Display createDisplay() {
        return new CurrentDisplay();
    }
}
