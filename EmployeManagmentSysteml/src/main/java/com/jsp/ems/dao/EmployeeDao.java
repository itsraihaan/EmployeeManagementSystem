package com.jsp.ems.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ems.entity.Employee;

@Component
public class EmployeeDao {
	
	@Autowired
	private EntityManager entityManager ;
	/*
	 * Step - 1 save operation 
	 */
	public Employee saveEmployee(Employee employee) {
		
		EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		return employee ;
	}
	/*
	 * step - 2 findOpration 
	 */
	public Employee findEmployeeById(int eid) {
		
		return entityManager.find(Employee.class, eid) ;
	}
	
	/*
	 * step - 3 update 
	 */
	public Employee updateEmployee(Employee employee) {
		
		EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
	    entityManager.merge(employee) ;
	    transaction.commit();
	    
	    return employee ;
	}
	
	public boolean deleteEmployee (Employee employee) {
		
        EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
	    entityManager.remove(employee) ;
	    transaction.commit();
	    
	    return true ;
	}
}


