package observers;


import models.Whether;

public class CurrentObserver implements WhetherObserver {
    Whether whether = new Whether();


    @Override
    public void update(Whether whether) {
        this.whether = whether;
    }

    public Whether getWhether(){
        return whether;
    }
}
