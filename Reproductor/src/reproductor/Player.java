/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reproductor;

import java.io.PrintStream;
import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

/**
 *
 * @author usuario
 */
public class Player implements BasicPlayerListener {

 private PrintStream out = null;

BasicPlayer player = new BasicPlayer( );
    
    public Player() { 
//esta linea puede generar una advertencia ("leaking this on constructor" pero no le den bola   X  ) 
   player.addBasicPlayerListener(this);//añadimos el "escuchador" de eventos 

        out = System.out; 


    } 
      BasicController control = (BasicController) player;
      
      
     public void opened(Object stream, Map properties) { 

        display("opened : " + properties.toString()); 
    } 

    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) { 
       
        display("progress : " + properties.toString()); 
    } 

    public void stateUpdated(BasicPlayerEvent event) { 
        display("stateUpdated : " + event.toString()); 
        
    } 

    public void setController(BasicController controller) { 
        display("setController : " + controller); 
    } 

    public void display(String msg) { 
        if (out != null) { 
            out.println(msg); 
        } 
    } 
    
    
}
