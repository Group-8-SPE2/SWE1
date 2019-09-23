package scrumExercise;

public class Test {
    public static void main(String[] args) {
        Dice dice= new Dice();
        Player p1= new Player("HaoCheng");
        Throw t= new Throw(dice,p1);
        t.rollAll();
        t.count();
    }
}
