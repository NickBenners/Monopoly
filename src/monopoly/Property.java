package monopoly;

public class Property {

    private int Price;
    private int Position;
    private boolean Upgraded;
    private Player Owner;

    public Property(int Price, int Position) {
        this.Price = Price;
        this.Position = Position;
        Owner = new Player(0, -1, 0, 0, "No One", "None");
    }

    public int getPrice() {
        return Price;
    }

    public boolean isUpgraded() {
        return Upgraded;
    }

    public int getPosition() {
        return Position;
    }

    public Player getOwner() {
        return Owner;
    }

    public void setUpgraded(boolean Upgraded) {
        this.Upgraded = Upgraded;
    }

    public void setOwner(Player Owner) {
        this.Owner = Owner;
    }

}
