package scrumExercise;

public class Throw {
    private Dice dice;
    private Player player;

    public Throw(Dice dice, Player player){
        this.dice= dice;
        this.player= player;
    }

    public void rollAll(){

        for (int i=1; i<=7;i++){
            this.dice.roll();
            System.out.print(dice.getDice()+" ");
            this.count();
        }
        System.out.println();
        System.out.println(this.player.getScore());
    }

    public void count(){
        if(dice.getDice()==1){
            this.player.setScore(player.getScore()+100);
        }

        if(dice.getDice()==5){
            this.player.setScore(player.getScore()+50);
        }
    }




}
