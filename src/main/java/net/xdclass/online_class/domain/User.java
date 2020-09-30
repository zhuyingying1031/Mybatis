package net.xdclass.online_class.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *   `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 *   `name` varchar(128) DEFAULT NULL COMMENT '昵称',
 *   `pwd` varchar(124) DEFAULT NULL COMMENT '密码',
 *   `head_img` varchar(524) DEFAULT NULL COMMENT '头像',
 *   `phone` varchar(64) DEFAULT '' COMMENT '手机号',
 *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 */
public class User  implements Serializable{

	private int id;

	private  String name;

	private String pwd;

	private  String HeadImg;

	private String phone;

	private Date createTime;

	private List<VideoOrder> videoOrderList;

	public List<VideoOrder> getVideoOrderList() {
		return videoOrderList;
	}

	public void setVideoOrderList(List<VideoOrder> videoOrderList) {
		this.videoOrderList = videoOrderList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getHeadImg() {
		return HeadImg;
	}

	public void setHeadImg(String headImg) {
		HeadImg = headImg;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTimel(Date createTimel) {
		this.createTime= createTimel;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", pwd='" + pwd + '\'' +
				", HeadImg='" + HeadImg + '\'' +
				", phone='" + phone + '\'' +
				", createTime=" + createTime +
				", videoOrderList=" + videoOrderList +
				'}';
	}
}
