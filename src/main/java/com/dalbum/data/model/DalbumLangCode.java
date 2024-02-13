package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dalbum_lang_codes database table.
 * 
 */
@Entity
@Table(name="dalbum_lang_codes")
@NamedQuery(name="DalbumLangCode.findAll", query="SELECT d FROM DalbumLangCode d")
public class DalbumLangCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String ISOCode639_1;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String ISOCode639_2_T;

	@Column(name="language_family")
	private String languageFamily;

	@Column(name="language_name")
	private String languageName;

	@Column(name="language_status")
	private int languageStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public DalbumLangCode() {
	}

	public String getISOCode639_1() {
		return this.ISOCode639_1;
	}

	public void setISOCode639_1(String ISOCode639_1) {
		this.ISOCode639_1 = ISOCode639_1;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getISOCode639_2_T() {
		return this.ISOCode639_2_T;
	}

	public void setISOCode639_2_T(String ISOCode639_2_T) {
		this.ISOCode639_2_T = ISOCode639_2_T;
	}

	public String getLanguageFamily() {
		return this.languageFamily;
	}

	public void setLanguageFamily(String languageFamily) {
		this.languageFamily = languageFamily;
	}

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public int getLanguageStatus() {
		return this.languageStatus;
	}

	public void setLanguageStatus(int languageStatus) {
		this.languageStatus = languageStatus;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}