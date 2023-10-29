package observers;

import models.Whether;

public interface WhetherObserver {
    void update(Whether whether);

    public Whether getWhether();
}
