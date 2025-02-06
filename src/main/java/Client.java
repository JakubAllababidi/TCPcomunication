

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;


public class Client {
    String nome;
    Socket socket;

    public Client(String nome){
        this.nome = nome;
    }

    public void connetti(String nomeServer, int porta){
        try {
            socket = new Socket(nomeServer, porta);
            System.out.println("Connessione avvenuta con successo");
        }
        catch(ConnectException e){
            System.err.println("Errone server non in ascolto nella porta");
        }
        catch (UnknownHostException e) {
            System.err.println("Errore host DNS ");
        }
        catch (IOException e) {
            System.err.println("Errone nella fase di connessione");
        }
    }

    public void leggi(){

    }

    public void scrivi(){

    }

    public void chiudi(){
        if(socket!=null){
            try {
                socket.close();
                System.out.println("4)Chiusura della connessione con il server");
            } catch (IOException e) {
                System.err.println("errore nella chiusura del client");
            }
        }
    }

 

   
}
