package com.example.domain;

public class Hosts {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hosts.HOST
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hosts.CURRENT_CONNECTIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long currentConnections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hosts.TOTAL_CONNECTIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long totalConnections;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hosts.HOST
     *
     * @return the value of hosts.HOST
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hosts.HOST
     *
     * @param host the value for hosts.HOST
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hosts.CURRENT_CONNECTIONS
     *
     * @return the value of hosts.CURRENT_CONNECTIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getCurrentConnections() {
        return currentConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hosts.CURRENT_CONNECTIONS
     *
     * @param currentConnections the value for hosts.CURRENT_CONNECTIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hosts.TOTAL_CONNECTIONS
     *
     * @return the value of hosts.TOTAL_CONNECTIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getTotalConnections() {
        return totalConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hosts.TOTAL_CONNECTIONS
     *
     * @param totalConnections the value for hosts.TOTAL_CONNECTIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }
}