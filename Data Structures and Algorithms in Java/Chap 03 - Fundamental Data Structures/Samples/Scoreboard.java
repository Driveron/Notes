
public class Scoreboard{
    private int numEntries = 0;       // number of actual entries
    private GameEntry[] board;        // the array of game entries

    // Constructors
    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    // add a new score to the collection
    public void add(GameEntry e){
        int newScore = e.getScore();

        if (numEntries < board.length || newScore > board[numEntries].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }
            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }

            board[j] = e;
        }
    }

    // remove a score record in the board
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }

        GameEntry temp = board[i];         // store the removed record
        for (int j = i; j < numEntries; j++) { 
            board[j] = board[j + 1];       // move one cell to the left
        }
        board[numEntries - 1] = null;      // null out the old last score
        numEntries--;
        return temp;                       // return the removed object
    }
}