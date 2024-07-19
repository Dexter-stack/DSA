package org.dexter.ArrayD.Game.core;

public class ScoreBoard {
    private int numEntries = 0;  // number of entries
    private Entry[] board;  // array of game entries (names, scores)

    public ScoreBoard(int capacity) {
        board = new Entry[capacity];
    }

    public void add(Entry entry) {
        int newScore = entry.getScore();
        // is the new entry really a high score?
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;  // increase the entry count if there's space
            }
            // shift any lower scores rightward to make room for the new entry
            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = entry;
        }
    }

    public Entry remove(int i) {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        Entry tmp = board[i];
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        numEntries--;
        return tmp;
    }

    public Entry[] getBoard() {
        Entry[] validEntries = new Entry[numEntries];
        System.arraycopy(board, 0, validEntries, 0, numEntries);
        return validEntries;
    }
}
