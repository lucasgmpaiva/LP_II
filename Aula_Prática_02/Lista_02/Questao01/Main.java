public class Main{

	public static void main(String[] args){
		MailServer server = new MailServer();
		MailClient client = new MailClient(server, "Johnny Cash");
		MailClient client2 = new MailClient(server, "Bob Dylan");
		
		client.sendMailItem("Bob Dylan", "A Possible Duet" ,"Let's sing Hurt and Blowin' In The Wind together, man!");
		client2.printNextMailItem();
		
	}
}
