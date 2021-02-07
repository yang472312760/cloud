package com.yang.cloud.base.config.mybatis;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <p>@ProjectName:bingo-framework-base</p>
 * <p>@Package:com.bingo.framework.base.config.mybatis</p>
 * <p>@ClassName:MybatisConfig</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2020/3/24 14:47</p>
 * <p>@Version:1.0</p>
 */
@Configuration
@ConditionalOnClass(MybatisPlusAutoConfiguration.class)
public class MybatisConfig {

    /**
     * 性能分析器开关
     */
    @Value("${mybatis-plus.performance.open:true}")
    private Boolean isOpen;

    /**
     * 性能分析器SQL执行最大时长
     */
    @Value("${mybatis-plus.performance.max-time:2000}")
    private long maxTime;

    /**
     * <p>
     * Description: 性能分析和格式化SQL语句，开发环境使用。
     * </p>
     *
     * @return PerformanceInterceptor PerformanceInterceptor
     */
    @Bean
    @Profile({ "dev", "devtest" })
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        if (true == isOpen) {
            performanceInterceptor.setMaxTime(maxTime);
            performanceInterceptor.setFormat(true);
        } else {
            performanceInterceptor = null;
        }
        return performanceInterceptor;
    }

    /**
     * <p>
     *
     * Description: 乐观锁插件
     * </p>
     *
     * @return OptimisticLockerInterceptor 乐观锁插件
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

}
