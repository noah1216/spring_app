package com.example.domain;

public class SlaveRelayLogInfoWithBLOBs extends SlaveRelayLogInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Relay_log_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String relayLogName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Master_log_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String masterLogName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Relay_log_name
     *
     * @return the value of slave_relay_log_info.Relay_log_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getRelayLogName() {
        return relayLogName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Relay_log_name
     *
     * @param relayLogName the value for slave_relay_log_info.Relay_log_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName == null ? null : relayLogName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Master_log_name
     *
     * @return the value of slave_relay_log_info.Master_log_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getMasterLogName() {
        return masterLogName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Master_log_name
     *
     * @param masterLogName the value for slave_relay_log_info.Master_log_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName == null ? null : masterLogName.trim();
    }
}