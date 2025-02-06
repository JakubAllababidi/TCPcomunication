/**
 *
 * @author Allababidi Jakub
 */
public class MainClient {
     public static void main(String[] args) {
         Client c1 = new Client("Host");
         c1.connetti("localost",1024);
         c1.chiudi();
   
    }
    
}