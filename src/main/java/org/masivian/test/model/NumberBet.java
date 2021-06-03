package org.masivian.test.model;
import org.masivian.test.exceptions.BetException;
public class NumberBet extends Bet {
    private int number;
    public NumberBet(){super();}
    public NumberBet(int amount,int number) throws BetException {
        super(amount);
        setNumber(number);
    }
    public int getNumber() {

        return number;
    }
    public void setNumber(int number) throws BetException {
        if(number<0 || number>36){
            throw new BetException(BetException.INVALID_NUMBER);
        }
        this.number = number;
    }
    @Override
    public void calculeResult(int winnerNumber) {
        if(winnerNumber == getNumber()){
            super.setAmountWon(super.getAmount()*5.0);
        }
    }
}