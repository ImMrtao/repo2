package com.crm.entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.r_id
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    private Integer rId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.r_name
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    private String rName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.r_desc
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    private String rDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.r_id
     *
     * @return the value of role.r_id
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.r_id
     *
     * @param rId the value for role.r_id
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.r_name
     *
     * @return the value of role.r_name
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    public String getrName() {
        return rName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.r_name
     *
     * @param rName the value for role.r_name
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    public void setrName(String rName) {
        this.rName = rName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.r_desc
     *
     * @return the value of role.r_desc
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    public String getrDesc() {
        return rDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.r_desc
     *
     * @param rDesc the value for role.r_desc
     *
     * @mbg.generated Mon May 25 10:36:15 CST 2020
     */
    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }
}