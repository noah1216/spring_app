package com.example.domain;

public class InnodbLockWaits {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_LOCK_WAITS.requesting_trx_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String requestingTrxId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_LOCK_WAITS.requested_lock_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String requestedLockId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_LOCK_WAITS.blocking_trx_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String blockingTrxId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_LOCK_WAITS.blocking_lock_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String blockingLockId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_LOCK_WAITS.requesting_trx_id
     *
     * @return the value of INNODB_LOCK_WAITS.requesting_trx_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getRequestingTrxId() {
        return requestingTrxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_LOCK_WAITS.requesting_trx_id
     *
     * @param requestingTrxId the value for INNODB_LOCK_WAITS.requesting_trx_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setRequestingTrxId(String requestingTrxId) {
        this.requestingTrxId = requestingTrxId == null ? null : requestingTrxId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_LOCK_WAITS.requested_lock_id
     *
     * @return the value of INNODB_LOCK_WAITS.requested_lock_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getRequestedLockId() {
        return requestedLockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_LOCK_WAITS.requested_lock_id
     *
     * @param requestedLockId the value for INNODB_LOCK_WAITS.requested_lock_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setRequestedLockId(String requestedLockId) {
        this.requestedLockId = requestedLockId == null ? null : requestedLockId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_LOCK_WAITS.blocking_trx_id
     *
     * @return the value of INNODB_LOCK_WAITS.blocking_trx_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_LOCK_WAITS.blocking_trx_id
     *
     * @param blockingTrxId the value for INNODB_LOCK_WAITS.blocking_trx_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId == null ? null : blockingTrxId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_LOCK_WAITS.blocking_lock_id
     *
     * @return the value of INNODB_LOCK_WAITS.blocking_lock_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getBlockingLockId() {
        return blockingLockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_LOCK_WAITS.blocking_lock_id
     *
     * @param blockingLockId the value for INNODB_LOCK_WAITS.blocking_lock_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId == null ? null : blockingLockId.trim();
    }
}