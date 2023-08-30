//player of type Defender
//has name, age from Player + number of hits

public class Defender extends Player {

    private int hits;

    public Defender(String name, int age, int hits) {
        super(name, age);
        this.hits = hits;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public void printPersonInfo() {
        System.out.print("[D] ");
        super.printPersonInfo();
        System.out.println(": " + this.hits + " hits");
    }

}
