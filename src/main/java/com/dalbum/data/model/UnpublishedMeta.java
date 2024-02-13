package com.dalbum.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the unpublished_meta database table.
 * 
 */
@Entity
@Table(name="unpublished_meta")
@NamedQuery(name="UnpublishedMeta.findAll", query="SELECT u FROM UnpublishedMeta u")
public class UnpublishedMeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="unpublished_meta_id")
	private int unpublishedMetaId;

	@Lob
	@Column(name="artwork_question")
	private String artworkQuestion;

	@Column(name="at_step")
	private int atStep;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="dalbum_id")
	private int dalbumId;

	@Column(name="percent_complete")
	private float percentComplete;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	public UnpublishedMeta() {
	}

	public int getUnpublishedMetaId() {
		return this.unpublishedMetaId;
	}

	public void setUnpublishedMetaId(int unpublishedMetaId) {
		this.unpublishedMetaId = unpublishedMetaId;
	}

	public String getArtworkQuestion() {
		return this.artworkQuestion;
	}

	public void setArtworkQuestion(String artworkQuestion) {
		this.artworkQuestion = artworkQuestion;
	}

	public int getAtStep() {
		return this.atStep;
	}

	public void setAtStep(int atStep) {
		this.atStep = atStep;
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

	public float getPercentComplete() {
		return this.percentComplete;
	}

	public void setPercentComplete(float percentComplete) {
		this.percentComplete = percentComplete;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}