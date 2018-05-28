package cn.boot.home.cache;

import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

//@Configuration
//@EnableCaching // 标注启动缓存
public class CacheConfiguration {

	/**
     * ehcache 主要的管理器
     * @param bean
     * @return
     */
//    @Bean
//    public EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean bean){
//        return new EhCacheCacheManager(bean.getObject());
//    }
//    
//    @Bean
//    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
//        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
//
//        factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
//        factoryBean.setShared(true);
//
//        return factoryBean;
//    }
}
