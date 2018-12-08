package opencredit.repository;

import opencredit.model.Deposite;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DepositeRepository extends MongoRepository<Deposite, String> {
    public List<Deposite> findByIdentificationAndBank(String identification, String bank);
	public List<Deposite> findByIdentification(String identification);
}