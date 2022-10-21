package cop2805C;

public class Mainmethodd {

    public static void main(String[] args) {

       Food food = new Food();

       new Thread(new Animal("Hare", 15 ,100, food)).start();

       new Thread(new Animal("Tortoise", 17, 209, food)).start();
    
    }

    public static boolean winner = false;

    public static boolean isWinner() {
        return winner;
    }

    public static void setWinner(boolean winner) {
        Mainmethodd.winner = winner;
    }

    

}