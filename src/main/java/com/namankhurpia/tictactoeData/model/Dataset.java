package com.namankhurpia.tictactoeData.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public class Dataset {
	
	@Id  
	@Column 
	@GeneratedValue (strategy = GenerationType.AUTO)
	int rownumber;
	
	@Column 
    String aone ;
	
	@Column 
    String atwo;
	
	@Column 
    String athree;
	
	@Column 
    String bone;
	
	@Column 
    String btwo ;
	
	@Column 
    String bthree;
	
	@Column 
	String cone ;
	
	@Column 
	String ctwo;
	
	@Column 
	String cthree;
	
	@Column 
	String ypred ;
	
	@Column 
	String extraone;
	
	@Column 
	String extratwo ;

	public int getRownumber() {
		return rownumber;
	}

	public void setRownumber(int rownumber) {
		this.rownumber = rownumber;
	}

	public String getAone() {
		return aone;
	}

	public void setAone(String aone) {
		this.aone = aone;
	}

	public String getAtwo() {
		return atwo;
	}

	public void setAtwo(String atwo) {
		this.atwo = atwo;
	}

	public String getAthree() {
		return athree;
	}

	public void setAthree(String athree) {
		this.athree = athree;
	}

	public String getBone() {
		return bone;
	}

	public void setBone(String bone) {
		this.bone = bone;
	}

	public String getBtwo() {
		return btwo;
	}

	public void setBtwo(String btwo) {
		this.btwo = btwo;
	}

	public String getBthree() {
		return bthree;
	}

	public void setBthree(String bthree) {
		this.bthree = bthree;
	}

	public String getCone() {
		return cone;
	}

	public void setCone(String cone) {
		this.cone = cone;
	}

	public String getCtwo() {
		return ctwo;
	}

	public void setCtwo(String ctwo) {
		this.ctwo = ctwo;
	}

	public String getCthree() {
		return cthree;
	}

	public void setCthree(String cthree) {
		this.cthree = cthree;
	}

	public String getYpred() {
		return ypred;
	}

	public void setYpred(String ypred) {
		this.ypred = ypred;
	}

	public String getExtraone() {
		return extraone;
	}

	public void setExtraone(String extraone) {
		this.extraone = extraone;
	}

	public String getExtratwo() {
		return extratwo;
	}

	public void setExtratwo(String extratwo) {
		this.extratwo = extratwo;
	}

	public Dataset(int rownumber, String aone, String atwo, String athree, String bone, String btwo, String bthree,
			String cone, String ctwo, String cthree, String ypred, String extraone, String extratwo) {
		super();
		this.rownumber = rownumber;
		this.aone = aone;
		this.atwo = atwo;
		this.athree = athree;
		this.bone = bone;
		this.btwo = btwo;
		this.bthree = bthree;
		this.cone = cone;
		this.ctwo = ctwo;
		this.cthree = cthree;
		this.ypred = ypred;
		this.extraone = extraone;
		this.extratwo = extratwo;
	}
	
	public Dataset() {
		
	}
	
	

}
