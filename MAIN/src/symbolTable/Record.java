package symbolTable;

public class Record {

	private String id;
	private String type;

	public Record(String id, String type) {
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}
}
