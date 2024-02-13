package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the other_track database table.
 * 
 */
@Entity
@Table(name="other_track")
@NamedQuery(name="OtherTrack.findAll", query="SELECT o FROM OtherTrack o")
public class OtherTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="other_track_id")
	private Integer otherTrackId;

	@Column(name="at_position")
	private Integer atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dextra_label_id")
	private String dextraLabelId;

	private String extension;

	private String filename;

	@Column(name="is_active")
	private Integer isActive;

	@Column(name="is_compressed")
	private Integer isCompressed;

	@Column(name="isrc_number")
	private String isrcNumber;

	private Integer length;

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

	//bi-directional many-to-one association to Dalbum
	@ManyToOne
	@JoinColumn(name="dalbum_id")
	private Dalbum dalbum;

	//bi-directional many-to-one association to EmbeddedHiddenDimension
	@ManyToOne
	@JoinColumn(name="embedded_hidden_dimension_id")
	private EmbeddedHiddenDimension embeddedHiddenDimension;

	public OtherTrack() {
	}

	public int getOtherTrackId() {
		return this.otherTrackId;
	}

	public void setOtherTrackId(int otherTrackId) {
		this.otherTrackId = otherTrackId;
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

	public String getDextraLabelId() {
		return this.dextraLabelId;
	}

	public void setDextraLabelId(String dextraLabelId) {
		this.dextraLabelId = dextraLabelId;
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

	public int getIsCompressed() {
		return this.isCompressed;
	}

	public void setIsCompressed(int isCompressed) {
		this.isCompressed = isCompressed;
	}

	public String getIsrcNumber() {
		return this.isrcNumber;
	}

	public void setIsrcNumber(String isrcNumber) {
		this.isrcNumber = isrcNumber;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
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

	public Dalbum getDalbum() {
		return this.dalbum;
	}

	public void setDalbum(Dalbum dalbum) {
		this.dalbum = dalbum;
	}

	public EmbeddedHiddenDimension getEmbeddedHiddenDimension() {
		return this.embeddedHiddenDimension;
	}

	public void setEmbeddedHiddenDimension(EmbeddedHiddenDimension embeddedHiddenDimension) {
		this.embeddedHiddenDimension = embeddedHiddenDimension;
	}

}