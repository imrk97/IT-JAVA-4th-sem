import java.util.Scanner;
public class Player{
	 public String name,team;
	 public int jerseyNumber;
	 public void read_player(){
		 System.out.print("***ENTER DETAILS***\n\nName:");
		 Scanner SC= new Scanner(System.in);
		 name= SC.nextLine();
		 System.out.print("Team:");
		 team= SC.nextLine();
		 System.out.print("Jersey NUmber:");
		 jerseyNumber= SC.nextInt();	 
		 }
	 }
class eq extends Player{
	 public void equal(Player player1, Player player2){
		 if((player1.jerseyNumber==player2.jerseyNumber)&&(player1.name.equals(player2.name))&&(player1.team.equals(player2.team))){
			System.out.println("\n\n\nTHE PLAYERS ARE SAME");
		}
		else{
			System.out.println("\n\n\nTHE PLAYERS ARE DIFFERENT");
		}
		 }
	 }
	 
	 
