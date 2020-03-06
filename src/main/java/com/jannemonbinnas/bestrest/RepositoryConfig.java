package com.jannemonbinnas.bestrest;

import com.jannemonbinnas.bestrest.model.Episode;
import com.jannemonbinnas.bestrest.model.Series;
import com.jannemonbinnas.bestrest.model.StreamingService;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(StreamingService.class, Series.class, Episode.class);
    }
}
