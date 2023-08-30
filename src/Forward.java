//player of type Forward
//has name, age from Player + number of goals

public class Forward extends Player{

    private int goals;

    public Forward(String name, int age, int goals) {
        super(name, age);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public void printPersonInfo() {
        System.out.print("[F] ");
        super.printPersonInfo();
        System.out.println(": " + this.goals + " goals");
    }
}
