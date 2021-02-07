/**
 * CustomMvcConfig.java
 * Created at 2019-8-19
 * Created by yang
 * Copyright (C) 2019 SAIC VOLKSWAGEN, All rights reserved.
 */
package com.yang.cloud.base.config.mvc;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * <p>
 * ClassName: CustomMvcConfig
 * </p>
 * <p>
 * Description: MVC配置文件国际化
 * </p>
 * <p>
 * Author: yang
 * </p>
 * <p>
 * Date: 2019年9月16日
 * </p>
 *
 * @author yang
 */
@Configuration
public class CustomMvcConfig implements WebMvcConfigurer {


    /**
     * <p>
     * Description:注入国际化
     * </p>
     *
     * @return LocaleResolver LocaleResolver
     */
    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
        acceptHeaderLocaleResolver.setDefaultLocale(Locale.SIMPLIFIED_CHINESE);
        return acceptHeaderLocaleResolver;
    }


}
