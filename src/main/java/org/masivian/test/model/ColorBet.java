package org.masivian.test.model;
import org.masivian.test.exceptions.BetException;
public class ColorBet extends Bet {
    private Color color;
    public ColorBet(){super();}
    public ColorBet(int amount, Color color) throws BetException {
        super(amount);
    }
    public Color getColor() {

        return color;
    }
    public void setColor(Color color) throws BetException {
        if(color == null){
            throw new BetException(BetException.NULL_COLOR);
        }
        this.color = color;
    }
    @Override
    public void calculeResult(int winnerNumber) {
        if((winnerNumber%2==0 && getColor().equals(Color.RED)) || (winnerNumber%2==1 && getColor().equals(Color.BLACK))){
            super.setAmountWon(super.getAmount()*1.8);
        }
    }
}