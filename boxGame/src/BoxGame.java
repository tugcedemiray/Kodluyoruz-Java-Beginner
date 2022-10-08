public class BoxGame {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("FE",10,120,100,30);
        Fighter f2 = new Fighter("TD",20,85,85,40);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}

