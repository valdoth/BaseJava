package pratique.agenda;

public class Client extends Person {

	private int idClient;
	
	public Client() {
		super();
		this.setIdClient(0);
	}

	public Client(String firstName, String lastName, String email, int idClient) {
		super(firstName, lastName, email);
		this.setIdClient(idClient);;
	}

	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		if (idClient < 0) {
			throw new RuntimeException("Client identifier must be positive");
		}
		this.idClient = idClient;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - identifier = " + this.idClient;
	}
	
} 
