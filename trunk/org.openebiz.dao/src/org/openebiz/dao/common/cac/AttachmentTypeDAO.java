package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.EmbeddedDocumentBinaryObjectType;
import org.openebiz.core.common.cac.ExternalReferenceType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.AttachmentType;

public interface AttachmentTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		EmbeddedDocumentBinaryObjectType embeddedDocumentBinaryObject;

		ExternalReferenceType externalReference;

		int startFrom;

		int maxResults;

		Set<String> ascending;

		Set<String> descending;

		public Long getInternalId() {
			return this.internalId;
		}

		public void setInternalId(Long value) {
			this.internalId = value;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer value) {
			this.version = value;
		}

		public EmbeddedDocumentBinaryObjectType getEmbeddedDocumentBinaryObject() {
			return this.embeddedDocumentBinaryObject;
		}

		public void setEmbeddedDocumentBinaryObject(
				EmbeddedDocumentBinaryObjectType value) {
			this.embeddedDocumentBinaryObject = value;
		}

		public ExternalReferenceType getExternalReference() {
			return this.externalReference;
		}

		public void setExternalReference(ExternalReferenceType value) {
			this.externalReference = value;
		}

		public void addAscendingOrder(String propertyName) {
			if (ascending == null)
				ascending = new HashSet<String>();
			ascending.add(propertyName);
			if ((descending != null) && (descending.contains(propertyName)))
				descending.remove(propertyName);
		}

		public void addDescendingOrder(String propertyName) {
			if (descending == null)
				descending = new HashSet<String>();
			descending.add(propertyName);
			if ((ascending != null) && (ascending.contains(propertyName)))
				ascending.remove(propertyName);
		}
	}

	public List getAll();

	public Iterator iterateAll();

	public AttachmentType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(AttachmentType value);

	public void update(AttachmentType value);

	public AttachmentType merge(AttachmentType value);

	public void delete(AttachmentType value);

	public void delete(Long id);
}
