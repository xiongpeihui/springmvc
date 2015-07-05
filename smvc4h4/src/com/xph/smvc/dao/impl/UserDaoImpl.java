package com.xph.smvc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.xph.smvc.dao.UserDao;
import com.xph.smvc.entity.User;

@Repository(value = "userDao")
public class UserDaoImpl   implements UserDao {
	@Resource
	HibernateTemplate hibernateTemplate;

	/*
	 * @Resource(name="sessionFactory") SessionFactory sessionFactory;
	 */
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().delete(u);
		// em.remove(u);
		hibernateTemplate.delete(u);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		return (List<User>)hibernateTemplate.find("from User");
		// Query query = em.createQuery("from User");
		// List<User> list = query.getResultList();
		// return list;
		// TODO Auto-generated method stub

		// return (List<User>) sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public User findUserById(Integer id) {
		return hibernateTemplate.get(User.class, id);
		// return em.find(User.class, id);
		// TODO Auto-generated method stub
		// return (User) sessionFactory.getCurrentSession().get(User.class, id);

	}

	public void saveUser(User u) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().save(u);
		// em.persist(u);
		hibernateTemplate.persist(u);
	}

	public void updateUser(User u) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().update(u);
		// em.merge(u);
		hibernateTemplate.merge(u);
	}

	@SuppressWarnings("unused")
	public List<User> findPage() {
		hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from User").setFirstResult(1).setMaxResults(5).uniqueResult();
		Long count = (Long) hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("SELECT COUNT(*) FROM Topic t WHERE t.forum.id=?").setParameter(0, null)//
				.uniqueResult();
		return null;

	}

}
