import java.net.InetAddress;
import java.net.UnknownHostException;

public class GestioneClient{
  
  public static void main(String[] args){
    try{
      Client clint = new Client(25565, InetAddress.getLocalHost()); //Avvio il client dalla sua classe inserendo la porta del server e mettendo ip locale ottenuto tramite la classe inet
      String messaggio = client.leggi(); //Leggo il messaggio che il server mi ha mandato
      System.out.println(messaggio); // Printo il messaggio
    }catch(UnknownHostException ex){
      System.out.println("Impossibile connettersi");
      
    }
    
  }
}