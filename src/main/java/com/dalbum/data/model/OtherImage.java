package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the other_image database table.
 * 
 */
@Entity
@Table(name="other_image")
@NamedQuery(name="OtherImage.findAll", query="SELECT o FROM OtherImage o")
public class OtherImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="other_image_id")
	private Integer otherImageId;

	@Column(name="at_position")
	private Integer atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private Integer dalbumId;

	@Column(name="dextra_label_id")
	private String dextraLabelId;

	@Column(name="embedded_hidden_dimension_id")
	private Integer embeddedHiddenDimensionId;

	private String extension;

	private String filename;

	@Column(name="grouping_key")
	private Integer groupingKey;

	@Column(name="is_active")
	private Integer isActive;

	@Column(name="material_category_id")
	private Integer materialCategoryId;

	@Column(name="material_id")
	private Integer materialId;

	@Column(name="material_sub_category_id")
	private Integer materialSubCategoryId;

	private String name;

	private String path;

	private String size;

	@Column(name="track_dextra_category_id")
	private Integer trackDextraCategoryId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public OtherImage() {
	}

	public int getOtherImageId() {
		return this.otherImageId;
	}

	public void setOtherImageId(int otherImageId) {
		this.otherImageId = otherImageId;
	}

	public int getAtPosition() {
		return this.atPosition;
	}

	public void setAtPosition(int atPosition) {
		this.atPosition = atPosition;
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

	public int getEmbeddedHiddenDimensionId() {
		return this.embeddedHiddenDimensionId;
	}

	public void setEmbeddedHiddenDimensionId(int embeddedHiddenDimensionId) {
		this.embeddedHiddenDimensionId = embeddedHiddenDimensionId;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getGroupingKey() {
		return this.groupingKey;
	}

	public void setGroupingKey(int groupingKey) {
		this.groupingKey = groupingKey;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getTrackDextraCategoryId() {
		return this.trackDextraCategoryId;
	}

	public void setTrackDextraCategoryId(int trackDextraCategoryId) {
		this.trackDextraCategoryId = trackDextraCategoryId;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}