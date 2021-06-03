package org.masivian.test.services;

import org.masivian.test.model.Bet;
import org.masivian.test.model.Roulette;

import java.util.List;

public interface RouletteServices {
    int createRoulette();
    void openRoulette(int id);
    void addBetToRoulette(Bet bet, int rouletteId);
    List<Bet> closeRoulette(int rouletteId);
    List<Roulette> getAllRoulettes();
}
