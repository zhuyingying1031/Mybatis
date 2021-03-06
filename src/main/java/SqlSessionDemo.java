import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.dao.VideoOrderMapper;
import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.Video;
import net.xdclass.online_class.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class SqlSessionDemo {
		public static void main(String [] args) throws IOException {
			String resouce = "config/mybatis-config.xml";
			//读取配置文件
			InputStream inputStream =  Resources.getResourceAsStream(resouce);
			//构建Session工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//获取Session
			try(SqlSession sqlSession = sqlSessionFactory.openSession()){
				VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
				/**
				 * 第一种获取，配合VideoMapper.xml一起使用
				 *(1)
				 *Video video = videoMapper.selectById(40);
				 * 				System.out.println(video.toString());
				 *
				 * (2)
				 * 	List<Video> videoList =  videoMapper.selectByPointAndTitleLike((float) 8.7,"HTML");
				 * 				System.out.println(videoList.toString());
				 */


				/**
				 * 通过注解.配合VideoMapper中是注解sql一起使用
				 * List<Video> videoList =  videoMapper.selectList();
				 * System.out.println(videoList.toString());
				 */


				/**新增一条记录
				 * Video video =  new Video();
				 * 				video.setTitle("小滴课堂面试专题900道");
				 * 				video.setCoverImg("xdclass.net/aaa.png");
				 * 				video.setPoint((float) 9.4);
				 * 				video.setCreate_time(new Date());
				 * 				video.setPrice(9900);
				 * 				video.setSummary("这个是面试专题概要");
				 * 				int rows = videoMapper.add(video);
				 * 				System.out.println(rows);
				 * 				System.out.println(video.toString());
				 */

				/**
				 * 新增多条记录
				 * Video video=new Video();
				 * 				video.setTitle("小滴课堂面试专题900道");
				 * 				video.setCoverImg("xdclass.net/aaa.png");
				 * 				video.setPoint((float) 9.4);
				 * 				video.setCreate_time(new Date());
				 * 				video.setPrice(9900);
				 * 				video.setSummary("这个是面试专题概要111");
				 * 				Video video1 =  new Video();
				 * 				video1.setTitle("小滴课堂面试专题900道111");
				 * 				video1.setCoverImg("xdclass.net/aaa111.png");
				 * 				video1.setPoint((float) 9.4);
				 * 				video1.setCreate_time(new Date());
				 * 				video1.setPrice(9900);
				 * 				video1.setSummary("这个是面试专题概要111");
				 * 				List <Video>  videoList =  new ArrayList<>();
				 * 				videoList.add(video);
				 * 				videoList.add(video1);
				 * 				int rows = videoMapper.addBatch(videoList);
				 */


				/**
				 * 更新
				 * Video video =  new Video();
				 * 				video.setId(50);
				 * 				video.setTitle("小滴课堂面试专题900道");
				 * 				video.setCoverImg("xdclass.net/aaa.png");
				 * 				video.setPoint((float) 9.4);
				 * 				video.setCreate_time(new Date());
				 * 				video.setPrice(9900);
				 * 				video.setSummary("这个是面试专题概要");
				 * 				int rows = videoMapper.updateVideo(video);
				 * 				System.out.println(rows);
				 * 				System.out.println(video.toString());
				 *
				 * 		指定更新某几个字段
				 * 	Video video =  new Video();
				 * 				video.setId(50);
				 * 				video.setTitle("小滴课堂面试专题900道---------");
				 * 				video.setSummary("这个是面试专题概要---------");
				 * 				int rows = videoMapper.updateVideoSelective(video);
				 * 				System.out.println(rows);
				 * 				System.out.println(video.toString());
				 *
				 */


				/**
				 * 删除
				 *Map<String,Object> map =new HashMap<>();
				 * 				map.put("createTime","2020-09-28 03:14:36");
				 * 				map.put("price","9901");
				 * 				int rows = videoMapper.deleteByCreateTimeAndPrice(map);
				 */

				/**
				 * resultMap结果集验证
				 * Video video =  videoMapper.selectBaseFieldByIdWithResultMap(45);
				 * 				System.out.println(video.toString());
				 */


				/**association验证
				 * VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
				 * List<Video> videoList=videoOrderMapper.queryVideoOrderList();
				 * System.out.println(videoList.toString());
				 */

				/**
				 * 二级缓存
				 *
				 * VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
				 * 				List<User> userList=videoOrderMapper.queryUserOrder();
				 * 				System.out.println(userList.toString());
				 */


				/**
				 * 懒加载
				 */
				VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
				List<VideoOrder> videoList=videoOrderMapper.queryVideoOrderListLazy();
				/*
				 * 不注释，查询2次数据，注释一条，只查询一次数据
				 */
				System.out.println(videoList.get(1).getId());
				System.out.println(videoList.get(1).getUser().getName());



			}
		}

}
