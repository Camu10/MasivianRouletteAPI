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
        this.color = color;
    }
    @Override
    public void calculateResult(int winnerNumber) {
    }
}