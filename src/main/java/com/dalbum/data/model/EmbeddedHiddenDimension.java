package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the embedded_hidden_dimension database table.
 * 
 */
@Entity
@Table(name="embedded_hidden_dimension")
@NamedQuery(name="EmbeddedHiddenDimension.findAll", query="SELECT e FROM EmbeddedHiddenDimension e")
public class EmbeddedHiddenDimension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="embedded_hidden_dimension_id")
	private int embeddedHiddenDimensionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String height;

	@Column(name="is_active")
	private int isActive;

	private String left;

	@Column(name="material_sub_category_id")
	private int materialSubCategoryId;

	private String top;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	private String width;

	//bi-directional many-to-one association to ArtworkImage
	@ManyToOne
	@JoinColumn(name="artwork_image_id")
	private ArtworkImage artworkImage;

	//bi-directional many-to-one association to Dalbum
	@ManyToOne
	@JoinColumn(name="dalbum_id")
	private Dalbum dalbum;

	//bi-directional many-to-one association to OtherTrack
	@OneToMany(mappedBy="embeddedHiddenDimension")
	private List<OtherTrack> otherTracks;

	public EmbeddedHiddenDimension() {
	}

	public int getEmbeddedHiddenDimensionId() {
		return this.embeddedHiddenDimensionId;
	}

	public void setEmbeddedHiddenDimensionId(int embeddedHiddenDimensionId) {
		this.embeddedHiddenDimensionId = embeddedHiddenDimensionId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getLeft() {
		return this.left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public int getMaterialSubCategoryId() {
		return this.materialSubCategoryId;
	}

	public void setMaterialSubCategoryId(int materialSubCategoryId) {
		this.materialSubCategoryId = materialSubCategoryId;
	}

	public String getTop() {
		return this.top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public ArtworkImage getArtworkImage() {
		return this.artworkImage;
	}

	public void setArtworkImage(ArtworkImage artworkImage) {
		this.artworkImage = artworkImage;
	}

	public Dalbum getDalbum() {
		return this.dalbum;
	}

	public void setDalbum(Dalbum dalbum) {
		this.dalbum = dalbum;
	}

	public List<OtherTrack> getOtherTracks() {
		return this.otherTracks;
	}

	public void setOtherTracks(List<OtherTrack> otherTracks) {
		this.otherTracks = otherTracks;
	}

	public OtherTrack addOtherTrack(OtherTrack otherTrack) {
		getOtherTracks().add(otherTrack);
		otherTrack.setEmbeddedHiddenDimension(this);

		return otherTrack;
	}

	public OtherTrack removeOtherTrack(OtherTrack otherTrack) {
		getOtherTracks().remove(otherTrack);
		otherTrack.setEmbeddedHiddenDimension(null);

		return otherTrack;
	}

}