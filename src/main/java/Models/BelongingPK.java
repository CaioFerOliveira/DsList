package Models;

import java.util.Objects;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;

@Embeddable
public class BelongingPK {
	@ManyToAny
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToAny
	@JoinColumn(name = "list_id")
	private GameList gameList;
	
	public BelongingPK (){
		
	}
	public BelongingPK (Game game, GameList gameList) {
		
		
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
	public GameList getGameList() {
		return gameList;	
	}
	public  void setGameList(GameList gameList) {
		 this.gameList = gameList;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(game, gameList);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(gameList, other.gameList);
	}
	
	
}
