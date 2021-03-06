package com.sportyshoes.webservice.implementation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.webservice.exceptionhandler.BusinessException;
import com.sportyshoes.webservice.model.Products;
import com.sportyshoes.webservice.model.PurchaseReport;
import com.sportyshoes.webservice.model.User;
import com.sportyshoes.webservice.repository.PurchaseReportRepository;
import com.sportyshoes.webservice.service.PurchaseReportService;


@Service
public class PurchaseReportServiceImplementation implements PurchaseReportService{

	@Autowired
	private PurchaseReportRepository repository;
	
	@Override
	public PurchaseReport createPurchaseReport(PurchaseReport purchaseReport) {
		return repository.save(purchaseReport);
	}

	@Override
	public PurchaseReport updatePurchaseReport(PurchaseReport purchaseReport) {
		return repository.save(purchaseReport);
	}

	@Override
	public PurchaseReport getPurchaseReportById(int id) throws BusinessException {
		PurchaseReport report = null;
		try {
			if (id <= 0) {
				throw new BusinessException("ID cannot be zero or negative");
			}	
			report = repository.findById(id).get();
		} catch(NoSuchElementException e) {
			throw new BusinessException("No PurchaseReport found with id = " + id);
		}
		return report;
	}

	@Override
	public void deletePurchaseReportById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<PurchaseReport> getAllPurchaseReports() {
		return repository.findAll();
	}

	@Override
	public List<PurchaseReport> getAllPurchaseReportsByPurchaseReportCategory(String PurchaseReportCategory) {
		return repository.findByPurchaseReportCategory(PurchaseReportCategory);
	}

	@Override
	public List<PurchaseReport> getAllPurchaseReportsByPurchaseReportDate(String PurchaseReportDate) {
		return repository.findByPurchaseReportDate(PurchaseReportDate);
	}

//	@Override
//	public List<PurchaseReport> findByPurchaseReportId() {
//		return repository.findByPurchaseReportId();
//	}

	@Override
	public List<User> findByUserId() {
		return repository.findByUserId();
	}

	@Override
	public List<Products> findByProductId() {
		return repository.findByProductId();
	}

}

