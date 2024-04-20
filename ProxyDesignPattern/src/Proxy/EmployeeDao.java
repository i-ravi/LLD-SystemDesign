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
public interface EmployeeDao {
    public void create(String client, EmployeeDo emp) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public EmployeeDo get(String client, int employeeId) throws Exception;
}
