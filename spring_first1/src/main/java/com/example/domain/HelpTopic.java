package com.example.domain;

public class HelpTopic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.help_topic_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer helpTopicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.help_category_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Short helpCategoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.help_topic_id
     *
     * @return the value of help_topic.help_topic_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.help_topic_id
     *
     * @param helpTopicId the value for help_topic.help_topic_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.name
     *
     * @return the value of help_topic.name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.name
     *
     * @param name the value for help_topic.name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.help_category_id
     *
     * @return the value of help_topic.help_category_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.help_category_id
     *
     * @param helpCategoryId the value for help_topic.help_category_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }
}