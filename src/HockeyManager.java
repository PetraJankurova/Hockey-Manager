//has a PlayerList
//creates Players and adds them to the list

import java.util.List;

public class HockeyManager {

    private List<Player> listOfPlayers;

    public HockeyManager(List<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    //add new player to the list
    private void addPlayer(Player player) {
        listOfPlayers.add(player);
    }

    //print error message
    private void printErrorEmptyList() {
        System.out.println("List of Players is EMPTY");
    }

    //print contents of list
    void printList() {
        if (listOfPlayers.isEmpty()) {
            printErrorEmptyList();
        }
        for (Player player : listOfPlayers) {
            player.printPersonInfo();
        }
    }

    //creates a new forward and adds them to the list
    public void AddNewForward(String name, int age, int goals)
    {
        Forward newForward = new Forward(name, age, goals);
        this.addPlayer(newForward);
    }

    //creates a new defender and adds them to the list
    public void AddNewDefender(String name, int age, int hits)
    {
        Defender newDefender = new Defender(name, age, hits);
        this.addPlayer(newDefender);

    }

    //creates a new goalie and adds them to the list
    public void AddNewGoalie(String name, int age, int saves)
    {
        Goalie newGoalie = new Goalie(name, age, saves);
        this.addPlayer(newGoalie);
    }

    //prints name and age of the youngest player in the list
    public void PrintNameAndAgeOfTheYoungestPlayer()
    {
        Player youngestPlayer = null;

        if (listOfPlayers.isEmpty()) {
            printErrorEmptyList();
        } else {
            youngestPlayer = listOfPlayers.get(0);
            for (Player player : listOfPlayers) {
                if (player.getAge() < youngestPlayer.getAge()) {
                    youngestPlayer = player;
                }
            }
        }
        if (youngestPlayer == null) {
            return;
        }
        System.out.println("youngest player: " + youngestPlayer.getName() + ", age " + youngestPlayer.getAge());
    }

}
