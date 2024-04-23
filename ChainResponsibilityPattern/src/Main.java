
import Processors.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravisharma
 */
public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.INFO, "Information passed");
        logger.log(LogProcessor.DEBUG, "Debug information passed");
        logger.log(LogProcessor.ERROR, "Exception Occurred");
    }
}
