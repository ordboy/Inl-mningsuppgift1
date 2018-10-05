/*

 */

package djurhotel;

import javax.swing.JOptionPane;


public class DjurHotel {
    
    public static void program1(){
        //skapa djuren
        Djur sixten = new Hund(5, "Sixten");
        Djur dogge = new Hund(10, "Dogge");
        Djur venus = new Katt(5, "Venus");
        Djur ove = new Katt(3, "Ove");
        Djur hypno = new Orm(1, "Hypno");
        
        //skapa hotellet
        DjurHotellet HealthyPets = new DjurHotellet();
        
        //checka in gästerna på hotellet
        
        HealthyPets.setGäst(sixten);
        HealthyPets.setGäst(dogge);
        HealthyPets.setGäst(venus);
        HealthyPets.setGäst(ove);
        HealthyPets.setGäst(hypno);
        
        //ut: fråga användare
        String s = JOptionPane.showInputDialog("Vilket djur ska ha mat? ");
        //in: string med svar
         
        //hämta info med string
        JOptionPane.showMessageDialog(null, HealthyPets.getMatGäst(s));
        
        
    
}

    
    public static void main(String[] args) {
        program1();
    }
    

}
