/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;
import Observer.NotificationAlertObserver;

/**
 *
 * @author ravisharma
 */
public interface StockObservable {
    public void add(NotificationAlertObserver obj);
    public void remvoe(NotificationAlertObserver obj);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
