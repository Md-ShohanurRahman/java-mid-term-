
public class Defender extends Player {
    private int tacklesMade;

    public Defender(String name, int playerNumber, int age, String nationality, int tacklesMade) {
        super(name, playerNumber, age, nationality);
        this.tacklesMade = tacklesMade;
    }

    public int getTacklesMade() {
        return tacklesMade;
    }

    public void setTacklesMade(int tacklesMade) {
        this.tacklesMade = tacklesMade;
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Tackles Made: " + tacklesMade);
    }
}
