package opencredit.repository;

import opencredit.model.LoanHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoanHistoryRepository extends MongoRepository<LoanHistory, String> {
	public List<LoanHistory> findByIdentificationAndStatus(String identification, String status);
	public List<LoanHistory> findByIdentificationAndDue(String identification, Boolean due);
	public List<LoanHistory> findByIdentification(String identification);
}