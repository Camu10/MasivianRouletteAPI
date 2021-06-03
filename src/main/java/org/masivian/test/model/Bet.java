package org.masivian.test.model;
public abstract class Bet {
    private int id;
    private double amount;
    private int idUser;
    private double amountWon;
    public Bet(){
    }
    public Bet(int amount) {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public double getAmountWon() {
        return amountWon;
    }
    public void setAmountWon(double amountWon) {
        this.amountWon = amountWon;
    }
    public abstract void calculateResult(int winnerNumber);
}