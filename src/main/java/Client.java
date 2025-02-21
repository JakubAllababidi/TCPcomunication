

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;


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
      public String leggi() {
        try {
            return in.readLine();
        } catch (IOException e) {
            System.err.println("Errore lettura");
            return null;
        }
    }

    public void scrivi(String messaggio) {
        try {
            out.write(messaggioColorato);
            out.newLine();
            out.flush();
        } catch (IOException e) {
            System.err.println("Errore scrittura messaggio");
        }
    }
   
    public void chiudi(){
        if(socket!=null){
            try {
                socket.close();
                System.out.println("Chiusura della connessione con il server");
            } catch (IOException e) {
                System.err.println("errore nella chiusura del client");
            }
        }
    }
    public void termina() {


    }
   
}
