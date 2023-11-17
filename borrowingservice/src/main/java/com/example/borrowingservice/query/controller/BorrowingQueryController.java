package com.example.borrowingservice.query.controller;

import java.util.List;

import com.example.borrowingservice.query.model.BorrowingResponseModel;
import com.example.borrowingservice.query.queries.GetAllBorrowing;
import com.example.borrowingservice.query.queries.GetListBorrowingByEmployeeQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/borrowing")
public class BorrowingQueryController {
	@Autowired
	private QueryGateway queryGateway;
	
	@GetMapping("/{employeeId}")
	public List<BorrowingResponseModel> getBorrowingByEmployee(@PathVariable String employeeId){
		GetListBorrowingByEmployeeQuery getBorrowingQuery = new GetListBorrowingByEmployeeQuery();
		getBorrowingQuery.setEmployeeId(employeeId);
		
		List<BorrowingResponseModel> list = 
			queryGateway.query(getBorrowingQuery, ResponseTypes.multipleInstancesOf(BorrowingResponseModel.class))
			.join();
		
		return list;
	}
	@GetMapping
	public List<BorrowingResponseModel> getAllBorrowing(){
		List<BorrowingResponseModel> list = queryGateway.query(new GetAllBorrowing(), ResponseTypes.multipleInstancesOf(BorrowingResponseModel.class))
				.join();
		return list;
	}
}