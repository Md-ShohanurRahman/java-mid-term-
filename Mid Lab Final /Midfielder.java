
public class Midfielder extends Player {
    private int assists;

    public Midfielder(String name, int playerNumber, int age, String nationality, int assists) {
        super(name, playerNumber, age, nationality);
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
 
    
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Assists: " + assists);
    }
}
