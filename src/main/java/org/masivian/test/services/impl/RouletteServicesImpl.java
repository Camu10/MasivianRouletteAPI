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
    private List<Roulette> roulettes = new ArrayList<>();
    @Override
    public int createRoulette() {
        Roulette roulette = new Roulette();
        roulettes.add(roulette);

        return roulette.getId();
    }
    @Override
    public void openRoulette(int id) throws RouletteException {
        for(Roulette roulette1:roulettes){
            if(roulette1.getId() == id){
                roulette1.openRoulette();
                break;
            }
        }
    }
    @Override
    public void addBetToRoulette(Bet bet, int rouletteId) throws RouletteException  {
        for(Roulette roulette:roulettes){
            if(roulette.getId() == rouletteId){
                roulette.addBet(bet);
                break;
            }
        }
    }
    @Override
    public List<Bet> closeRoulette(int rouletteId) throws RouletteException {
        Roulette roulette = null;
        for(Roulette roulette1:roulettes) {
            if (roulette1.getId() == rouletteId) {
                roulette1.close();

                return roulette1.getBetList();
            }
        }

        return roulette.getBetList();
    }
    @Override
    public List<Roulette> getAllRoulettes() {

        return roulettes;
    }
}