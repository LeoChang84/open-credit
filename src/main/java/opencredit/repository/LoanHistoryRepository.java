package opencredit.repository;

import opencredit.model.LoanHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoanHistoryRepository extends MongoRepository<LoanHistory, String> {

	public List<LoanHistory> findByIdentification(String identification);
}