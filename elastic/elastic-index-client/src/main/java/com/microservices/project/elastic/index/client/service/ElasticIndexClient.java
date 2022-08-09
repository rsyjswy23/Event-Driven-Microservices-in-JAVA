package com.microservices.project.elastic.index.client.service;

import com.microservices.project.elastic.model.index.IndexModel;

import java.util.List;

public interface ElasticIndexClient<T extends IndexModel> {
    List<String> save(List<T> documents);
}
