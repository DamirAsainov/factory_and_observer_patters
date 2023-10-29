package displays;


import observers.CurrentObserver;
import observers.WhetherObserver;

public class CurrentDisplay implements Display {
    WhetherObserver currentObserver = new CurrentObserver();
    public void display(){
        System.out.println("Current Whether Display:" +
                "\nTemperature - " + currentObserver.getWhether().getTemperature() +
                "\nHumidity - " + currentObserver.getWhether().getHumidity() +
                "\nPressure - " + currentObserver.getWhether().getPressure() + "\n");
    }

    public WhetherObserver getObserver() {
        return currentObserver;
    }
}
