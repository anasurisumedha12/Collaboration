package com.collaboration.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.collaboration.model.Blog;

public class BlogDAOImpl implements BlogDAO {
	@Autowired
	SessionFactory sessionFactory;
	public BlogDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory; 
	}
	public boolean createBlog(Blog blog) {
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Araised" +e);
		return false;
		}
		
		
	}

	public Blog getBlog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> getBlogs() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from blog where status='A'");
		List<Blog> listBlog=query.list();
		session.close();
		// TODO Auto-generated method stub
		return listBlog;
	}
     @Transactional
   
	public boolean approveBlog(Blog blog) {
		try{
			
			blog.setStatus("A");
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
	catch(Exception e){
		System.out.println("Exception Araised" +e);
		return false;
	}
	}

	public boolean editBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean createdBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean approvedBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delateBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

}