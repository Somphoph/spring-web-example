package org.tool.ghb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CbtId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="BEGIN_CHQ_NUM")
	private String beginChqNum;
	
	@Column(name="ACID")
	private String acid;

	public String getBeginChqNum() {
		return beginChqNum;
	}

	public void setBeginChqNum(String beginChqNum) {
		this.beginChqNum = beginChqNum;
	}

	public String getAcid() {
		return acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
	}
	
	
}
