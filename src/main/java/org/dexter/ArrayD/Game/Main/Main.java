package org.dexter.ArrayD.Game.Main;

import org.dexter.ArrayD.Game.core.Entry;
import org.dexter.ArrayD.Game.core.ScoreBoard;

public class Main {
    public static void main(String[] args) {
        // Create game entries
        Entry entry = new Entry("Dexter", 30);
        Entry entry1 = new Entry("Sulaiman", 40);
        Entry entry2 = new Entry("Ibrahim", 50);

        // Create scoreboard to add the entries
        ScoreBoard scoreBoard = new ScoreBoard(5);
        scoreBoard.add(entry);
        scoreBoard.add(entry1);
        scoreBoard.add(entry2);

        // Retrieve and print the scoreboard
        Entry[] ents = scoreBoard.getBoard();
        for (Entry ent : ents) {
            if (ent != null) {
                System.out.println(ent.getName() + " " + ent.getScore());
            }
        }

        // Test removal
        scoreBoard.remove(1);  // Remove the entry at index 1
        System.out.println("After removal:");
        ents = scoreBoard.getBoard();
        for (Entry ent : ents) {
            if (ent != null) {
                System.out.println(ent.getName() + " " + ent.getScore());
            }
        }
    }
}
