
import Observable.*;
import Observer.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravisharma
 */
public class Store {
    
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservable();
        
        NotificationAlertObserver observer1 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("lmn@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserver("abc@hotmail.com", iphoneStockObservable);
        
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.add(observer2);
        
        iphoneStockObservable.setStockCount(1135);
    }
    
}
