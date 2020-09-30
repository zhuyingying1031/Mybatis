package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.Video;
import net.xdclass.online_class.domain.VideoOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoOrderMapper {
	List<Video> queryVideoOrderList();
	List<User> queryUserOrder();
	List<VideoOrder> queryVideoOrderListLazy();
}