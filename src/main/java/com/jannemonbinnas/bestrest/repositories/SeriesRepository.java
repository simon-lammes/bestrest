package com.jannemonbinnas.bestrest.repositories;

import com.jannemonbinnas.bestrest.model.Series;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "series", path = "series")
public interface SeriesRepository extends PagingAndSortingRepository<Series, Long> {
    List<Series> findByStreamingServiceId(@Param("streamingServiceId") long id);
}
