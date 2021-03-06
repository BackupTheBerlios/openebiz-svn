package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.AttachmentType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class AttachmentTypeDAOImpl extends HibernateDaoSupport implements AttachmentTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(AttachmentTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(AttachmentType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public AttachmentType getById(Long id) {
		AttachmentType value = null;
		Session session = getSession();
		value = (AttachmentType) session.load(AttachmentType.class, id);
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
		Criteria newCriteria = session.createCriteria(AttachmentType.class);
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
		if (criteria.getEmbeddedDocumentBinaryObject() != null) {
			newCriteria.add(Restrictions.eq("embeddedDocumentBinaryObject",
					criteria.getEmbeddedDocumentBinaryObject()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("embeddedDocumentBinaryObject")))
			newCriteria.addOrder(Order.asc("embeddedDocumentBinaryObject"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("embeddedDocumentBinaryObject")))
			newCriteria.addOrder(Order.desc("embeddedDocumentBinaryObject"));
		if (criteria.getExternalReference() != null) {
			newCriteria.add(Restrictions.eq("externalReference", criteria
					.getExternalReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("externalReference")))
			newCriteria.addOrder(Order.asc("externalReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("externalReference")))
			newCriteria.addOrder(Order.desc("externalReference"));
		return newCriteria;
	}

	public void insert(AttachmentType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(AttachmentType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public AttachmentType merge(AttachmentType value) {
		AttachmentType newValue = null;
		Session session = getSession();
		newValue = (AttachmentType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(AttachmentType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		AttachmentType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
