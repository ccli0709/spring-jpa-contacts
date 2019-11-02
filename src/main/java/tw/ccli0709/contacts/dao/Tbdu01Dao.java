package tw.ccli0709.contacts.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tw.ccli0709.contacts.entity.Tbdu01;

@Repository
public interface Tbdu01Dao extends PagingAndSortingRepository<Tbdu01, Long> {

	Tbdu01 findByIdUserno(String userno);

	Page<Tbdu01> findAll(Pageable pageable);

	List<Tbdu01> findByCnameLike(String cname);

	@Query("from Tbdu01 a where a.cname like :keyword or a.address like:keyword")
	List<Tbdu01> findByFuzzyQuery(@Param("keyword") String keyword);

	@Query(value = "SELECT t1.CNAME, t1.DEPNO, t1.ADDRESS, t2.LASTDATE " + "FROM sdms.tbdu01 t1, sdms.tbdu02 t2 "
			+ "where t1.USERNO = t2.USERNO AND t1.DEPNO NOT LIKE 'GC%' ", countQuery = "SELECT count(*) FROM sdms.tbdu01 t1", nativeQuery = true)
	Page<Object[]> findByNativeJoin(Pageable pageable);
}
