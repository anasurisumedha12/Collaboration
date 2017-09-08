package com.collaboration.DAO;

import java.util.List;
import com.collaboration.model.Blog;
public interface BlogDAO
{
	public boolean createdBlog(Blog blog);
	public Blog getBlog (int blogId);
	public List<Blog>getBlogs();
	public boolean approvedBlog(Blog blog);
	public boolean editBlog(int blogId);
	public boolean delateBlog(int blogId);
}