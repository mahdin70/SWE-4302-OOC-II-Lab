package com.Mukit.EnumDirection;

public class Main {
    public enum Direction{
        North ("I have to go South"),
        South("I have to go North"),
        East ("I have to go West"),
        West ("I have to East");

        private String action;
        public String getAction(){
            return this.action;
        }

        private Direction(String action){
            this.action = action;
        }
    }
    public static void main(String[] args){
        for(Direction direction:Direction.values()){
            System.out.println("I am in " + direction.name() + "\t\t" + direction.getAction());
        }
    }
}
