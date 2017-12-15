package smitecalc;

/**
 * @author Josh Goldstein and Brandon Townsend
 * @version 0.0.0
 */
public class TierTwo extends Item {
    private TierOne child;

    public TierTwo(String name, String powType, String passive, int cost,
                   TierOne child) {
        this.name = name;
        this.powType = powType;
        this.passive = passive;
        this.cost = cost;
        this.child = child;
    }

    @Override
    public int getCost() {
        return child.getCost() + this.cost;
    }
}
