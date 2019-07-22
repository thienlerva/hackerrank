package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {

    String name;
    Double scrore;

    public Player(String name, Double score) {
        this.name = name;
        this.scrore = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScrore() {
        return scrore;
    }

    public void setScrore(Double scrore) {
        this.scrore = scrore;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", scrore=" + scrore +
                '}';
    }

    public static void main(String[] args) {

        Player player1 = new Player("amy", 100.00);
        Player player2 = new Player("david", 100.00);
        Player player3 = new Player("heraldo", 50.00);
        Player player4 = new Player("aakansha", 75.00);
        Player player5 = new Player("aleksa", 150.00);

        List<Player> players = Arrays.asList(player1, player2, player3, player4, player5);

        Comparator<Player> checker1 = (p1, p2) -> p2.getScrore().compareTo(p1.getScrore());


        Comparator<Player> nameComp = Comparator.comparing(Player::getScrore).thenComparing(Player::getName);

        Comparator<Player> checker2 = new Checker();

        Comparator<Player> checker = Comparator.comparing(Player::getScrore).reversed();

        Collections.sort(players, checker2);
        System.out.println(players);
    }
}

class Checker implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {

        if (o1.getScrore() == o2.getScrore()) {
            Comparator<Player> comp = new NameComparator();
            List<Player> players = Arrays.asList(o1, o2);
            players.sort(comp);
            return 0;
        } else if (o1.getScrore() > o2.getScrore()) {
            return 1;
        } else {
            return -1;
        }

    }
}

class NameComparator implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
