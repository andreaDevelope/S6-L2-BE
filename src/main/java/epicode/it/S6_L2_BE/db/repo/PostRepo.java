package epicode.it.S6_L2_BE.db.repo;

import epicode.it.S6_L2_BE.db.pojo.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
