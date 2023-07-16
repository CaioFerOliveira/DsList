package Models;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "belonging")
public class Belonging {
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer posicao;
	
	
	
	public Belonging () {
		
	}
	
	public Belonging(BelongingPK id, Integer posicao) {
		
	}
	
	public BelongingPK getBelonging() {
		return id;
	}
	
	public void setBelongingPK(Game game, GameList list, BelongingPK id) {
		this.id.setGame(game);
		this.id.setGameList(list);
		this.id = id;
	}
	
	public Integer getPosicaoInteger () {
		return posicao;
	}
	
	public void setPosicao (Integer posicao) {
		this.posicao = posicao; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
