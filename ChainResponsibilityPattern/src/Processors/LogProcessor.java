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
public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    
    LogProcessor nextLogProcessor;
    
    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }
    
    public void log(int LogLevel, String message){
        if (nextLogProcessor != null){
            nextLogProcessor.log(LogLevel, message);
        }
    }
}
