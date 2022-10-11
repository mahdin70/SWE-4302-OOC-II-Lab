package com.Mukit.EnamCase;

import java.util.Scanner;

public class Main {

        public enum BadRequest{
            C_400 ("Bad Request"),
            C_401("Unauthorized"),
            C_403 ("Forbidden"),
            C_404 ("Not Found"),
            C_408 ("Request Timeout");

            private String action;
            public String getAction(){
                return this.action;
            }

            private BadRequest(String action){
                this.action = action;
            }
        }
    public static void main(String[] args){
        for(BadRequest badRequest:BadRequest.values()){
            System.out.println("Type:" + badRequest.name() + "\t\t"+"Action:" + badRequest.getAction());
        }
    }
}
