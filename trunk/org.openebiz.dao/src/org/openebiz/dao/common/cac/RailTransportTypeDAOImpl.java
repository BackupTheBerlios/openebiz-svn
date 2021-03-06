package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.RailTransportType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class RailTransportTypeDAOImpl extends HibernateDaoSupport implements RailTransportTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(RailTransportTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(RailTransportType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public RailTransportType getById(Long id) {
		RailTransportType value = null;
		Session session = getSession();
		value = (RailTransportType) session.load(RailTransportType.class, id);
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
		Criteria newCriteria = session.createCriteria(RailTransportType.class);
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
		if (criteria.getTrainID() != null) {
			newCriteria.add(Restrictions.eq("trainID", criteria.getTrainID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("trainID")))
			newCriteria.addOrder(Order.asc("trainID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("trainID")))
			newCriteria.addOrder(Order.desc("trainID"));
		if (criteria.getRailCarID() != null) {
			newCriteria.add(Restrictions.eq("railCarID", criteria
					.getRailCarID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("railCarID")))
			newCriteria.addOrder(Order.asc("railCarID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("railCarID")))
			newCriteria.addOrder(Order.desc("railCarID"));
		return newCriteria;
	}

	public void insert(RailTransportType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(RailTransportType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public RailTransportType merge(RailTransportType value) {
		RailTransportType newValue = null;
		Session session = getSession();
		newValue = (RailTransportType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(RailTransportType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		RailTransportType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
