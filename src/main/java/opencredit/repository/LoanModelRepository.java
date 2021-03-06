package opencredit.repository;

import opencredit.model.LoanModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoanModelRepository extends MongoRepository<LoanModel, String> {
	public LoanModel findByProduct(String product);
	public List<LoanModel> findByType(String type);
}