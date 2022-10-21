package cop2805C;

import java.util.Random;

public class Animal implements Runnable {

    private String name;
    private int position, speed, restMax;
    private Food food;

    private Random random = new Random();
    

    private static boolean winner = false;

    Animal(String name, int speed, int restMax, Food food) {
        this.name = name;
        this.speed = speed;
        this.restMax = restMax;
        this.food = food;

    }
    
@Override
    public void run() {

        int finishPosition = 120;

        while (this.position <= finishPosition && !winner) {

            System.out.println(this.name + " : " + this.position + " yards");

            try {

                int rest = this.random.nextInt(this.restMax);
                Thread.sleep(rest);

                food.eat(this.name);

                this.position += this.speed;

                System.out.println();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.position >= finishPosition) {

                winner = true;

                System.out.println("The race is over!");
                System.out.println(this.name + " wins!");
            }
        }
    }

public void setUser(boolean b) {
}
}