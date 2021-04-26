package com.example.domain;

public class Processlist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.USER
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.HOST
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.DB
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.COMMAND
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String command;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.TIME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.STATE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROCESSLIST.INFO
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String info;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.ID
     *
     * @return the value of PROCESSLIST.ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.ID
     *
     * @param id the value for PROCESSLIST.ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.USER
     *
     * @return the value of PROCESSLIST.USER
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.USER
     *
     * @param user the value for PROCESSLIST.USER
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.HOST
     *
     * @return the value of PROCESSLIST.HOST
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.HOST
     *
     * @param host the value for PROCESSLIST.HOST
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.DB
     *
     * @return the value of PROCESSLIST.DB
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.DB
     *
     * @param db the value for PROCESSLIST.DB
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.COMMAND
     *
     * @return the value of PROCESSLIST.COMMAND
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getCommand() {
        return command;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.COMMAND
     *
     * @param command the value for PROCESSLIST.COMMAND
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.TIME
     *
     * @return the value of PROCESSLIST.TIME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.TIME
     *
     * @param time the value for PROCESSLIST.TIME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.STATE
     *
     * @return the value of PROCESSLIST.STATE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.STATE
     *
     * @param state the value for PROCESSLIST.STATE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROCESSLIST.INFO
     *
     * @return the value of PROCESSLIST.INFO
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROCESSLIST.INFO
     *
     * @param info the value for PROCESSLIST.INFO
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}