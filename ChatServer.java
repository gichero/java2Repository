import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ChatServer extends JFrame {

  //Declarations
  private JTextField msgField = new JTextField(15);
  private JTextArea msgArea = new JTextArea(12, 20);
  private JButton msgButton = new JButton("Send");
  PrintWriter pw;
  BufferedReader br;
  ServerSocket serverSocket;
  Socket socket; 
  Thread thread;

  public ChatServer(){

    JFrame frame = new JFrame("Server Chat"); //server frame
    frame.setLayout(new FlowLayout()); // set layout
    msgArea.setBackground(Color.cyan);
    frame.add(msgArea); 
    frame.add(msgField);
    frame.add(msgButton);
    frame.setSize(300,300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
    frame .setLocation(100,300);
    frame.validate();

    try{

      serverSocket = new ServerSocket(8000); //socket for server
      socket = serverSocket.accept(); //accept request from client
      System.out.println(socket);
      //read input from InputStreamReader
      br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      //writes output to OutputStreamReader 
      pw=new PrintWriter(socket.getOutputStream(),true);

    }
    catch(Exception ex){
      //ex.PrintStackTrace();
    }
    //method called after clicking on the send button
    msgButton.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){

      pw.println(msgField.getText());
      msgField.setText("");
     }
    });
    //thread running as a process in the background
    thread = new Thread(new Runnable(){
    @Override
    public void run() {
      while(true){
        try{
          String s = br.readLine(); //reads the input from textfield
          msgArea.append(s+"\n");
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
    
    ChatServer server = new  ChatServer();//instantiate class

   } //close main 
  
}//close class

