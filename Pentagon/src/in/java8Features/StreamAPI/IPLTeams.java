package in.java8Features.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class IPLTeams {
	public static void main(String[] args) {
		// List of RCB players
		List<String> rcbPlayers = Arrays.asList("Virat Kohli", "Faf du Plessis", "Glenn Maxwell", "Mohammed Siraj");

		// List of CSK players
		List<String> cskPlayers = Arrays.asList("MS Dhoni", "Ruturaj Gaikwad", "Ravindra Jadeja", "Deepak Chahar");

		// List of MI players
		List<String> miPlayers = Arrays.asList("Rohit Sharma", "Ishan Kishan", "Jasprit Bumrah", "Suryakumar Yadav");

		// List of Lists (teams)
		List<List<String>> allTeams = Arrays.asList(rcbPlayers, cskPlayers, miPlayers);

		// Display List of Lists
		System.err.println("List of Teams and Players:");
		for (List<String> team : allTeams) {
			System.out.println(team);
		}
		 // ✅ Combine all players into a single List using Stream API
        List<String> allPlayers =  allTeams
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // Print the single combined list
        System.err.println("All IPL Players: " + allPlayers);
	}
}
