package PreviousLabs.Lab3;

import java.util.Scanner;

public class Task2 {
    enum Direction{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static class nextMove{
        Direction direction;

        public nextMove(Direction direction){
            this.direction = direction;
        }

        public void currentPos(){
            switch (direction) {
                case NORTH -> System.out.println("You are currently facing North");
                case SOUTH -> System.out.println("You are currently facing South");
                case EAST -> System.out.println("You are currently facing East");
                case WEST -> System.out.println("You are currently facing West");
                default -> {
                }
            }
        }

        public void movement(){
            switch (direction) {
                case NORTH -> System.out.println("You are moving to South");
                case SOUTH -> System.out.println("You are moving to North");
                case EAST -> System.out.println("You are moving to West");
                case WEST -> System.out.println("You are moving to East");
                default -> {
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        nextMove move = new nextMove(Direction.valueOf(input));
        move.currentPos();
        move.movement();
    }
}
