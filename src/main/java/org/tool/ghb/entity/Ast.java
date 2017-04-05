/**
 * 
 */
package org.tool.ghb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author somphoho
 *
 */
@Entity
public class Ast implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String acid;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PB_LAST_PRNT_TIME")
	private Date pbLastPrntTime;
	
	@Column(name="PB_LAST_PRNT_BAL")
	private BigDecimal pbLastPrntBal;
	
	@Column(name="PB_NUM_OF_BOOK_PRNT")
	private String pbNumOfBookPrnt;
	
	@Column(name="PB_LAST_PRNT_LINE_NUM")
	private String pbLastPrntLineNum;
	
	@Column(name="PB_LAST_PRNT_PAGE_NUM")
	private String pbLastPrntPageNum;
	
	@Column(name="PB_LAST_PRNT_TRAN_ID")
	private String pbLastPrntTranId;
	
	@Column(name="PB_LAST_PRNT_P_TRAN_NUM")
	private String pbLastPrntPtranNum;
	
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	public Date getPbLastPrntTime() {
		return pbLastPrntTime;
	}
	public void setPbLastPrntTime(Date pbLastPrntTime) {
		this.pbLastPrntTime = pbLastPrntTime;
	}
	public BigDecimal getPbLastPrntBal() {
		return pbLastPrntBal;
	}
	public void setPbLastPrntBal(BigDecimal pbLastPrntBal) {
		this.pbLastPrntBal = pbLastPrntBal;
	}
	public String getPbNumOfBookPrnt() {
		return pbNumOfBookPrnt;
	}
	public void setPbNumOfBookPrnt(String pbNumOfBookPrnt) {
		this.pbNumOfBookPrnt = pbNumOfBookPrnt;
	}
	public String getPbLastPrntLineNum() {
		return pbLastPrntLineNum;
	}
	public void setPbLastPrntLineNum(String pbLastPrntLineNum) {
		this.pbLastPrntLineNum = pbLastPrntLineNum;
	}
	public String getPbLastPrntPageNum() {
		return pbLastPrntPageNum;
	}
	public void setPbLastPrntPageNum(String pbLastPrntPageNum) {
		this.pbLastPrntPageNum = pbLastPrntPageNum;
	}
	public String getPbLastPrntTranId() {
		return pbLastPrntTranId;
	}
	public void setPbLastPrntTranId(String pbLastPrntTranId) {
		this.pbLastPrntTranId = pbLastPrntTranId;
	}
	public String getPbLastPrntPtranNum() {
		return pbLastPrntPtranNum;
	}
	public void setPbLastPrntPtranNum(String pbLastPrntPtranNum) {
		this.pbLastPrntPtranNum = pbLastPrntPtranNum;
	}
	
	
	
}
