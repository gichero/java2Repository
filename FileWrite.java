import java.io.*;
import java.util.*;
import java.lang.*;

public class FileWrite {

private Formatter z;



public FileWrite (String a) { //constructor


try{

z = new Formatter(a);

z.format("%s%s%s%s", "Go ", "Falcons ","Yeah ", "!!!");
      
z.close();

}

catch (Exception e){
      
      System.out.println("Error occured");
      
      }


}   

public static void main(String [] args) {


        
        FileWrite fw = new FileWrite ("myfile.txt");
      
       
        }//main
        
        }//class
        
        

        