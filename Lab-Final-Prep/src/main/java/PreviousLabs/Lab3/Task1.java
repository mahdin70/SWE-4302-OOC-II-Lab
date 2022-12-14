package PreviousLabs.Lab3;

public class Task1 {
    public enum BadRequest{
        C_400 ("Bad Request"),
        C_401 ("Unauthorized"),
        C_403 ("Forbidden"),
        C_404 ("Not Found"),
        C_405 ("Request Timeout");

        private final String Action;
        public String getAction(){
            return Action;
        }
        private BadRequest(String Action){
            this.Action = Action;
        }
    }

    public static void main(String[] args){
        for(BadRequest b : BadRequest.values()){
            System.out.println("Type :" + b.name() + " Action: " + b.getAction());
        }
    }
}
