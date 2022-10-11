package com.Mukit.Direction;

import java.util.Scanner;

public class Main {
    enum Direction{
        North,
        South,
        East,
        West
    }
    public static class NextMove{
        Direction direction;
        public NextMove(Direction direction){
            this.direction = direction;
        }

        public void currentPos(){
            switch(direction){
                case North :
                    System.out.println("I am in North.");
                    break;
                case South:
                    System.out.println("I am in South");
                    break;
                case East :
                    System.out.println("I am in East");
                    break;
                case West :
                    System.out.println("I am in West");
                    break;
                default:
                    break;
            }
        }
        public void movement(){
            switch(direction){
                case North :
                    System.out.println("I have to go South");
                    break;
                case South:
                    System.out.println("I have to go North");
                    break;
                case East :
                    System.out.println("I have to go West");
                    break;
                case West :
                    System.out.println("I have to go East");
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Direction :");
        String dir = sc.nextLine();

        NextMove nm = new NextMove(Direction.valueOf(dir));
        nm.currentPos();
        nm.movement();
    }
}
