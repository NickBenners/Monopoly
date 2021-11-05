package monopoly;

public class Player {

    private int Money;
    private int Position;
    private int prevPosition;
    private int Income;
    private String Stat = "Playing";
    private String Name;

    public Player(int Money, int Position, int prevPosition, int Income, String Name, String Stat) {
        this.Money = Money;
        this.Position = Position;
        this.prevPosition = prevPosition;
        this.Income = Income;
        this.Name = Name;
        this.Stat = Stat;
    }

    public int getMoney() {
        return Money;
    }

    public String getName() {
        return Name;
    }

    public int getIncome() {
        return Income;
    }

    public int getPosition() {
        return Position;
    }

    public int getprevPosition() {
        return prevPosition;
    }

    public String getStat() {
        return Stat;
    }

    public void setMoney(int Money) {
        this.Money = Money;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setIncome(int Income) {
        this.Income = Income;
    }

    public void setPosition(int Position) {
        this.Position = Position;
    }

    public void setprevPosition(int prevPosition) {
        this.prevPosition = prevPosition;
    }

    public void setStat(String Stat) {
        this.Stat = Stat;
    }

}
