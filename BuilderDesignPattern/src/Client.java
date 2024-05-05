
import Builders.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravisharma
 */
public class Client {
    public static void main(String[] args) {
        Director obj1 = new Director(new EngineerStudentBuilder());
        Director obj2 = new Director(new MBAStudentBuilder());
        
        Student student1 = obj1.createStudent();
        Student student2 = obj2.createStudent();
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
