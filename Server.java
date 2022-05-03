import java.io.*;
import java.net.*;

public class Server{
  ServerSocket serverSocket;
  Socket socket;
  BufferedReader br;
  BufferedWriter bw;
  
  public Server(int port){
    try{
      serverSocket = new ServerSocket(port);   //Avvio del server 
    }catch(IOException ex){
      System.out.println("impossibile avviare il server");
    }  
  }

  public void inAscolto(){
    try{
      so = serverSocket.accept(); //Accetto le connessione socket
      System.out.println("connessione al client accettata!");
      
    }catch(IOException ex){//errore generico
      System.out.println("impossibile stabilire il socket");
    }
    
  }

  public void scrivi(String msg){ //Invio un messaggio al client
    try{
      bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
      bw.write(msg+"\n"); //Va messo \n per terminare l'invio 
      bw.flush(); //Pulitura del canale
    }catch(IOException ex){
      System.out.println("errore invio messaggio al client");
    }
    
  }
  
}