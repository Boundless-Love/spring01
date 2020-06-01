package cn.edu.scujcc.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * 频道模型对象。
 * @author DELL
 *
 */

public class Channel {
	 //告诉mongodb这是主键
	@Id               
	private String id;
	private String title;
	private String quality;
	private String url;
	private List<Comment>	comments;
	private String cover;      //频道封面
	
	
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	/**
	 * 向当前频道增加一个评论对象
	 * @param comment
	 */
	public void addComment(Comment comment) {
		if(this.comments == null) {
			//防止空指针
			this.comments = new ArrayList<>();
		}
		this.comments.add(comment);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Channel other = (Channel) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (quality == null) {
			if (other.quality != null)
				return false;
		} else if (!quality.equals(other.quality))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Channel [id=" + id + ", title=" + title + ", quality=" + quality + ", url=" + url + ", comments="
				+ comments + ", cover=" + cover + "]";
	}
	
	
}
