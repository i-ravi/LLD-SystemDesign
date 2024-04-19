/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;

import Observer.NotificationAlertObserver;
import java.util.*;

/**
 *
 * @author ravisharma
 */
public class IphoneObservable implements StockObservable{
    List<NotificationAlertObserver> observerList= new ArrayList<>();
    int stockCount = 0;
    
    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remvoe(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obj: observerList){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0){
            notifySubscribers();
        }
        stockCount = newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
    
}
