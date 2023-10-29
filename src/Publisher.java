import observers.WhetherObserver;

public interface Publisher {
    public void notifyObservers();
    public void addObserver(WhetherObserver whetherObserver);
    public void removeObserver(WhetherObserver whetherObserver);
}
