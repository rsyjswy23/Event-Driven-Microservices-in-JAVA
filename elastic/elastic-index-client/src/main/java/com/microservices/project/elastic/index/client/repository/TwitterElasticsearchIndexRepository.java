package com.microservices.project.elastic.index.client.repository;

package com.microservices.project.elastic.index.client.repository;

import com.microservices.project.elastic.model.index.impl.TwitterIndexModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterElasticsearchIndexRepository extends ElasticsearchRepository<TwitterIndexModel, String> {
}
Footer

