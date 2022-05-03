public class GestioneServer{
  
  public static void main(String[] args){
    Server server = new Server(25565); //Avvio server 
    server.inAscolto(); //Inizio ad accettare le connessione socket
    server.scrivi("Ciao, benvenuto nel server pro <3!"); //Invio messaggio
  }
}