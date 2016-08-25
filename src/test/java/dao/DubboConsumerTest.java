package dao;
/**
 *  
 *  吴伟 版权所有
 */


import com.marker.dubbo.IService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用户数据库操作对象测试
 * @author marker
 * @date 2015-08-01 上午9:47:26
 * @version 1.0
 * @blog www.yl-blog.com
 * @weibo http://t.qq.com/wuweiit
 */
//@Transactional(isolation=Isolation.READ_UNCOMMITTED) /* 配置未提交读事务 */ 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {
		"classpath:config/spring/spring-dubbo-cu.xml"
}
)
public class DubboConsumerTest {


    // 注入Dubbo服务
	@Autowired @Qualifier("myService")
	IService service;


    /**
     *
     * @throws Exception
     */
	@Test public void test() throws Exception{

        System.out.println("====================================");
		String result = service.sayHello("ahhadsadsadsadsadsad");
        System.out.println("====================================");
        System.out.println(result);
        System.out.println("====================================");
	}
}
 