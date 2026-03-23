package genericsTypebounds;

public class SortableBox<T extends Comparable<T>> {

	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public SortableBox(T content) {
		super();
		this.content = content;
	}
	
	public int compareToOtherBox(SortableBox<T> sb) {
		return(this.content.compareTo(sb.getContent()));
	}
}
