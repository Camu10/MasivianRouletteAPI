package org.masivian.test.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Roulette {
    private int id;
    private RouletteState rouletteState;
    private List<Bet> betList;
    private int winnerNumber;
    public Roulette() {
        setRouletteState(RouletteState.OPEN);
        setBetList(new ArrayList<>());
    }
    public int getId() {

        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public RouletteState getRouletteState() {

        return rouletteState;
    }
    public void setRouletteState(RouletteState rouletteState) {
        this.rouletteState = rouletteState;
    }
    public List<Bet> getBetList() {

        return betList;
    }
    public void setBetList(List<Bet> betList) {
        this.betList = betList;
    }
    public int getWinnerNumber() {

        return winnerNumber;
    }
    public void setWinnerNumber(int winnerNumber) {
        this.winnerNumber = winnerNumber;
    }
    public void openRoulette(){
        setRouletteState(RouletteState.OPEN);
        setBetList(new ArrayList<>());
    }
    public void addBet(Bet bet){
        this.betList.add(bet);
    }
    public void close(){
        setRouletteState(RouletteState.CLOSE);
        Random random = new Random();
        setWinnerNumber(random.nextInt(37));
        for(Bet bet: getBetList()){
            bet.calculeResult(getWinnerNumber());
        }
    }
}