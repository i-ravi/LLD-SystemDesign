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
public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;
    
    public EmailAlertObserver(String emailId, StockObservable obj){
        this.emailId = emailId;
        this.observable = obj;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock !!!");
    }
    
    public void sendEmail(String email, String msg){
        System.out.println("Email sent to " + email + " -> " + msg);
    }
    
    
}
