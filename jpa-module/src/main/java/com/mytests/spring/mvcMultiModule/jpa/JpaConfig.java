package com.mytests.spring.mvcMultiModule.jpa;

import com.mytests.spring.mvcMultiModule.data.DataConfig;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * *
 * <p>Created by irina on 06.07.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
@Configuration
@EnableJpaRepositories
@EntityScan("com.mytests.spring.mvcMultiModule.data.entities")
@Import(DataConfig.class)
public class JpaConfig {
}
