/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionthree;

import entities.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author jnjeru
 */
public class JavaCollectionsTest {
    
    static File file = new File("C:\\Users\\jnjeru\\Documents\\NetBeansProjects\\QuestionThree\\src\\questionthree\\Items.csv");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //File file = new File("C:\\Users\\jnjeru\\Documents\\NetBeansProjects\\JavaCollectionsTest\\src\\questionthree\\Items.csv");
        BufferedReader reader = null;
        List<Product> pList = new ArrayList<>();
        Map<String, Double> pMap = new HashMap<>();
        try {
            reader = new BufferedReader(new FileReader(file));            
            String line;
            line = reader.readLine();
            while (line != null) {
                Product p = new Product();
                //System.out.println(line);
                StringTokenizer st = new StringTokenizer(line, ",");
                p.setName(st.nextToken());
                p.setQuantity(Integer.valueOf(st.nextToken()));
                p.setAmount(Double.valueOf(st.nextToken()));
                p.setDiscount(Double.valueOf(st.nextToken()));                
                //System.out.println(p.toString());
                pList.add(p);
                pMap.put(p.getName(), p.getAmount());
                //System.out.println("Count : "+pList.size());
                line = reader.readLine();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find the file: "+ file);
        }finally{
            reader.close();           
        }
                
        System.out.println("Total Count with Duplicates :" +pList.size());
        
        Iterator mapIt = pMap.keySet().iterator();
        while (mapIt.hasNext()){
            Object key = mapIt.next();
            Object value = pMap.get(key);
            System.out.println("Map Key : "+key+"\t\tMap Value :"+value);
        }
        
    }
    
    public static void createProductsMap(File f) throws IOException{
        
        BufferedReader reader = null;
        
        Map<String, Double> pMap = new HashMap<>();
        
        try {
            reader = new BufferedReader(new FileReader(file));            
            String line;
            line = reader.readLine();
            while (line != null) {
                Product p = new Product();
                StringTokenizer st = new StringTokenizer(line, ",");
                p.setName(st.nextToken());
                p.setQuantity(Integer.valueOf(st.nextToken()));
                p.setAmount(Double.valueOf(st.nextToken()));
                p.setDiscount(Double.valueOf(st.nextToken())); 
                
                pMap.put(p.getName(), p.getAmount());
            }
        }catch (FileNotFoundException e) {
            System.out.println("Unable to find the file: "+ file);
        }finally{
            reader.close();           
        }
        
        for(Object key : pMap.keySet()){
            Object value = pMap.get(key);
            System.out.println("Value for "+key.toString()+" is"+pMap.get(key));
        }
        
        
        
        
    }
    
}
