/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSystem.ProblemStatement;

import java.util.*;

/**
 *
 * @author ravisharma
 */
public class Directory {
    String directoryName;
    List<Object> objectList;
    
    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.objectList = new ArrayList();
    }
    
    public void add(Object obj){
        this.objectList.add(obj);
    }
    
    public void ls(){
        System.out.println("Directory Name: "+ this.directoryName);
        for (Object obj: this.objectList){
            // avoid this if in solution
            if (obj instanceof File){
                ((File)obj).ls();
            } else if (obj instanceof Directory){
                ((Directory)obj).ls();
            }
        }
    }
}
