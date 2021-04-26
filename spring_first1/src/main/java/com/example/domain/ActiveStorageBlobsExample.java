package com.example.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActiveStorageBlobsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public ActiveStorageBlobsExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andKeyIsNull() {
			addCriterion("key is null");
			return (Criteria) this;
		}

		public Criteria andKeyIsNotNull() {
			addCriterion("key is not null");
			return (Criteria) this;
		}

		public Criteria andKeyEqualTo(String value) {
			addCriterion("key =", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotEqualTo(String value) {
			addCriterion("key <>", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyGreaterThan(String value) {
			addCriterion("key >", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyGreaterThanOrEqualTo(String value) {
			addCriterion("key >=", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyLessThan(String value) {
			addCriterion("key <", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyLessThanOrEqualTo(String value) {
			addCriterion("key <=", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyLike(String value) {
			addCriterion("key like", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotLike(String value) {
			addCriterion("key not like", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyIn(List<String> values) {
			addCriterion("key in", values, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotIn(List<String> values) {
			addCriterion("key not in", values, "key");
			return (Criteria) this;
		}

		public Criteria andKeyBetween(String value1, String value2) {
			addCriterion("key between", value1, value2, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotBetween(String value1, String value2) {
			addCriterion("key not between", value1, value2, "key");
			return (Criteria) this;
		}

		public Criteria andFilenameIsNull() {
			addCriterion("filename is null");
			return (Criteria) this;
		}

		public Criteria andFilenameIsNotNull() {
			addCriterion("filename is not null");
			return (Criteria) this;
		}

		public Criteria andFilenameEqualTo(String value) {
			addCriterion("filename =", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameNotEqualTo(String value) {
			addCriterion("filename <>", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameGreaterThan(String value) {
			addCriterion("filename >", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameGreaterThanOrEqualTo(String value) {
			addCriterion("filename >=", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameLessThan(String value) {
			addCriterion("filename <", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameLessThanOrEqualTo(String value) {
			addCriterion("filename <=", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameLike(String value) {
			addCriterion("filename like", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameNotLike(String value) {
			addCriterion("filename not like", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameIn(List<String> values) {
			addCriterion("filename in", values, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameNotIn(List<String> values) {
			addCriterion("filename not in", values, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameBetween(String value1, String value2) {
			addCriterion("filename between", value1, value2, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameNotBetween(String value1, String value2) {
			addCriterion("filename not between", value1, value2, "filename");
			return (Criteria) this;
		}

		public Criteria andContentTypeIsNull() {
			addCriterion("content_type is null");
			return (Criteria) this;
		}

		public Criteria andContentTypeIsNotNull() {
			addCriterion("content_type is not null");
			return (Criteria) this;
		}

		public Criteria andContentTypeEqualTo(String value) {
			addCriterion("content_type =", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotEqualTo(String value) {
			addCriterion("content_type <>", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeGreaterThan(String value) {
			addCriterion("content_type >", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
			addCriterion("content_type >=", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLessThan(String value) {
			addCriterion("content_type <", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLessThanOrEqualTo(String value) {
			addCriterion("content_type <=", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLike(String value) {
			addCriterion("content_type like", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotLike(String value) {
			addCriterion("content_type not like", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeIn(List<String> values) {
			addCriterion("content_type in", values, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotIn(List<String> values) {
			addCriterion("content_type not in", values, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeBetween(String value1, String value2) {
			addCriterion("content_type between", value1, value2, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotBetween(String value1, String value2) {
			addCriterion("content_type not between", value1, value2, "contentType");
			return (Criteria) this;
		}

		public Criteria andByteSizeIsNull() {
			addCriterion("byte_size is null");
			return (Criteria) this;
		}

		public Criteria andByteSizeIsNotNull() {
			addCriterion("byte_size is not null");
			return (Criteria) this;
		}

		public Criteria andByteSizeEqualTo(Long value) {
			addCriterion("byte_size =", value, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeNotEqualTo(Long value) {
			addCriterion("byte_size <>", value, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeGreaterThan(Long value) {
			addCriterion("byte_size >", value, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeGreaterThanOrEqualTo(Long value) {
			addCriterion("byte_size >=", value, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeLessThan(Long value) {
			addCriterion("byte_size <", value, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeLessThanOrEqualTo(Long value) {
			addCriterion("byte_size <=", value, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeIn(List<Long> values) {
			addCriterion("byte_size in", values, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeNotIn(List<Long> values) {
			addCriterion("byte_size not in", values, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeBetween(Long value1, Long value2) {
			addCriterion("byte_size between", value1, value2, "byteSize");
			return (Criteria) this;
		}

		public Criteria andByteSizeNotBetween(Long value1, Long value2) {
			addCriterion("byte_size not between", value1, value2, "byteSize");
			return (Criteria) this;
		}

		public Criteria andChecksumIsNull() {
			addCriterion("checksum is null");
			return (Criteria) this;
		}

		public Criteria andChecksumIsNotNull() {
			addCriterion("checksum is not null");
			return (Criteria) this;
		}

		public Criteria andChecksumEqualTo(String value) {
			addCriterion("checksum =", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumNotEqualTo(String value) {
			addCriterion("checksum <>", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumGreaterThan(String value) {
			addCriterion("checksum >", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumGreaterThanOrEqualTo(String value) {
			addCriterion("checksum >=", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumLessThan(String value) {
			addCriterion("checksum <", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumLessThanOrEqualTo(String value) {
			addCriterion("checksum <=", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumLike(String value) {
			addCriterion("checksum like", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumNotLike(String value) {
			addCriterion("checksum not like", value, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumIn(List<String> values) {
			addCriterion("checksum in", values, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumNotIn(List<String> values) {
			addCriterion("checksum not in", values, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumBetween(String value1, String value2) {
			addCriterion("checksum between", value1, value2, "checksum");
			return (Criteria) this;
		}

		public Criteria andChecksumNotBetween(String value1, String value2) {
			addCriterion("checksum not between", value1, value2, "checksum");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table active_storage_blobs
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table active_storage_blobs
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 26 16:23:14 JST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}