package com.example.domain;

public class SlaveMasterInfoKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_master_info.Host
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_master_info.Port
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer port;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_master_info.Host
     *
     * @return the value of slave_master_info.Host
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_master_info.Host
     *
     * @param host the value for slave_master_info.Host
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_master_info.Port
     *
     * @return the value of slave_master_info.Port
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_master_info.Port
     *
     * @param port the value for slave_master_info.Port
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setPort(Integer port) {
        this.port = port;
    }
}