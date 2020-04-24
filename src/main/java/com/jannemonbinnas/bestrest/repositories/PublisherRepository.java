package com.jannemonbinnas.bestrest.repositories;

import com.jannemonbinnas.bestrest.model.Publisher;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "publishers", path = "publishers")
public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Long> {
}
