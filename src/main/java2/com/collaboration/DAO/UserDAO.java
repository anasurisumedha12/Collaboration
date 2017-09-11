package com.collaboration.DAO;

import java.util.List;

import com.collaboration.model.User;

public interface UserDAO {
	public boolean createUser(User user);
	public User getUser(int userId);
	public List<User> getUsers();
	public boolean approveUser(User user);
	public boolean editUser(int userId);
	public boolean deleteUser(int userId);

}