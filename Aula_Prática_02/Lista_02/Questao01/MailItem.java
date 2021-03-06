public class MailItem {

    private String about;
    private String from;
    private String to;
    private String message;


    public MailItem(String from, String to, String about, String message) {
        this.from = from;
        this.to = to;
	this.about = about;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public String getAbout() {
	return about;
    }

    public void print() {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
	System.out.println("About: " + about);
        System.out.println("Message: " + message);
    }
}
