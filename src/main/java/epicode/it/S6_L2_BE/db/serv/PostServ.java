package epicode.it.S6_L2_BE.db.serv;

import epicode.it.S6_L2_BE.db.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServ {

    @Autowired
    PostRepo pr;
}
