package org.masivian.test.persistence;
import org.masivian.test.exceptions.RouletteException;
import org.masivian.test.model.Roulette;
import java.util.List;
public interface RoulettePersistence {
    void saveRoulette(Roulette roulette);
    Roulette getRouletteById(long id) throws RouletteException;
    List<Roulette> getAllRoulettes();
}