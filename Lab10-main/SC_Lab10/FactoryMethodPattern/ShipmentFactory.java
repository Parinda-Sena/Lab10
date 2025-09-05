package FactoryMethodPattern;
/**
 * Factory object สำหรับสร้าง Shipment
 */
public class ShipmentFactory  {
    public Shipment creaShipmentShipment(String type){
        if ("STANDARD".equalsIgnoreCase(type)){
            return new StandardShipment();
        } else if ("EXPRESS".equalsIgnoreCase(type)){
            return new ExpressShipment();
        }
        throw new IllegalArgumentException("Unknow shipment type:" + type);
    }
    
}
