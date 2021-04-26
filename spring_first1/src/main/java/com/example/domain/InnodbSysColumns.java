package com.example.domain;

public class InnodbSysColumns {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_SYS_COLUMNS.TABLE_ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long tableId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_SYS_COLUMNS.NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_SYS_COLUMNS.POS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long pos;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_SYS_COLUMNS.MTYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer mtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_SYS_COLUMNS.PRTYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer prtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_SYS_COLUMNS.LEN
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer len;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_SYS_COLUMNS.TABLE_ID
     *
     * @return the value of INNODB_SYS_COLUMNS.TABLE_ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_SYS_COLUMNS.TABLE_ID
     *
     * @param tableId the value for INNODB_SYS_COLUMNS.TABLE_ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_SYS_COLUMNS.NAME
     *
     * @return the value of INNODB_SYS_COLUMNS.NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_SYS_COLUMNS.NAME
     *
     * @param name the value for INNODB_SYS_COLUMNS.NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_SYS_COLUMNS.POS
     *
     * @return the value of INNODB_SYS_COLUMNS.POS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getPos() {
        return pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_SYS_COLUMNS.POS
     *
     * @param pos the value for INNODB_SYS_COLUMNS.POS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setPos(Long pos) {
        this.pos = pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_SYS_COLUMNS.MTYPE
     *
     * @return the value of INNODB_SYS_COLUMNS.MTYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getMtype() {
        return mtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_SYS_COLUMNS.MTYPE
     *
     * @param mtype the value for INNODB_SYS_COLUMNS.MTYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_SYS_COLUMNS.PRTYPE
     *
     * @return the value of INNODB_SYS_COLUMNS.PRTYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getPrtype() {
        return prtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_SYS_COLUMNS.PRTYPE
     *
     * @param prtype the value for INNODB_SYS_COLUMNS.PRTYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setPrtype(Integer prtype) {
        this.prtype = prtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_SYS_COLUMNS.LEN
     *
     * @return the value of INNODB_SYS_COLUMNS.LEN
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getLen() {
        return len;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_SYS_COLUMNS.LEN
     *
     * @param len the value for INNODB_SYS_COLUMNS.LEN
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setLen(Integer len) {
        this.len = len;
    }
}