/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaapp1vsc;
import java.util.ArrayList; 
import java.util.List;

public class App {

     public static void main(String[] args){
        List<String> lista = new ArrayList<String>();
        lista.add("ham");
        lista.add("spam");
        lista.add("eggs");
        lista.add("ham");
        lista.add("cheese");

      
        for(String s : lista){
            System.out.println(s);
        }
        
     }
}