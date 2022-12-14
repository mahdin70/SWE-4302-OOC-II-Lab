package PreviousLabs.Lab3;


public class Task2_Enum {
    public enum Direction{
        North("I have to go South"),
        South("I have to go North"),
        East("I have to go West"),
        West("I have to go East");

        private final String Action;

        public String getAction(){
            return Action;
        }

        private Direction(String Action){
            this.Action = Action;
        }
    }

    public static void main(String[] args){
        for(Direction d : Direction.values()){
            System.out.println("Direction: " + d.name() + " Action: " + d.getAction());
        }
    }
}
