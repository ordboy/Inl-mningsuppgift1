/*

 */
package djurhotel;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author stevi
 */
public class DjurHotellet {

    private List<Djur> gäster = new ArrayList<>();

    public void setGäst(Djur gäst) { //lägger till gäster
        gäster.add(gäst);
    }

    public String getMatGäst(String gäst) {
        if(gäst==null)
            return "Du avbröt programmet";

        for (Djur d : gäster) {
            if (d.getName().equalsIgnoreCase(gäst)) {
                return d.getName() + " skall äta " + Math.round(d.getPortion()) + " gram " + d.getFoder();//polymorfism visar sig bl.a här, samma rad kod kommer ge olika utslag beroende på typ
            }
             
        }
        return "Vi finner ingen gäst med namnet: " + gäst;

    }

}
