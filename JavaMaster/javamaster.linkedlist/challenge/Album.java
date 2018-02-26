package challenge;

import java.util.List;

public class Album {
	private String albumTitle;
	private String singer;
	private List<Song> songList;
	
	public Album(String albumTitle, String singer, List<Song> songList) {
		super();
		this.albumTitle = albumTitle;
		this.singer = singer;
		this.songList = songList;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public List<Song> getSongList() {
		return songList;
	}
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}
	@Override
	public String toString() {
		return albumTitle + "\t" + singer;
	}
	
}
