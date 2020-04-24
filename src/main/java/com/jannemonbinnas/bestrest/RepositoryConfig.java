package com.jannemonbinnas.bestrest;

import com.jannemonbinnas.bestrest.model.Game;
import com.jannemonbinnas.bestrest.model.Publisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Publisher.class, Game.class);
    }
}
