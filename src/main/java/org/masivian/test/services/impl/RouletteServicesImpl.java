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
        Roulette roulette = new Roulette();

        return roulette.getId();
    }
    @Override
    public void openRoulette(int id) throws RouletteException {
        Roulette roulette = null;
        roulette.openRoulette();
    }
    @Override
    public void addBetToRoulette(Bet bet, int rouletteId) throws RouletteException{
        Roulette roulette = null;
        roulette.addBet(bet);
    }
    @Override
    public List<Bet> closeRoulette(int rouletteId) throws RouletteException{
        Roulette roulette = null;
        roulette.close();

        return roulette.getBetList();
    }
    @Override
    public List<Roulette> getAllRoulettes() {
        List<Roulette> roulettes = new ArrayList<>();

        return roulettes;
    }
}
