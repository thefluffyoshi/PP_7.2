public class Soccer extends Sport
{
    private int players;
    public Soccer(String sport_Name, String equipment, int score, int players)
    {
        super(sport_Name, equipment, score);
        this.players = players;
    }//constructor

    public String toString()
    {
        String output = super.toString() + "\nNumber of players: " + players;

        return output;
    }//end toString
}//end soccer
