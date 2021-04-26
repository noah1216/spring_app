package com.example.mybatis.mapper;

import com.example.domain.SetupInstruments;
import com.example.domain.SetupInstrumentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupInstrumentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(SetupInstruments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(SetupInstruments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<SetupInstruments> selectByExample(SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_instruments
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);
}