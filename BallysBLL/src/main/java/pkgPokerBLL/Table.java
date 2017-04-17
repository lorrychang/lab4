package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table<PlayerID> implements Serializable {

	private UUID TableID;
	private UUID PlayerID;

	HashMap <PlayerID, Player> TablePlayers = new HashMap <PlayerID, Player>();

	public Table() {
		super();
		setTableID(UUID.randomUUID());
	}

	public Table AddPlayerToTable(Player p) {
		
		TablePlayers.put(null, p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		
		TablePlayers.remove(p);
		return this;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}
}
