package ObserverPattern;
import DataModels.*;
/**
 * interface (observer) สำหรับผู้สังเกตการณ์
 */
public interface OrderObserver {

void update (Order  order);

}
