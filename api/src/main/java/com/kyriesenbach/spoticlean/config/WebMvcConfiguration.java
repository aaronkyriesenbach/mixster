package com.kyriesenbach.spoticlean.config;

import com.kyriesenbach.spoticlean.auth.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer
{
    private final AuthInterceptor authInterceptor;
    
    @Autowired
    public WebMvcConfiguration(AuthInterceptor authInterceptor)
    {
        this.authInterceptor = authInterceptor;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry)
    {
        interceptorRegistry.addInterceptor(authInterceptor);
    }
}
