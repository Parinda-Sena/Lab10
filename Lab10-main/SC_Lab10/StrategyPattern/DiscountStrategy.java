package StrategyPattern;
import DataModels.*;
    /**
     * Interface กลยุทธ์ส่วนลด
     */
    public interface DiscountStrategy{
        double applyDiscount(Order order);
    }
