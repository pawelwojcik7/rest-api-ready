package pl.wojcik.restapiready;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "animals", path="animals")
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {
    List<Animal> findByName(@Param("name") String name);
}
