/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Observable.StockObservable;

/**
 *
 * @author ravisharma
 */
public class MobileAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;
    
    public MobileAlertObserver(String emailId, StockObservable obj){
        this.emailId = emailId;
        this.observable = obj;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock !!!");
    }
    
    public void sendEmail(String email, String msg){
        System.out.println("Mobile Notification sent to " + email + " -> " + msg);
    }
}

