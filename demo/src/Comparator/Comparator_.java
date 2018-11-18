package Comparator;

import java.util.Arrays;
import java.util.Comparator;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score == o2.score){
            return o1.name.compareTo(o2.name);
        }else {
            return (o1.score > o2.score) ? -1 : 1;
        }
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Comparator_ {

    public static void main(String[] args) {
        int n = 5;

        String [] strings = {"amy", "david", "heraldo", "aakansha", "aleksa"};
        int [] ints = {100, 100, 50, 75, 150};

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(strings[i], ints[i]);
        }

        Arrays.sort(player, checker);
        for (Player aPlayer : player) {
            System.out.printf("%s %s\n", aPlayer.name, aPlayer.score);
        }
    }
}