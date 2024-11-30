
public class Player {
    private String name;
    private int playerNumber;
    private int age;
    private String nationality;

  
    public Player(String name, int playerNumber, int age, String nationality) {
        this.name = name;
        this.playerNumber = playerNumber;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Player Number: " + playerNumber);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }
}
