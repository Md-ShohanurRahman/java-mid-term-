public class Start {
    public static void main(String[] args) {
        Player[] team = new Player[4];

        team[0] = new Goalkeeper("Rahul Sarker", 1, 21, "England", 10);
        team[1] = new Defender("Asiful Islam", 4, 20, "USA", 30);
        team[2] = new Midfielder("Samiul Haque", 8, 22, "Brazil", 15);
        team[3] = new Forward("Naimur Rahman", 10, 23, "Argentina", 20);


        System.out.println("Show all player details");

        for (int i = 0; i < 4; i++) {
            System.out.println();   
            team[i].displayDetails();  
        }
        
        System.out.println("Try to update the information about one player");
        System.out.println("");
        Forward forward = (Forward) team[3];
        forward.setGoalsScored(25);

        System.out.println("Updated information after changing the information about the player");
        forward.displayDetails();
    }
}

