package DTOs;

import Models.Game;

public class GameResumidoDTO {
	
	private Long id;
	
	private String title;
	
	private Integer year;
	
	private String imgUrl;
	
	private String shortDescripton; 
	
	public GameResumidoDTO () {
		
		
	}

	public GameResumidoDTO (Game entity) {
		
		id = entity.getId(); 
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl(); 
		shortDescripton = entity.getShortDescription(); 
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescripton() {
		return shortDescripton;
	}	
	
}
