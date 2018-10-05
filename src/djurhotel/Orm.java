/*

 */
package djurhotel;

/**
 *
 * @author stevi
 */
public class Orm extends Djur implements IPortion {

    private final String foder = "Ormpellets";

    public Orm(double vikt, String namn) {
        super(vikt, namn);
        
    }

    

    @Override
    public double getPortion() {
        return 20;
    }

    @Override
    public String getFoder() {
        return foder;
    }
}
