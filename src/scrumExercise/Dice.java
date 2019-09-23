package scrumExercise;

public class Dice {
    private int dice;

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public void roll(){
        int max=6;
        int min=1;
        this.dice= (int)(Math.random()*max+min);
    }
}
