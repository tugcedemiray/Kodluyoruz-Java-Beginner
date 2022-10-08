public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if(isCheck()) {
            int round = 1;
            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("==== "+ round + "." +" ROUND ====");
                double firstFighterProbability = Math.random() * 100;
                if (firstFighterProbability <= 50) {
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    if (isWin()) {
                        break;
                    }
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    if (isWin()) {
                        break;
                    }
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    if (isWin()) {
                        break;
                    }
                }
                round++;
                System.out.println(this.fighter1.name + " Health : " + this.fighter1.health);
                System.out.println(this.fighter2.name + " Health : " + this.fighter2.health);
            }
        } else {
            System.out.println("Fighters' weights do not suitable for the match");
        }
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println(this.fighter2.name + " wins!");
            return true;
        }
        if (this.fighter2.health == 0){
            System.out.println(this.fighter1.name + " wins!");
            return true;
        }
        return false;
    }
}
