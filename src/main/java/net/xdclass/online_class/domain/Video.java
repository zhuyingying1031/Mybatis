package net.xdclass.online_class.domain;

import java.io.Serializable;
import java.util.Date;


public class Video implements Serializable {
	private  int id;
	private String title;
	private String summary;
	private String 	coverImg;
	private float price;
	private Date createTime;
	private  float point;

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

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

	public String getCoverImg() {
		return coverImg;
	}

	public void setCoverImg(String cover_img) {
		this.coverImg = cover_img;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreate_time() {
		return createTime;
	}

	public void setCreate_time(Date create_time) {
		this.createTime = create_time;
	}

	@Override
	public String toString() {
		return "Video{" +
				"id=" + id +
				", title='" + title + '\'' +
				", summary='" + summary + '\'' +
				", coverImg='" + coverImg + '\'' +
				", price=" + price +
				", createTime=" + createTime +
				", point=" + point +
				'}';
	}
}
