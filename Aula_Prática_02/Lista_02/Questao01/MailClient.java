public class MailClient {

    private MailServer server;
    private String user;

    public MailClient(MailServer server, String user) {
        this.server = server;
        this.user = user;
    }

    public MailItem getNextMailItem() {
        return server.getNextMailItem(user);
    }

    public void printNextMailItem() {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            item.print();
        }
    }

    public void sendMailItem(String to, String about, String message) {
        MailItem item = new MailItem(user, to, about, message);
        server.post(item);
    }
}
