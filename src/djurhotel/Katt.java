  /*

 */
package djurhotel;

/**
 *
 * @author stevi
 */
public class Katt extends Djur implements IPortion{
    
    private final String foder = "Kattfoder";
    
    public Katt(double vikt, String namn){
        super(vikt, namn);         
    }
    

    @Override
    public double getPortion() {
        return getVikt() *1000 / 150;
    }

    @Override
    public String getFoder() {
        return foder;
    }
    
}
