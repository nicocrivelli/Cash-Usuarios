package cash.ncrivelli.rest;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import cash.ncrivelli.dao.LoansDAO;
import cash.ncrivelli.model.Loans;

@RestController
@RequestMapping("loans")
public class LoansRest {

	@Autowired
	private LoansDAO loansDAO;

	@GetMapping
	public Page<Loans> findPaginated(@RequestParam("page") int page,
			@RequestParam("size") int size) {
		return loansDAO.findAll(PageRequest.of(page, size));
	}
}
