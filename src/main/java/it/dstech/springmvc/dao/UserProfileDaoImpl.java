package it.dstech.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import it.dstech.springmvc.model.UserProfile;

@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile> implements UserProfileDao {

	public UserProfile findById(int id) {
		return getByKey(id);
	}

	public UserProfile findByRole(String role) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("role", role));
		return (UserProfile) crit.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<UserProfile> findAll() {
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("role"));
		return (List<UserProfile>) crit.list();
	}

}
