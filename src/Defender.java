public class Defender extends Player {

    private String name;
    private int age;
    private int hits;

    public Defender(String name, int age, int hits) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.hits = hits;
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

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

}
