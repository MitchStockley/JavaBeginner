package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import soccer.Player;

public class PlayerDatabase {
    
    private Map<String, Player> players;

    public PlayerDatabase() {
        players = new HashMap<>();
        loadPlayersFromFile("C:\\Users\\Mitch\\Documents\\Bootcamp Code\\NetBeansProjects\\TextFilesToHashMap\\HashMapProject\\src\\players.txt");
    }
    
    private void loadPlayersFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                players.put(line.trim(), new Player(line.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Player[] getTeam(int numberOfPlayers){
        Player[] teamPlayers = new Player[numberOfPlayers];
        int index = 0;
        for (Player player : players.values()) {
            if (index < numberOfPlayers) {
                teamPlayers[index++] = player;
            } else {
                break;
            }
        }
        return teamPlayers;
    }
}
