package org.example.patterns.observer;

public class EmailSubscriber implements Observer {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Email sent to " + email + ": " + news);
    }
}
