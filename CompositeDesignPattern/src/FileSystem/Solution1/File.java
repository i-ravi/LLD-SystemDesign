/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSystem.Solution1;

/**
 *
 * @author ravisharma
 */
public class File implements FileSystem {
    String fileName;
    
    public File(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public void ls(){
        System.out.println("File Name: "+ this.fileName);
    }
}
