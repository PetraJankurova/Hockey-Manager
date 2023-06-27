public class Goalie extends Player {

    private String name;
    private int age;
    private int wins;

    public Goalie(String name, int age, int wins) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.wins = wins;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

}
