package net.magus.sitedesigner.base.model;

import java.io.Serializable;
import java.util.Date;

public abstract class Auditor implements Serializable {
	private static final long serialVersionUID = 1079047297575781888L;
	
	private long id;
	private Date createdDate;
	private Date lastModified;
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj != null && obj instanceof Auditor) {
			result = ((Auditor) obj).getId() == this.id;
		}
		
		return result;
	}
}
