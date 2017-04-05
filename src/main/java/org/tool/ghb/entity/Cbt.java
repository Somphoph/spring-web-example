/**
 * 
 */
package org.tool.ghb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author somphoho
 *
 */
@Entity
public class Cbt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CbtId id;
	
	@Column(name="BEGIN_CHQ_ALPHA")
	private String beginChqAlpha;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CHQ_ISSU_DATE")
	private Date chqIssuDate;
	
	@Column(name="CHQ_NUM_OF_LVS")
	private String chqNumOfLvs;
	
	@Column(name="CHQ_LVS_STAT")
	private String chqLvsStat;


	public String getBeginChqAlpha() {
		return beginChqAlpha;
	}

	public void setBeginChqAlpha(String beginChqAlpha) {
		this.beginChqAlpha = beginChqAlpha;
	}

	public Date getChqIssuDate() {
		return chqIssuDate;
	}

	public void setChqIssuDate(Date chqIssuDate) {
		this.chqIssuDate = chqIssuDate;
	}

	public String getChqNumOfLvs() {
		return chqNumOfLvs;
	}

	public void setChqNumOfLvs(String chqNumOfLvs) {
		this.chqNumOfLvs = chqNumOfLvs;
	}

	public String getChqLvsStat() {
		return chqLvsStat;
	}

	public void setChqLvsStat(String chqLvsStat) {
		this.chqLvsStat = chqLvsStat;
	}
	
	
}
