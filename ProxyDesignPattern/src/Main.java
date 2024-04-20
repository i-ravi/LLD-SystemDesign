
import Proxy.*;

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
        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful");
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
