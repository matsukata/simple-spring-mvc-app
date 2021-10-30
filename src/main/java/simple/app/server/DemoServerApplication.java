package simple.app.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import simple.app.server.domain.BlockedSite;
import simple.app.server.repository.BlockedSiteRepository;

@SpringBootApplication
public class DemoServerApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoServerApplication.class, args);
        BlockedSiteRepository repository = ctx.getBean(BlockedSiteRepository.class);
        repository.save(new BlockedSite("https://telegram.org/"));
        repository.save(new BlockedSite("https://linkedin.com/"));
    }
}
