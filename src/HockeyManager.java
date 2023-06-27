import java.util.List;

//has a PlayerList
//creates Players and adds them to the list

public class HockeyManager {

    private PlayerList listOfPlayers;

    public HockeyManager(PlayerList listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    //creates a new forward and adds them to the list
    public void AddNewForward(String name, int age, int goals)
    {
        Forward newForward = new Forward(name, age, goals);
        listOfPlayers.addPlayer(newForward);
    }

    //creates a new defender and adds them to the list
    public void AddNewDefender(String name, int age, int hits)
    {
        Defender newDefender = new Defender(name, age, hits);
        listOfPlayers.addPlayer(newDefender);

    }

    //creates a new goalie and adds them to the list
    public void AddNewGoalie(String name, int age, int wins)
    {
        Goalie newGoalie = new Goalie(name, age, wins);
        listOfPlayers.addPlayer(newGoalie);
    }

    //prints name and age of the youngest player in the list
    public void PrintNameAndAgeOfTheYoungestPlayer(/*params if needed*/)
    {
        Player youngestPlayer = listOfPlayers.findYoungestPlayer();
        if (youngestPlayer == null) {
            return;
        }
        System.out.println("youngest player: " + youngestPlayer.getName() + " " + youngestPlayer.getAge());
    }

}
