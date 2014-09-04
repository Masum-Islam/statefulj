package org.statefulj.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.statefulj.framework.core.StatefulFactory;

@Configuration
@EnableTransactionManagement
public class StatefulJConfig {
	
	@Bean
	public StatefulFactory statefulJFactory() {
		return new StatefulFactory();
	}

}