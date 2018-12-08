package opencredit.repository;

import opencredit.model.Creditcard;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CreditcardRepository extends MongoRepository<Creditcard, String> {
    public List<Creditcard> findByIdentificationAndBank(String identification, String bank);
	public List<Creditcard> findByIdentification(String identification);
}