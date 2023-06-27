import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> list = new LinkedList<>();
        PlayerList playerList = new PlayerList(list);
        HockeyManager hockeyManager = new HockeyManager(playerList);
        hockeyManager.AddNewForward("Mitchell Marner", 26, 16);
        hockeyManager.AddNewDefender("Cale Makar", 24, 8);
        hockeyManager.AddNewGoalie("Philipp Grubauer", 31, 31);
        hockeyManager.AddNewForward("David Pastrnak", 27, 88);

        playerList.printList();
        System.out.println();
        hockeyManager.PrintNameAndAgeOfTheYoungestPlayer();

    }
}
