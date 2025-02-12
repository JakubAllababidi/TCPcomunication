

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int porta;

    public Server(int porta){
        this.porta = porta;
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("1 Server in ascolto sulla porta " + porta);
        } catch (IOException e) {
            System.err.println("Errore del server nella fase di binding");
        }
    }

    public Socket attendi(){

        try {
            clientSocket = serverSocket.accept();
            System.out.println("Connessione con il client avvenuta e data socket creato");
        } catch (IOException e) {
            System.err.println("Problemi di connessione con il client");
        }
        return clientSocket;
    }

    public void leggi(){
        try{
            recivedData = inputReader.readLine();
            System.out.println("Ricevuto dal cliente" + recivedData);
        } catch (IOException e) {
            System.err.println("Errore durante la lettura dei dati dal cliente");
        }
        return recivedData;
    }

    public void scrivi(String messaggio){
        try{
            outputWriter.println(messaggio);
            System.out.printlln(" Inviato al client" + messaggio);
        } catch (IOException e){
            System.out.println(" Errore durante la fase di scrittura");
        }

    }

    public void chiudi(){
        try {
            clientSocket.close();
            System.out.println(" Chiusura comunicazione con il client");
        } catch (IOException e) {
            System.err.println("Errore nella fase di connesionei");
        }
    }

    public void termina(){

    }
}

