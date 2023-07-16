package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DTOs.GameResumidoDTO;
import Models.Game;
import Repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository repository;
	
	public List<GameResumidoDTO> buscarTodosGames(){
		
		List<Game> games = repository.findAll();
		List<GameResumidoDTO> dto = games.stream().map(x -> new GameResumidoDTO(x)).toList();
		return dto ;
		
	}

}
