package org.openebiz.dao.common.constants;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.currency.CurrencyCodeContentType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CurrencyCodeContentTypeDAOImpl extends HibernateDaoSupport
		implements CurrencyCodeContentTypeDAO {
	

	static private final Log log = LogFactory
			.getLog(CurrencyCodeContentTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(CurrencyCodeContentType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CurrencyCodeContentType getById(Long id) {
		CurrencyCodeContentType value = null;
		Session session = getSession();
		value = (CurrencyCodeContentType) session.load(
				CurrencyCodeContentType.class, id);
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
		Criteria newCriteria = session
				.createCriteria(CurrencyCodeContentType.class);
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
		if (criteria.getLiteral() != null) {
			newCriteria.add(Restrictions.eq("literal", criteria.getLiteral()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("literal")))
			newCriteria.addOrder(Order.asc("literal"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("literal")))
			newCriteria.addOrder(Order.desc("literal"));
		if (criteria.getName() != null) {
			newCriteria.add(Restrictions.eq("name", criteria.getName()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("name")))
			newCriteria.addOrder(Order.asc("name"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("name")))
			newCriteria.addOrder(Order.desc("name"));
		return newCriteria;
	}

	public void insert(CurrencyCodeContentType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CurrencyCodeContentType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CurrencyCodeContentType merge(CurrencyCodeContentType value) {
		CurrencyCodeContentType newValue = null;
		Session session = getSession();
		newValue = (CurrencyCodeContentType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CurrencyCodeContentType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CurrencyCodeContentType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}