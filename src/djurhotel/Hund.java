/*

 */
package djurhotel;

/**
 *
 * @author stevi
 */
public class Hund extends Djur implements IPortion {

    
    private final String foder = "Hundfoder";

    public Hund(double vikt, String namn) {
        super(vikt, namn);

    }

    

    @Override
    public double getPortion() {
        return getVikt() * 1000 / 100;
    }

    @Override
    public String getFoder() {
        return foder;
    }
}
