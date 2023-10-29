package observers;

import models.Whether;

import java.util.Random;

public class ForecastObserver implements WhetherObserver{
    Random random = new Random();
    Whether whether = new Whether();

    @Override
    public void update(Whether whether) {
        this.whether.setPressure(whether.getPressure() * random.nextFloat(0.1f, 2));
        this.whether.setTemperature(whether.getTemperature() * random.nextFloat(0.1f, 2));
        this.whether.setHumidity(whether.getHumidity() * random.nextFloat(0.1f, 2));

    }

    public Whether getWhether(){
        return whether;
    }
}
