

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int porta;

    public Server(int porta){
        this.porta = porta;
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Server in ascolto sulla porta " + porta);
        } catch (IOException e) {
            System.err.println("Errore del server nella fase di binding");
        }
    }
    public void attendi(){

        try {
            clientSocket = serverSocket.accept();
            System.out.println("Connessione con il client avvenuta e data socket creato");
        } catch (IOException e) {
            System.err.println("Problemi di connessione con il client");
        }
    }

    public void leggi(){
        try{
            BufferedReader inputReader = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
            String datoRicevuto = inputReader.readLine();
            System.out.println("Ricevuto dal cliente" + datoRicevuto);
        } catch (IOException e) {
            System.err.println("Errore durante la lettura dei dati dal cliente");
        }

    }

    public void scrivi() {
        OutputStream os;
        PrintWriter pw;
        String s;

        try {
            os = clientSocket.getOutputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter streamOut = new PrintWriter(os);



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
        try {
            serverSocket.close();
            System.out.println("Server terminato");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
