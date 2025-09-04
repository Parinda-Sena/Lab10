package ObserverPattern;
import DataModels.*;
public class InventoryService implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.println("[Iventory Service] Stock has been updated for order " + order.orderId() );
    }
    
}
