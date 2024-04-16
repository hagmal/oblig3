package data1700.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Kinobillett innBillett) {
        String sql = "INSERT INTO Kinobillett (film, antall, fornavn, etternavn, telefonnr, epost) VALUES(?, ?, ?, ?, ?, ?)";
        db.update(sql, innBillett.getFilm(), innBillett.getAntall(), innBillett.getFornavn(), innBillett.getEtternavn(), innBillett.getTelefonnr(), innBillett.getEpost());
    }

    public List<Kinobillett> hentAlleBilletter() {
        String sql = "SELECT * FROM Kinobillett";
        List<Kinobillett> alleBilletter = db.query(sql, new BeanPropertyRowMapper(Kinobillett.class));
        return alleBilletter;
    }

    public void slettAlleBilletter() {
        String sql = "DELETE FROM Kinobillett";
        db.update(sql);
    }
}
