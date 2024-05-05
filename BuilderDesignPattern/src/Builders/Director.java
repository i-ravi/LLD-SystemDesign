/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builders;

/**
 *
 * @author ravisharma
 */
public class Director {
    StudentBuilder builder;
    
    public Director(StudentBuilder builder){
        this.builder = builder;
    }
    
    public Student createStudent(){
        if (this.builder instanceof EngineerStudentBuilder){
            return createEngineerStudent();
        } else if (this.builder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineerStudent() {
        return builder.setRollNumber(1).setName("Er. ABC").setAge(24).setSubject().build();
    }

    private Student createMBAStudent() {
        return builder.setRollNumber(2).setName("XYZ").setSubject().build();
    }
}
