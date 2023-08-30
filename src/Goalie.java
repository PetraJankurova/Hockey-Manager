//player of type Goalie
//has name, age from Player + number of wins

public class Goalie extends Player {

    private int saves;

    public Goalie(String name, int age, int saves) {
        super(name, age);
        this.saves = saves;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    @Override
    public void printPersonInfo() {
        System.out.print("[G] ");
        super.printPersonInfo();
        System.out.println(": " + this.saves + " saves");
    }

}
