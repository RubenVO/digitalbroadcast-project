/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import org.dvb.ui.DVBColor;
import org.havi.ui.HIcon;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
/**
 *
 * @author student
 */
public class SterkeDrank extends HIcon implements ObserverInterface {
    
    String[] titel = new String[5];

    public HStaticText hst_titel;

    
    public SterkeDrank(int index){
        super();
        
        titel[0] = "Jack Daniels";
        titel[1] = "Cocktail Surprise";
        titel[2] = "Wodka";
        titel[3] = "Limoncello";
        titel[4] = "Martini";
        
        hst_titel = new HStaticText(titel[index]);
        hst_titel.setLocation(350,100);
        hst_titel.setSize(300,50);
        hst_titel.setBackground(new DVBColor(0,0,0,250));
        hst_titel.setBackgroundMode(HVisible.BACKGROUND_FILL);
        
     
    }
    
    public void update(int index) {
        System.out.print("sterke drank");
        hst_titel.setTextContent(titel[index], HVisible.ALL_STATES);
    }

}
