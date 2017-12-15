package smitecalc;

/**
 * @author Josh Goldstein and Brandon Townsend
 * @version 0.0.0
 */
public abstract class Item {
    protected String name = "";
    protected String powType = "";
    protected String passive = "";
    protected int cost = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowType() {
        return powType;
    }

    public void setPowType(String powType) {
        this.powType = powType;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public abstract int getCost();

    public void setCost(int cost) {
        this.cost = cost;
    }
}
