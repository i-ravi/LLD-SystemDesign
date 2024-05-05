/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builders;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ravisharma
 */
public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        List<String> subs = new ArrayList();
        subs.add("Economics");
        subs.add("Operation Management");
        subs.add("Accounts");
        this.subjects = subs;
        return this;
    }
    
}
