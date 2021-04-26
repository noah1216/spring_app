package com.example.domain;

import java.util.Date;

public class ActiveStorageBlobs {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.key
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private String key;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.filename
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private String filename;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.content_type
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private String contentType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.byte_size
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Long byteSize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.checksum
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private String checksum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column active_storage_blobs.metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private String metadata;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.id
	 * @return  the value of active_storage_blobs.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.id
	 * @param id  the value for active_storage_blobs.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.key
	 * @return  the value of active_storage_blobs.key
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getKey() {
		return key;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.key
	 * @param key  the value for active_storage_blobs.key
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setKey(String key) {
		this.key = key == null ? null : key.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.filename
	 * @return  the value of active_storage_blobs.filename
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.filename
	 * @param filename  the value for active_storage_blobs.filename
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setFilename(String filename) {
		this.filename = filename == null ? null : filename.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.content_type
	 * @return  the value of active_storage_blobs.content_type
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.content_type
	 * @param contentType  the value for active_storage_blobs.content_type
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType == null ? null : contentType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.byte_size
	 * @return  the value of active_storage_blobs.byte_size
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Long getByteSize() {
		return byteSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.byte_size
	 * @param byteSize  the value for active_storage_blobs.byte_size
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setByteSize(Long byteSize) {
		this.byteSize = byteSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.checksum
	 * @return  the value of active_storage_blobs.checksum
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getChecksum() {
		return checksum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.checksum
	 * @param checksum  the value for active_storage_blobs.checksum
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setChecksum(String checksum) {
		this.checksum = checksum == null ? null : checksum.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.created_at
	 * @return  the value of active_storage_blobs.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.created_at
	 * @param createdAt  the value for active_storage_blobs.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column active_storage_blobs.metadata
	 * @return  the value of active_storage_blobs.metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getMetadata() {
		return metadata;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column active_storage_blobs.metadata
	 * @param metadata  the value for active_storage_blobs.metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setMetadata(String metadata) {
		this.metadata = metadata == null ? null : metadata.trim();
	}
}