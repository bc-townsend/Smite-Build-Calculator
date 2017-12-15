package smitecalc;

/**
 * @author Josh Goldstein and Brandon Townsend
 */
public abstract class Item {
    private String name = "";
    private String powType = "";
    private String passive = "";
    private int cost = 0;

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
