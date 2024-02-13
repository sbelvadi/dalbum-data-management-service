package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the credit database table.
 * 
 */
@Entity
@Table(name="credit")
@NamedQuery(name="Credit.findAll", query="SELECT c FROM Credit c")
public class Credit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="credit_id")
	private int creditId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="credit_category_id")
	private int creditCategoryId;

	@Column(name="credit_role_id")
	private String creditRoleId;

	private String email;

	private String firstname;

	private int forAll;

	private String lastname;

	@Column(name="material_id")
	private int materialId;

	@Column(name="material_sub_category_id")
	private int materialSubCategoryId;

	@Lob
	@Column(name="special_thanks")
	private String specialThanks;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	@Lob
	@Column(name="website_url")
	private String websiteUrl;

	//bi-directional many-to-one association to Dalbum
	@ManyToOne
	@JoinColumn(name="dalbum_id")
	private Dalbum dalbum;

	public Credit() {
	}

	public int getCreditId() {
		return this.creditId;
	}

	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getCreditCategoryId() {
		return this.creditCategoryId;
	}

	public void setCreditCategoryId(int creditCategoryId) {
		this.creditCategoryId = creditCategoryId;
	}

	public String getCreditRoleId() {
		return this.creditRoleId;
	}

	public void setCreditRoleId(String creditRoleId) {
		this.creditRoleId = creditRoleId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getForAll() {
		return this.forAll;
	}

	public void setForAll(int forAll) {
		this.forAll = forAll;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public int getMaterialSubCategoryId() {
		return this.materialSubCategoryId;
	}

	public void setMaterialSubCategoryId(int materialSubCategoryId) {
		this.materialSubCategoryId = materialSubCategoryId;
	}

	public String getSpecialThanks() {
		return this.specialThanks;
	}

	public void setSpecialThanks(String specialThanks) {
		this.specialThanks = specialThanks;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public Dalbum getDalbum() {
		return this.dalbum;
	}

	public void setDalbum(Dalbum dalbum) {
		this.dalbum = dalbum;
	}

}