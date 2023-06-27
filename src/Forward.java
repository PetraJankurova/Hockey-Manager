public class Forward extends Player{

    private String name;
    private int age;
    private int goals;

    public Forward(String name, int age, int goals) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.goals = goals;
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

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

}
