package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the text database table.
 * 
 */
@Entity
@Table(name="text")
@NamedQuery(name="Text.findAll", query="SELECT t FROM Text t")
public class Text implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="text_id")
	private int textId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	@Column(name="dextra_label_id")
	private String dextraLabelId;

	@Column(name="dextra_track_category")
	private String dextraTrackCategory;

	@Column(name="embedded_hidden_dimension_id")
	private int embeddedHiddenDimensionId;

	@Column(name="is_active")
	private int isActive;

	@Column(name="material_category_id")
	private int materialCategoryId;

	@Column(name="material_id")
	private int materialId;

	@Column(name="material_sub_category_id")
	private int materialSubCategoryId;

	@Lob
	@Column(name="text_string")
	private String textString;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public Text() {
	}

	public int getTextId() {
		return this.textId;
	}

	public void setTextId(int textId) {
		this.textId = textId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getDalbumId() {
		return this.dalbumId;
	}

	public void setDalbumId(int dalbumId) {
		this.dalbumId = dalbumId;
	}

	public String getDextraLabelId() {
		return this.dextraLabelId;
	}

	public void setDextraLabelId(String dextraLabelId) {
		this.dextraLabelId = dextraLabelId;
	}

	public String getDextraTrackCategory() {
		return this.dextraTrackCategory;
	}

	public void setDextraTrackCategory(String dextraTrackCategory) {
		this.dextraTrackCategory = dextraTrackCategory;
	}

	public int getEmbeddedHiddenDimensionId() {
		return this.embeddedHiddenDimensionId;
	}

	public void setEmbeddedHiddenDimensionId(int embeddedHiddenDimensionId) {
		this.embeddedHiddenDimensionId = embeddedHiddenDimensionId;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getMaterialCategoryId() {
		return this.materialCategoryId;
	}

	public void setMaterialCategoryId(int materialCategoryId) {
		this.materialCategoryId = materialCategoryId;
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

	public String getTextString() {
		return this.textString;
	}

	public void setTextString(String textString) {
		this.textString = textString;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}