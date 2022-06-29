package collection_assignment;

public class product {
	private String p_name;

	public product(String p_name) {
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return "Product name: " + p_name;
	}
}
