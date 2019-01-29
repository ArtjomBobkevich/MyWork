package lesson4;

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        String[] colors = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] cards = {"Jack", "Queen", "King", "Ace",
                "6", "7", "8", "9", "10"};

        String[][] maps = new String[colors.length][cards.length];
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                maps[i][j] = cards[j] + " of " + colors[i];
            }
        }

        Random random = new Random();
        System.out.println(maps[random.nextInt(colors.length)][random.nextInt(cards.length)]);
    }
}
