import models.Whether;
import observers.WhetherObserver;

import java.util.ArrayList;
import java.util.List;

public class WhetherBroadcast implements Publisher{
    private List<WhetherObserver> observers = new ArrayList<>();

    Whether whether = new Whether();
    public WhetherBroadcast(){}
    public WhetherBroadcast(float temperature, float humidity, float  pressure){
        whether.setHumidity(humidity);
        whether.setPressure(pressure);
        whether.setTemperature(temperature);
    }
    @Override
    public void notifyObservers() {
        for(WhetherObserver whetherObserver: observers){
            whetherObserver.update(whether);
        }
    }

    @Override
    public void addObserver(WhetherObserver whetherObserver) {
        observers.add(whetherObserver);
    }

    @Override
    public void removeObserver(WhetherObserver whetherObserver) {
        observers.remove(whetherObserver);
    }


}
