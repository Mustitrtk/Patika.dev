package BoxGame;
public class BoxGame {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammet",25,100,95,5);
        Fighter f2 = new Fighter("Rock",23,100,100,3);
        Match r1 = new Match(f1,f2,65,105);
        r1.run();
    }
}
