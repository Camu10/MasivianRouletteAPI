package org.masivian.test.services.impl;
import org.masivian.test.exceptions.RouletteException;
import org.masivian.test.model.Bet;
import org.masivian.test.model.Roulette;
import org.masivian.test.services.RouletteServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouletteServicesImpl implements RouletteServices {
    @Override
    public int createRoulette() {
        return 0;
    }
    @Override
    public void openRoulette(int id) {
    }
    @Override
    public void addBetToRoulette(Bet bet, int rouletteId) {
    }
    @Override
    public List<Bet> closeRoulette(int rouletteId) {
        return new ArrayList<>();
    }
    @Override
    public List<Roulette> getAllRoulettes() {
        return new ArrayList<>();
    }
}
