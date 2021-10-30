package simple.app.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import simple.app.server.domain.BlockedSite;

import java.util.List;

@Repository
public interface BlockedSiteRepository extends JpaRepository<BlockedSite, Integer> {
    @Query("select b from BlockedSite b order by b.id ASC ")
    List<BlockedSite> sortByIdAsc();

    @Query("select b from BlockedSite b order by b.id DESC ")
    List<BlockedSite> sortByIdDesc();
}
