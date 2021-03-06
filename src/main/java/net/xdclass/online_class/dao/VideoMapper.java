package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {
	Video selectById(@Param("video_id") int videoId);
	List<Video> selectListByXML();
	@Select("select * from video")
	List<Video> selectList();
	List<Video> selectByPointAndTitleLike(@Param("point") float point,@Param("title") String title);
	int add( Video video);
	int addBatch ( List <Video> list);
	int updateVideo(Video video);
	int updateVideoSelective(Video video);
	int deleteByCreateTimeAndPrice(Map<String,Object> map);
	Video selectBaseFieldByIdWithResultMap (@Param("video_id") int videoId);

}