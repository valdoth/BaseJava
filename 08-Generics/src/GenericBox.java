
public class GenericBox<ELEMENT> {
	
	private ELEMENT element;
	
	public GenericBox(ELEMENT element) {
		this.setElement(element);
	}
	
	public ELEMENT getElement() {
		return element;
	}
	
	public void setElement(ELEMENT element) {
		if (element == null) {
			throw new NullPointerException("null is not permit");
		}
		this.element = element;
	}
	
}
