package cash.ncrivelli.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cash.ncrivelli.model.Loans;

public interface LoansDAO extends JpaRepository<Loans, Integer>{

}
