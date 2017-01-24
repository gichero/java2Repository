import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatClient extends JFrame{

  //declarations
  private JTextField msgField = new JTextField(15);
  private JTextArea msgArea = new JTextArea(12, 20);
  private JButton msgButton = new JButton("Send");
  PrintWriter pw;
  BufferedReader br;
  Socket socket;  
  Thread thread;

  public ChatClient(){

    JFrame frame = new JFrame("Client Chat");//frame for client
    frame.setLayout(new FlowLayout());//set layout
    msgArea.setBackground(Color.orange);
    frame.add(msgArea);//add TextArea to the frame
    frame.add(msgField);//addTextField to the frame
    frame.add(msgButton);//add Button to frame
    frame.setSize(300,300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
    frame .setLocation(100,300);
    frame.validate();

    try{
      socket=new Socket("localhost", 8000);//socket for client
      //reads input from InputStreamReader
      br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      //writes output from OutputStreamReader
      pw=new PrintWriter(socket.getOutputStream(),true);
    }
    catch(Exception e){

    }
    //method called after clicking send button
     msgButton.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){

      pw.println(msgField.getText());
      msgField.setText("");
     }
    });
     //thread running as process in the background
    thread = new Thread(new Runnable(){//start a new thread
    @Override
    public void run() {
      while(true){
        try{
          msgArea.append(br.readLine()+"\n");
        }
        catch(Exception e){

        }
      }
    }
    });

    thread.start();
    
  }  
  //main
  public static void main(String[] args){
    
    ChatClient client = new  ChatClient();//instantiate class

  }//close main
  
}//close class

