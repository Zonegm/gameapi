package br.com.gustavo.gameapi.repository;

import br.com.gustavo.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends
        MongoRepository<Player, String> {
}
