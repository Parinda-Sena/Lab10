package ObserverPattern;
import DataModels.*;
public class EmailService implements OrderObserver{
 /**
  * ระบบแจ้งเตือนลูกค้าผ่านเมล
  */
    @Override
    public void update(Order order) {
        System.out.println("[Email Service] Confirmation email sent to" + order.customerEmail() + "for order:" + order);
    }
    
}
