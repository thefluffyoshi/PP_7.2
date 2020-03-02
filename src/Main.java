public class Main
{
    public static void main (String[] args)
    {
        Soccer soccer = new Soccer("Soccer", "ball", 31, 11);
        Badminton badminton = new Badminton("Badminton", "Rackets and birdies", 21, 3, 2);
        Basketball basketball = new Basketball("Basketball", "Court, hoops and ball", 21, "jerseys, shorts and cleats");

        System.out.println(soccer + "\n------\n");
        System.out.println(badminton + "\n-----\n");
        System.out.println(basketball + "\n------\n");
    }
}
