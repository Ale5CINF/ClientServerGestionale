import java.io.*;
import java.net.*;

public class Client{
  Socket socket; //Avvio socket 
  BufferedReader br; //Avvio dei buffer
  BufferedWriter bw;
  
  public Client(int port, InetAddress ip){
    try{
      socket = new Socket(ip, port); //avvio il socket tramite ip e la porta
      br = new BufferedReader(new InputStreamReader(so.getInputStream())); //Leggo i bit in arrivo dal server
      
    }catch(IOException ex){
      System.out.println("impossibile avviare il socket socket");
    }
    
  }

  public String leggi(){
	  String messaggioArrivo;
    try{
      messaggioArrivo = br.readLine();   
    }catch(IOException ex){
      System.out.println("Impossibile leggere il messaggio");
    }
    return messaggioArrivo;
  }
  
}