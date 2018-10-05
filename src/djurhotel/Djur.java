/*

 */
package djurhotel;

/**
 *Superklassen djur 
 * @author stevi
 */
public class Djur implements IPortion {
    
    private final String namn;
    private double vikt;
    
    public Djur(double vikt, String namn){
        this.vikt = vikt;
        this.namn = namn;
    }
    //get och set för det som behövs eftersom att allt är inkapslat
    public void setVikt(double vikt){
        this.vikt = vikt;
    }
    
    public double getVikt(){
        return vikt;
    }
    
    public String getName(){
        return namn;
    }

    @Override
    public double getPortion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFoder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
