/**
 *
 * @author Allababidi Jakub
 */
public class MainClient {
     public static void main(String[] args) {
         Client c1 = new Client("Host");
         c1.connetti("localhost",1024);
         c1.scrivi("messaggio prova");
         c1.leggi();
         c1.chiudi();
         c1.termina();
   
    }
    
}
