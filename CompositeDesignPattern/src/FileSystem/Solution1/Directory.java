/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSystem.Solution1;

import java.util.*;

/**
 *
 * @author ravisharma
 */
public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> objectList;
    
    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.objectList = new ArrayList();
    }
    
    public void add(FileSystem obj){
        this.objectList.add(obj);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + this.directoryName);
        for (FileSystem obj: this.objectList){
            obj.ls();
        }
    }
    
}
