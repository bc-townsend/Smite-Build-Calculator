
package smitecalc;

/**
 *
 * @author Josh Goldstein and Brandon Townsend
 */
public class Starters extends Item{
    
    public Starters(String name, String powType, String passive, int cost){
        this.name = name;
        this. powType = powType;
        this.passive = passive;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
    
}
