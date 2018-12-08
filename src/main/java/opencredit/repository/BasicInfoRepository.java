package opencredit.repository;

import opencredit.model.BasicInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasicInfoRepository extends MongoRepository<BasicInfo, String> {

	public BasicInfo findByIdentification(String identification);
}