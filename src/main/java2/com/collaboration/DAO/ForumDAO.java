package com.collaboration.DAO;

import java.util.List;

import com.collaboration.model.Blog;
import com.collaboration.model.Forum;

public interface ForumDAO {

	public boolean createForum(Forum forum);
	public Forum getForumdetails(int forumId);
	public List<Forum> getForum();
	public boolean approveForum(Forum forum);
	public boolean editForum(int forumId);
	public boolean deleteForum(int forumId);
}