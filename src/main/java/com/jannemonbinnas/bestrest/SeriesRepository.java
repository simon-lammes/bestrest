package com.jannemonbinnas.bestrest;

import com.jannemonbinnas.bestrest.model.Series;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "series", path = "series")
public interface SeriesRepository extends PagingAndSortingRepository<Series, Long> {
    List<Series> findByStreamingServiceId(@Param("streamingServiceId") long id);
}
