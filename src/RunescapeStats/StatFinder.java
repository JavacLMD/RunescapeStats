package RunescapeStats;

import java.util.Scanner;

public class StatFinder {

	public static void main(String[] args) {
		
		PlayerStats garnetR = new PlayerStats();
		garnetR.setName("GarnetR");
		garnetR.setOverallSkill(new Skill(489139,1704,18016139));
		garnetR.setAttackSkill(new Skill(548473,76,1394048));
		garnetR.setDefenseSkill(new Skill(593729,72,966790));
		garnetR.setStrengthSkill(new Skill(590063,75,1297058));

		PlayerStats zezima = new PlayerStats();
		zezima.setName("Zezima");
		zezima.setOverallSkill(new Skill(1143,2898,56000000));
		zezima.setAttackSkill(new Skill(548473,76,1394048));
		zezima.setDefenseSkill(new Skill(593729,72,966790));
		zezima.setStrengthSkill(new Skill(590063,75,1297058));
		
		PlayerStats excl = new PlayerStats();
		excl.setName("Excl");
		excl.setOverallSkill(new Skill(385084,1979,51560436));
		excl.setAttackSkill(new Skill(387456,88,4441577));
		excl.setDefenseSkill(new Skill(360092,90,5727769));
		excl.setStrengthSkill(new Skill(427597,86,3753492));
		
		PlayerStats cherryBomb = new PlayerStats();
		cherryBomb.setName("CherryBomb04");
		cherryBomb.setOverallSkill(new Skill(385084,1979,51560436));
		cherryBomb.setAttackSkill(new Skill(387456,88,4441577));
		cherryBomb.setDefenseSkill(new Skill(360092,90,5727769));
		cherryBomb.setStrengthSkill(new Skill(427597,86,3753492));
		
		Scanner in = new Scanner(System.in);
		
		String welcomeMessage = 
				"=================================================\n" +
				"|       Welcome to Runescape Stat Finder!       |\n" +
				"|       --------------------------------        |\n" +
				"|       Choose from the preselected list:       |\n" +
				"|                                               |\n" +
				"|   GarnetR    Zezima    Excl    CherryBomb04   |\n" +
				"|                                               |\n" +
				"=================================================\n";
		
		System.out.println(welcomeMessage);
		System.out.print("\n Select Player:   ");
		String selectedPlayer = in.nextLine();
		
		PlayerStats playerStats = null;
		
		if (selectedPlayer.equalsIgnoreCase(garnetR.getName()) == true)
		{
			playerStats = garnetR;			
		}
		else if (selectedPlayer.equalsIgnoreCase(zezima.getName()) == true)
		{
			playerStats = zezima;			
		}
		else if (selectedPlayer.equalsIgnoreCase(excl.getName()) == true)
		{
			playerStats = excl;
		}
		else if (selectedPlayer.equalsIgnoreCase(cherryBomb.getName()) == true)
		{
			playerStats = cherryBomb;
		}
		else 
		{
			playerStats = null;
		}
		
		if (playerStats != null)
			System.out.println("\n\n" + playerStats.toString());
		else
			System.out.println("\n\nNot a valid player! Goodbye!");
		
		
		
	}

}
