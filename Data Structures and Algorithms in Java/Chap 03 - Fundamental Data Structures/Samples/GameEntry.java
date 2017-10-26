
public class GameEntry{
    private String name;                 // name of the person earning this score
    private int score;                   // the score value

    // Constructors
    public GameEntry(String n, int s){
        name = n;
        score = s;
    }

    // returns the name field
    public String getName() { return name; }

    // returns the scores field
    public int getScore() { return score; }

    // returns a string represents the entry
    public String toString() {
        return "(" + name + ": " + score + ")";
    }
}