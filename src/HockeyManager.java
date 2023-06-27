import java.util.List;

public class HockeyManager {

    private PlayerList listOfPlayers;

    public HockeyManager(PlayerList listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public void AddNewForward(String name, int age, int goals)
    {
        Forward newForward = new Forward(name, age, goals);
        listOfPlayers.addPlayer(newForward);
    }
    public void AddNewDefender(String name, int age, int hits)
    {
        Defender newDefender = new Defender(name, age, hits);
        listOfPlayers.addPlayer(newDefender);

    }
    public void AddNewGoalie(String name, int age, int wins)
    {
        Goalie newGoalie = new Goalie(name, age, wins);
        listOfPlayers.addPlayer(newGoalie);
    }
    public void PrintNameAndAgeOfTheYoungestPlayer(/*params if needed*/)
    {
        Player youngestPlayer = listOfPlayers.findYoungestPlayer();
        if (youngestPlayer == null) {
            return;
        }
        System.out.println("youngest player: " + youngestPlayer.getName() + " " + youngestPlayer.getAge());
    }

}
