import displays.Display;
import factories.CurrentDisplayFactory;
import factories.ForecastDisplayFactory;
import factories.WhetherDisplayFactory;

public class Main {
    public static void main(String[] args) {
        WhetherDisplayFactory currentWhetherDisplayFactory = createWhetherDisplayFactory("current");
        Display whetherDisplay = currentWhetherDisplayFactory.createDisplay();
        whetherDisplay.display();

        WhetherDisplayFactory forecastWhetherDisplayFactory = createWhetherDisplayFactory("forecast");
        Display forecastDisplay = forecastWhetherDisplayFactory.createDisplay();
        forecastDisplay.display();

        WhetherBroadcast whetherBroadcast = new WhetherBroadcast(-1,97, 734);
        whetherBroadcast.addObserver(forecastDisplay.getObserver());
        whetherBroadcast.addObserver(whetherDisplay.getObserver());
        whetherBroadcast.notifyObservers();

        System.out.println("------------------------Update info--------------------------\n\n");
        whetherDisplay.display();
        forecastDisplay.display();
    }
    static WhetherDisplayFactory createWhetherDisplayFactory(String specialty){
        if(specialty.equalsIgnoreCase("current")){
            return new CurrentDisplayFactory();
        } else if(specialty.equalsIgnoreCase("forecast")){
            return new ForecastDisplayFactory();
        } else {
            throw new RuntimeException(specialty + "unknown specialty");
        }
    }
}