package eam.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eam.app.model.User;
import eam.app.repository.repositoryUser;

@Service
public class userService{

	private repositoryUser repositoryUser;
	
	//se inyecta con 
	
	@Autowired
	public userService(repositoryUser repositoryUser) {
		this.repositoryUser = repositoryUser;
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return repositoryUser.findByUsernameAndPassword(username, password);
	}
	
}
