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
public class EmployeeDaoImplementation implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDo emp) throws Exception {
        System.out.println("New Employee created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Employee deleted with employee id : " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Get Employee Info for employeeId : " + employeeId);
        return new EmployeeDo();
    }
    
}
