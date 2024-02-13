package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the video database table.
 * 
 */
@Entity
@Table(name="video")
@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
public class Video implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="video_id")
	private int videoId;

	@Column(name="at_position")
	private int atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	@Column(name="dextra_label_id")
	private String dextraLabelId;

	@Column(name="embedded_hidden_dimension_id")
	private int embeddedHiddenDimensionId;

	private String extension;

	private String filename;

	@Column(name="is_active")
	private int isActive;

	private int length;

	@Lob
	private String link;

	@Column(name="material_category_id")
	private int materialCategoryId;

	@Column(name="material_id")
	private int materialId;

	@Column(name="material_sub_category_id")
	private int materialSubCategoryId;

	private String name;

	private String path;

	private String size;

	@Column(name="track_dextra_category")
	private int trackDextraCategory;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public Video() {
	}

	public int getVideoId() {
		return this.videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
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

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

	public int getTrackDextraCategory() {
		return this.trackDextraCategory;
	}

	public void setTrackDextraCategory(int trackDextraCategory) {
		this.trackDextraCategory = trackDextraCategory;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}