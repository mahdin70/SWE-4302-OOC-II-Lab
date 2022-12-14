package Task1.B;

// Here a separate class is created nameed "SendImmadiateMail" which extends the SendEmail class with a boolean variable called
//" isImmadiate " and a constructor to initialize the variable and a method to send the email immadiately
public class SendImmadiateMail extends SendEmail {
    boolean sendImmediately;
    public SendImmadiateMail(String From, String To, String CC, Mail mail) {
        super(From, To, CC, mail);
    }
}
