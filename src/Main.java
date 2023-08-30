import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new LinkedList<>();
        HockeyManager hockeyManager = new HockeyManager(playerList);
        hockeyManager.AddNewForward("Mitchell Marner", 26, 16);
        hockeyManager.AddNewDefender("Cale Makar", 24, 8);
        hockeyManager.AddNewGoalie("Philipp Grubauer", 31, 41);
        hockeyManager.AddNewForward("David Pastrnak", 27, 88);

        System.out.println("TEAM 1");
        hockeyManager.printList();
        hockeyManager.PrintNameAndAgeOfTheYoungestPlayer();
        System.out.println();


        List<Player> playerList2 = new LinkedList<>();
        HockeyManager hockeyManager2 = new HockeyManager(playerList2);
        hockeyManager2.AddNewForward("Laura Lukoviny", 24, 6);
        hockeyManager2.AddNewDefender("Eva Mária Moleková", 23, 11);

        System.out.println("TEAM 2");
        hockeyManager2.printList();
        hockeyManager2.PrintNameAndAgeOfTheYoungestPlayer();
        System.out.println();

    }
}
