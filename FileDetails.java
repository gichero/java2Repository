import java.io.*;
import java.util.*;

public class FileDetails {



public FileDetails(){


        
         try{
        
        File f1 = new File("anyfile.doc");
        System.out.println ("Does file exist? " + f1.exists());
        System.out.println ("The file has: " + f1.length());
        System.out.println ("Can it be read? " + f1.canRead());
        System.out.println ("Can it be written? " + f1.canWrite());
        System.out.println ("Is it a directory? " + f1.isDirectory());
        System.out.println ("Is it a file? " + f1.isFile());
        System.out.println ("Is it absolute? " + f1.isAbsolute());
        System.out.println ("Is it Hidden? " + f1.isHidden());
        System.out.println ("Absolute path is: " + f1.getAbsolutePath());
        System.out.println ("Last modified on: " + f1.lastModified());
        
        
        }
        
        catch (Exception e) {
        
        System.out.println("Error occured");
        
        }
        
        }

public static void main(String[] args)  {

FileDetails fd = new FileDetails(); 

}

}


        
        

       
        
        
        
        
        