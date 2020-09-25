import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
				 *
				 *Video video = videoMapper.selectById(40);
				 * 				System.out.println(video.toString());
				 */

				/**
				 * 通过注解.配合VideoMapper中是注解sql一起使用
				 * List<Video> videoList =  videoMapper.selectList();
				 * System.out.println(videoList.toString());
				 */


				List<Video> videoList =  videoMapper.selectByPointAndTitleLike((float) 9.1,"19");
				System.out.println(videoList.toString());


			}
		}

}
