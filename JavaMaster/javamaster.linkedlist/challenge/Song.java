package challenge;

public class Song {
	private String title;
	private String duration;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Song(String title, String duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return title + "\t" + duration;
	}
}
