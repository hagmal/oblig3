package data1700.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    BillettRepository repository;

    // Lagrer en ny billett, og sender billettobjektet til databasen
    @PostMapping("/lagreBillett")
    public void lagreBillett (Kinobillett innBillett) {
        repository.lagreBillett(innBillett);
    }

    // Henter alle lagrede billetter fra databasen
    @GetMapping("/hentBilletter")
    public List<Kinobillett> hentBilletter() {
        return repository.hentAlleBilletter();
    }

    // Sletter alle lagrede billetter fra databasen
    @DeleteMapping ("/slettAlleBilletter")
    public void slettAlleBilletter() {
        repository.slettAlleBilletter();
    }
}
