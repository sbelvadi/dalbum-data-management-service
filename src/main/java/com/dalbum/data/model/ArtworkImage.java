package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the artwork_image database table.
 * 
 */
@Entity
@Table(name="artwork_image")
@NamedQuery(name="ArtworkImage.findAll", query="SELECT a FROM ArtworkImage a")
public class ArtworkImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="artwork_image_id")
	private int artworkImageId;

	@Column(name="artwork_type")
	private String artworkType;

	@Column(name="at_position")
	private int atPosition;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	private String extension;

	@Column(name="image_type")
	private String imageType;

	@Column(name="is_active")
	private int isActive;

	private String name;

	private String path;

	private String size;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	//bi-directional many-to-one association to EmbeddedHiddenDimension
	@OneToMany(mappedBy="artworkImage")
	private List<EmbeddedHiddenDimension> embeddedHiddenDimensions;

	public ArtworkImage() {
	}

	public int getArtworkImageId() {
		return this.artworkImageId;
	}

	public void setArtworkImageId(int artworkImageId) {
		this.artworkImageId = artworkImageId;
	}

	public String getArtworkType() {
		return this.artworkType;
	}

	public void setArtworkType(String artworkType) {
		this.artworkType = artworkType;
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

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
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

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<EmbeddedHiddenDimension> getEmbeddedHiddenDimensions() {
		return this.embeddedHiddenDimensions;
	}

	public void setEmbeddedHiddenDimensions(List<EmbeddedHiddenDimension> embeddedHiddenDimensions) {
		this.embeddedHiddenDimensions = embeddedHiddenDimensions;
	}

	public EmbeddedHiddenDimension addEmbeddedHiddenDimension(EmbeddedHiddenDimension embeddedHiddenDimension) {
		getEmbeddedHiddenDimensions().add(embeddedHiddenDimension);
		embeddedHiddenDimension.setArtworkImage(this);

		return embeddedHiddenDimension;
	}

	public EmbeddedHiddenDimension removeEmbeddedHiddenDimension(EmbeddedHiddenDimension embeddedHiddenDimension) {
		getEmbeddedHiddenDimensions().remove(embeddedHiddenDimension);
		embeddedHiddenDimension.setArtworkImage(null);

		return embeddedHiddenDimension;
	}

}