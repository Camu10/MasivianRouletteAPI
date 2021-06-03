package org.masivian.test.services;
import org.masivian.test.exceptions.RouletteException;
import org.masivian.test.model.Bet;
import org.masivian.test.model.Roulette;
import java.util.List;
public interface RouletteServices {
    int createRoulette();
    void openRoulette(int id) throws RouletteException;
    void addBetToRoulette(Bet bet, int rouletteId) throws RouletteException;
    List<Bet> closeRoulette(int rouletteId) throws RouletteException;
    List<Roulette> getAllRoulettes();
}
