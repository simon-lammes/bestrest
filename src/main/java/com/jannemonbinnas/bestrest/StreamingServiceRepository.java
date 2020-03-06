package com.jannemonbinnas.bestrest;

import com.jannemonbinnas.bestrest.model.StreamingService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "streamingServices", path = "streamingServices")
public interface StreamingServiceRepository extends PagingAndSortingRepository<StreamingService, Long> {
}
