/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author ravisharma
 */
public class EmployeeDaoProxy implements EmployeeDao{
    
    EmployeeDaoImplementation empObj;
    
    public EmployeeDaoProxy(){
        empObj = new EmployeeDaoImplementation();
    }
    
    @Override
    public void create(String client, EmployeeDo emp) throws Exception {
        if (client.equals("ADMIN")){
            empObj.create(client, emp);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")){
            empObj.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")){
            return empObj.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
    
}
