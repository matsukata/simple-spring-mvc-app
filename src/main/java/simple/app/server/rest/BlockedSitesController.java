package simple.app.server.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simple.app.server.domain.BlockedSite;
import simple.app.server.repository.BlockedSiteRepository;

import java.util.List;

@RestController
@RequestMapping(value = "", produces = "application/json")
public class BlockedSitesController {
    private final BlockedSiteRepository repository;
    private final Logger logger = LoggerFactory.getLogger(BlockedSitesController.class);

    public BlockedSitesController(BlockedSiteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/blocked-sites")
    public List<BlockedSite> blockedSites() {
        logger.info("Request has been performed");
        return repository.findAll();
    }

    @GetMapping("/get-by-id-asc")
    public List<BlockedSite> getByIdAsc() {
        logger.info("Request has been performed");
        return repository.sortByIdAsc();
    }

    @GetMapping("/get-by-id-desc")
    public List<BlockedSite> getByIdDesc() {
        logger.info("Request has been performed");
        return repository.sortByIdDesc();
    }
}
