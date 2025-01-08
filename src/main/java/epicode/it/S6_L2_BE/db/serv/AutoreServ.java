package epicode.it.S6_L2_BE.db.serv;

import epicode.it.S6_L2_BE.db.pojo.AutorePost;
import epicode.it.S6_L2_BE.db.repo.AutoreRepo;
import epicode.it.S6_L2_BE.web.request.AutoreRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoreServ {

    @Autowired
    AutoreRepo ar;

    public List<AutorePost> findAll(){
        return ar.findAll();
    }

    public AutorePost findByID(Long id){
        return ar.findById(id).get();
    }

    public AutorePost create(AutoreRequest newAutore){
        AutorePost a = new AutorePost();
        BeanUtils.copyProperties(newAutore, a);

        return ar.save(a);
    }

    public AutorePost modifica(Long id, AutoreRequest newA){
      AutorePost a = ar.findById(id).get();

      BeanUtils.copyProperties(newA, a);

      return ar.save(a);
    }

    public void delete(Long id){
        AutorePost a = ar.findById(id).get();

        ar.delete(a);
    }

    public AutorePost findById(Long id){
        return ar.findById(id).get();
    }

}
