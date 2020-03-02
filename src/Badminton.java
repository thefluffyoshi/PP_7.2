public class Badminton extends Sport
{
    private int players;
    private int games;
    public Badminton(String sport_Name, String equipment, int score, int games, int players)
    {
        super(sport_Name, equipment, score);
        this.games = games;
        this.players = players;
    }

    public String toString()
    {
        String output = super.toString() + "\nA match consists of a best of: "+ games + "\nThe number of players are: " + players;

        return output;
    }//end toString
}//end badminton
