package com.example.domain;

public class HelpTopicWithBLOBs extends HelpTopic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.description
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.example
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String example;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.url
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.description
     *
     * @return the value of help_topic.description
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.description
     *
     * @param description the value for help_topic.description
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.example
     *
     * @return the value of help_topic.example
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getExample() {
        return example;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.example
     *
     * @param example the value for help_topic.example
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setExample(String example) {
        this.example = example == null ? null : example.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.url
     *
     * @return the value of help_topic.url
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.url
     *
     * @param url the value for help_topic.url
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}