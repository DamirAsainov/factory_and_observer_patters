package displays;

import observers.WhetherObserver;

public interface Display {
    public void display();

    public WhetherObserver getObserver();
}
