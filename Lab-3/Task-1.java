package com.Mukit.Enum;

import java.util.Scanner;

public class Main {
    enum Request{
        C_400,
        C_401,
        C_403,
        C_404,
        C_408
    }

    public static class Solution{
        Request request;
        public Solution(Request request){
            this.request = request;
        }
        public void Requesthandling(){
            switch(request){
                case C_400 :
                    System.out.println("Bad Request");
                    break;
                case C_401:
                    System.out.println("Unauthorized");
                    break;
                case C_403:
                    System.out.println("Forbidden");
                    break;
                case C_404:
                    System.out.println("Not Found");
                    break;
                case C_408:
                    System.out.println("Request Timeout");
                    break;
                default:
                    System.out.println("Not in the category");
                    break;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Request Type :");
        String req = sc.nextLine();

        Solution S1 = new Solution(Request.valueOf(req));
        S1.Requesthandling();
    }
}
