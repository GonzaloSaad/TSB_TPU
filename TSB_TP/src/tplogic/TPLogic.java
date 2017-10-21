/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplogic;

import fileparser.FileParser;
import hashtable.TSBHashtable;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author a4
 */
public class TPLogic {
    
    private TSBHashtable<String,Integer> hashtable;
    
    public void readFile(String path){
        
    }
    
    public void readFile(File file) throws FileNotFoundException{
        FileParser fp = new FileParser(file);
        for (String pal: fp){
            System.out.println(pal);
        }
        
    }
    
    public int getWordFrecuency(String word){
        return 0;
    }
    
    public int checkWordsCount(){
        return 0;
    }
}
