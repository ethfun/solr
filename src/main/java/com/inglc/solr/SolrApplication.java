package com.inglc.solr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.web.context.annotation.ApplicationScope;

@SpringBootApplication
@EnableSolrRepositories(basePackages = "com.inglc.solr.repository")
public class SolrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolrApplication.class, args);
	}

}

