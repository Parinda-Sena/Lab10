package StrategyPattern;
import DataModels.*;
/**
 * ระบบคำนวณเงิน
 */
public class OrderCalculator {
    public double calculateFinalPrice(Order order, DiscountStrategy strategy){
        return strategy.applyDiscount(order);
    }
}
