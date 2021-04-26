package com.example.domain;

public class ColumnPrivileges {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.GRANTEE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String grantee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.TABLE_CATALOG
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String tableCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.TABLE_SCHEMA
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.TABLE_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.COLUMN_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.PRIVILEGE_TYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String privilegeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_PRIVILEGES.IS_GRANTABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String isGrantable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.GRANTEE
     *
     * @return the value of COLUMN_PRIVILEGES.GRANTEE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getGrantee() {
        return grantee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.GRANTEE
     *
     * @param grantee the value for COLUMN_PRIVILEGES.GRANTEE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setGrantee(String grantee) {
        this.grantee = grantee == null ? null : grantee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.TABLE_CATALOG
     *
     * @return the value of COLUMN_PRIVILEGES.TABLE_CATALOG
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.TABLE_CATALOG
     *
     * @param tableCatalog the value for COLUMN_PRIVILEGES.TABLE_CATALOG
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog == null ? null : tableCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.TABLE_SCHEMA
     *
     * @return the value of COLUMN_PRIVILEGES.TABLE_SCHEMA
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.TABLE_SCHEMA
     *
     * @param tableSchema the value for COLUMN_PRIVILEGES.TABLE_SCHEMA
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.TABLE_NAME
     *
     * @return the value of COLUMN_PRIVILEGES.TABLE_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.TABLE_NAME
     *
     * @param tableName the value for COLUMN_PRIVILEGES.TABLE_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.COLUMN_NAME
     *
     * @return the value of COLUMN_PRIVILEGES.COLUMN_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.COLUMN_NAME
     *
     * @param columnName the value for COLUMN_PRIVILEGES.COLUMN_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.PRIVILEGE_TYPE
     *
     * @return the value of COLUMN_PRIVILEGES.PRIVILEGE_TYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getPrivilegeType() {
        return privilegeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.PRIVILEGE_TYPE
     *
     * @param privilegeType the value for COLUMN_PRIVILEGES.PRIVILEGE_TYPE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType == null ? null : privilegeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_PRIVILEGES.IS_GRANTABLE
     *
     * @return the value of COLUMN_PRIVILEGES.IS_GRANTABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getIsGrantable() {
        return isGrantable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_PRIVILEGES.IS_GRANTABLE
     *
     * @param isGrantable the value for COLUMN_PRIVILEGES.IS_GRANTABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable == null ? null : isGrantable.trim();
    }
}