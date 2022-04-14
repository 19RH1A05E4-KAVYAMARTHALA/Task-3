package com.Task3.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.Task3.model.*;
@Repository
public interface ICriminalDao {
	
	void add(Criminal cr);
	void delete(Criminal cr);
	void update(Criminal cr);
	List<Criminal> selection();
}