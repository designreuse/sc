package payment.pcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payment.pcc.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, String> {
}
