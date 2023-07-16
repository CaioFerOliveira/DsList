package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Models.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
