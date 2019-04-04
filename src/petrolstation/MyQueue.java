/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolstation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author x18111238
 */

 public class MyQueue implements QueueInterface {
        private ArrayList<Cars> theCarsQueue;

            public MyQueue() {
                
            theCarsQueue = new ArrayList<Cars>();
                
           }
            
            
 public boolean isEmpty() {
 return theCarsQueue.isEmpty();
 }

 
 public int size(){
 return theCarsQueue.size();
 }
 
 
 public Object frontElement() {
    if (theCarsQueue.size() > 0 )
 {
    return theCarsQueue.get(0);
 }
   else
 {
    return null;
 }
 }

 public void enqueue(Object element){
 theCarsQueue.add((Cars)element);
 }
 
    public Object dequeue() {
        if(theCarsQueue.size()>0)
 return theCarsQueue.remove(0);
 else
 return null;
 
 }
   
      public void emptyQueue(){
          theCarsQueue.clear();
         
      }
    public String displayQueue()
    {
      Iterator a;
      
     String abc = new String();
     a = theCarsQueue.iterator(); 
      if (theCarsQueue.isEmpty())
      {
          abc = abc.concat("There are no vehicles to be washed !");
      }
        else

          
      {
      while (a.hasNext()){ 
              Cars p = (Cars)a.next();
              abc = abc.concat(p.getType());
              abc = abc.concat (" ");
              abc = abc.concat(p.getRegnumber());
              abc = abc.concat (" ");
       
       }
  
} 
      return abc;
    }          
 }
 