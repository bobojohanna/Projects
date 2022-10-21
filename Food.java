package cop2805C;
public class Food {

    private int eatTime;

    synchronized int eat(String name) {

        System.out.println("Begins to eat");

        try {

            eatTime = (int) ((name.equals("Hare") ? 200 : 120) * Math.random());
            Thread.sleep(eatTime);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return eatTime;
    }
}