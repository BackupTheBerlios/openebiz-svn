package org.openebiz.dao.common.cbc;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cbc.InformationType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class InformationTypeDAOImpl extends HibernateDaoSupport implements InformationTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(InformationTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(InformationType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public InformationType getById(Long id) {
		InformationType value = null;
		Session session = getSession();
		value = (InformationType) session.load(InformationType.class, id);
		return value;
	}

	public List findByCriteria(SearchCriteria criteria) {
		List values = null;
		Session session = getSession();
		Criteria crit = getHBCriteria(session, criteria);
		if (criteria.startFrom < criteria.maxResults && criteria.startFrom > -1) {
			crit.setFirstResult(criteria.startFrom);
			crit.setMaxResults(criteria.maxResults - criteria.startFrom);
		}
		values = crit.list();
		return values;
	}

	private Criteria getHBCriteria(Session session, SearchCriteria criteria) {
		Criteria newCriteria = session.createCriteria(InformationType.class);
		if (criteria.getInternalId() != null) {
			newCriteria.add(Restrictions.eq("internalId", criteria
					.getInternalId()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("internalId")))
			newCriteria.addOrder(Order.asc("internalId"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("internalId")))
			newCriteria.addOrder(Order.desc("internalId"));
		if (criteria.getVersion() != null) {
			newCriteria.add(Restrictions.eq("version", criteria.getVersion()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("version")))
			newCriteria.addOrder(Order.asc("version"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("version")))
			newCriteria.addOrder(Order.desc("version"));
		if (criteria.getValue() != null) {
			newCriteria.add(Restrictions.eq("value", criteria.getValue()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("value")))
			newCriteria.addOrder(Order.asc("value"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("value")))
			newCriteria.addOrder(Order.desc("value"));
		if (criteria.getLanguageID() != null) {
			newCriteria.add(Restrictions.eq("languageID", criteria
					.getLanguageID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("languageID")))
			newCriteria.addOrder(Order.asc("languageID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("languageID")))
			newCriteria.addOrder(Order.desc("languageID"));
		return newCriteria;
	}

	public void insert(InformationType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(InformationType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public InformationType merge(InformationType value) {
		InformationType newValue = null;
		Session session = getSession();
		newValue = (InformationType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(InformationType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		InformationType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
