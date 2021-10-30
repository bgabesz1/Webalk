package hu.me.iit.uni.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public class PeopleRepository extends PagingAndSortingRepository<People, Long>{
}
