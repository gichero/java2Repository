import java.io.*;
import java.util.*;

public class FileRead {

private Scanner j;


public FileRead() {


try{

j = new Scanner(new File("myfile.txt"));

while(j.hasNext()){

String a = j.nextLine();


System.out.printf(a);

}

}

catch (Exception e){
      
System.out.println("Couldn't find file");
      
      }


}

public static void main(String [] args) {


        
        FileRead fr = new FileRead();
      
       
        } //main



        } //class
    







