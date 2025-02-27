

import java.io.*;
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
    public void leggi() {
        InputStream in = null;
        try {
            in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //leggere la riga
            String s = br.readLine();
            //stamparla a monitor
            System.out.println("Messaggio del server" + s);
        } catch (IOException e) {
          System.err.println("errore nella fase di lettura");
        }
    }

    public void scrivi(String messaggio) {
        OutputStream out = null ;
        try {
            out = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println(messaggio);
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


}
