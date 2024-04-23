/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processors;

/**
 *
 * @author ravisharma
 */
public class InfoLogProcessor extends LogProcessor{
    
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    
    public void log(int logLevel, String message){
        if (logLevel == INFO){
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
    
}
