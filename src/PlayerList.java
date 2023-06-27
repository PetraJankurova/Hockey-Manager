import java.util.List;

public class PlayerList {

    private List<Player> listOfPlayers;

    public PlayerList(List<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }


    void addPlayer(Player player) {

        listOfPlayers.add(player);

    }

    private void printErrorEmptyList() {

        System.out.println("List of Players is EMPTY");

    }

    void printList() {
        if (listOfPlayers.isEmpty()) {
            printErrorEmptyList();
        }
        for (Player player : listOfPlayers) {
            if (player instanceof Forward) {
                System.out.print("F " + player.getName() + " ");
                System.out.print(player.getAge() + "   ");
                System.out.print(((Forward) player).getGoals() + " goals");
                System.out.println();
            } else if (player instanceof Defender) {
                System.out.print("D " + player.getName() + " ");
                System.out.print(player.getAge() + "   ");
                System.out.print(((Defender) player).getHits() + " hits");
                System.out.println();
            } else if (player instanceof Goalie) {
                System.out.print("G " + player.getName() + " ");
                System.out.print(player.getAge() + "   ");
                System.out.print(((Goalie) player).getWins() + " wins");
                System.out.println();
            }
        }
    }

    Player findYoungestPlayer() {
        if (listOfPlayers.isEmpty()) {
            printErrorEmptyList();
            return null;
        } else {
            Player youngestPlayer = listOfPlayers.get(0);
            for (Player player : listOfPlayers) {
                if (player.getAge() < youngestPlayer.getAge()) {
                    youngestPlayer = player;
                }
            }
            return youngestPlayer;
        }
    }

}
