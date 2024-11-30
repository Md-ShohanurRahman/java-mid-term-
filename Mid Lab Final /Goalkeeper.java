
public class Goalkeeper extends Player {
    private int cleanSheets;

    public Goalkeeper(String name, int playerNumber, int age, String nationality, int cleanSheets) {
        super(name, playerNumber, age, nationality);
        this.cleanSheets = cleanSheets;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

   
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Clean Sheets: " + cleanSheets);
    }
}
