/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;


//import static on.line.MainUI.ss;

/**
 *
 * @author OOSMRK_07
 */
public class Server {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Loading_Server load=new Loading_Server();
        load.setVisible(true);
        Login_Server log=new Login_Server();
        
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                load.loadingbar.setValue(i);
                if(i==100){
                    load.setVisible(false);
                    log.setVisible(true);
                }
            }
        } catch(Exception e){
            
        }
        
       
    }
    
}
