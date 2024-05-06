package SOLID;

public class EmailNotifierAction implements EmailNotifier {
    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email in a system
        System.out.println("Email sent to " + email);
    }
}
