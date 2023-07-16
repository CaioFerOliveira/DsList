package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DTOs.GameResumidoDTO;
import Services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	GameService  service;
	
	public List<GameResumidoDTO> buscarGames(){
		
		List<GameResumidoDTO> listaGames = service.buscarTodosGames();
		return listaGames;
		
	}

}
