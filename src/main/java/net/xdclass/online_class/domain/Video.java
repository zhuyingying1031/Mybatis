package net.xdclass.online_class.domain;

import java.util.Date;


public class Video {
	private  int id;
	private String title;
	private String summary;
	private String 	cover_img;
	private float price;
	private Date create_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCover_img() {
		return cover_img;
	}

	public void setCover_img(String cover_img) {
		this.cover_img = cover_img;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "Video{" +
				"id=" + id +
				", title='" + title + '\'' +
				", summary='" + summary + '\'' +
				", cover_img='" + cover_img + '\'' +
				", price=" + price +
				", create_time=" + create_time +
				'}';
	}
}
