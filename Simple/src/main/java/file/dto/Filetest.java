package file.dto;

public class Filetest {
	
	private int fileno;
	private String title;
	private String originName;
	private String storedName;
	
	@Override
	public String toString() {
		return "Filetest [fileno=" + fileno + ", title=" + title + ", originName=" + originName + ", storedName="
				+ storedName + "]";
	}

	public int getFileno() {
		return fileno;
	}

	public void setFileno(int fileno) {
		this.fileno = fileno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getStoredName() {
		return storedName;
	}

	public void setStoredName(String storedName) {
		this.storedName = storedName;
	}
	


}
