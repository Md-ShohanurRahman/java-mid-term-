
public class Forward extends Player {
    private int goalsScored;

    public Forward(String name, int playerNumber, int age, String nationality, int goalsScored) {
        super(name, playerNumber, age, nationality);
        this.goalsScored = goalsScored;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Goals Scored: " + goalsScored);
    }
}
