package Task1.B;

public class SendEmail {
    String From;
    String To;
    String CC;
    Mail mail;

    public SendEmail(String From, String To, String CC, Mail mail){
        this.From = From;
        this.To = To;
        this.CC = CC;
        this.mail = mail;
    }

    public void sendEmailToSomeone(){
        System.out.println("Sending Email...");
        System.out.println("From: " + From);
        System.out.println("To: " + To);
        System.out.println("CC: " + CC);
        System.out.println("Subject: " + mail.Subject);
        System.out.println("Body: " + mail.Body);
    }
}
