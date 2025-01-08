package epicode.it.S6_L2_BE.web.controller;

import epicode.it.S6_L2_BE.db.pojo.AutorePost;
import epicode.it.S6_L2_BE.db.repo.AutoreRepo;
import epicode.it.S6_L2_BE.db.serv.AutoreServ;
import epicode.it.S6_L2_BE.web.request.AutoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autori")
public class AutoreController {
    @Autowired
    AutoreServ as;

    @GetMapping
    public ResponseEntity<List<AutorePost>>listAll(){
        List<AutorePost> listaAutori = as.findAll();

        return ResponseEntity.ok(listaAutori);
    }

    @PostMapping
    public ResponseEntity<?> saveAutore(@RequestBody AutoreRequest newA) {
        return ResponseEntity.status(HttpStatus.CREATED).body(as.create(newA));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorePost>findById(@PathVariable Long id){
        return ResponseEntity.ok(as.findByID(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AutorePost>modificaAutore(@PathVariable Long id, @RequestBody AutoreRequest newA){
        return ResponseEntity.ok(as.modifica(id,newA));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        as.delete(id);
        return ResponseEntity.ok("Autore eliminato con successo");
    }

}
