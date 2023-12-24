public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){

        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run () {
        if (isCheck()){

            if(this.f1.isStart()) {
                System.out.println("Maça F2 başladı.");
                this.f1.health = this.f2.hit(this.f1);


            }
            else  {
                System.out.println("Maça F1 başladı.");
                this.f2.health = this.f1.hit(this.f2);

            }

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===== YENİ ROUND ====");

                    this.f1.health = this.f2.hit(this.f1);

                    if (isWin()){
                        break;
                    }

                    this.f2.health = this.f1.hit(this.f2);

                    if (isWin()) {
                        break;
                    }


                System.out.println("F1 Sağlık = " + this.f1.health + " " +
                        "F2 Sağlık = " + this.f2.health);

            }

        }
        else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {

        return(this.f1.weight >= minWeight && this.f1.weight <=maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){

        if (this.f1.health == 0){
            System.out.println("F2 kazandı.");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println("F1 kazandı.");
            return true;
        }

        return false;
    }
}
