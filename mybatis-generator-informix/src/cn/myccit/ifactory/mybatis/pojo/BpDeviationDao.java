package cn.myccit.ifactory.mybatis.pojo;

import cn.myccit.ifactory.mybatis.pojo.BpDeviation;
import cn.myccit.ifactory.mybatis.pojo.BpDeviationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BpDeviationDao {
    @SelectProvider(type=BpDeviationSqlProvider.class, method="countByExample")
    long countByExample(BpDeviationExample example);

    @DeleteProvider(type=BpDeviationSqlProvider.class, method="deleteByExample")
    int deleteByExample(BpDeviationExample example);

    @Delete({
        "delete from bp_deviation",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pid);

    @Insert({
        "insert into bp_deviation (no, gname, ",
        "span, bno, batch, ",
        "operation, position, ",
        "reporter, deviation_handle_time, ",
        "deviation_type, deviation_content, ",
        "deviation_reason, deviation_handle, ",
        "deviation_sign, qa_handle, ",
        "qa_sign, qa_handle_time, ",
        "quality_master_handle, quality_master_sign, ",
        "quality_master_handle_time, current_flow)",
        "values (#{no,jdbcType=VARCHAR}, #{gname,jdbcType=VARCHAR}, ",
        "#{span,jdbcType=VARCHAR}, #{bno,jdbcType=VARCHAR}, #{batch,jdbcType=VARCHAR}, ",
        "#{operation,jdbcType=VARCHAR}, #{position,jdbcType=VARCHAR}, ",
        "#{reporter,jdbcType=VARCHAR}, #{deviationHandleTime,jdbcType=TIMESTAMP}, ",
        "#{deviationType,jdbcType=VARCHAR}, #{deviationContent,jdbcType=VARCHAR}, ",
        "#{deviationReason,jdbcType=VARCHAR}, #{deviationHandle,jdbcType=VARCHAR}, ",
        "#{deviationSign,jdbcType=VARCHAR}, #{qaHandle,jdbcType=VARCHAR}, ",
        "#{qaSign,jdbcType=VARCHAR}, #{qaHandleTime,jdbcType=TIMESTAMP}, ",
        "#{qualityMasterHandle,jdbcType=VARCHAR}, #{qualityMasterSign,jdbcType=VARCHAR}, ",
        "#{qualityMasterHandleTime,jdbcType=TIMESTAMP}, #{currentFlow,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="select dbinfo('sqlca.sqlerrd1') from systables where tabid=1", keyProperty="pid", before=false, resultType=Integer.class)
    int insert(BpDeviation record);

    @InsertProvider(type=BpDeviationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select dbinfo('sqlca.sqlerrd1') from systables where tabid=1", keyProperty="pid", before=false, resultType=Integer.class)
    int insertSelective(BpDeviation record);

    @SelectProvider(type=BpDeviationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="gname", property="gname", jdbcType=JdbcType.VARCHAR),
        @Result(column="span", property="span", jdbcType=JdbcType.VARCHAR),
        @Result(column="bno", property="bno", jdbcType=JdbcType.VARCHAR),
        @Result(column="batch", property="batch", jdbcType=JdbcType.VARCHAR),
        @Result(column="operation", property="operation", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="reporter", property="reporter", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_handle_time", property="deviationHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deviation_type", property="deviationType", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_content", property="deviationContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_reason", property="deviationReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_handle", property="deviationHandle", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_sign", property="deviationSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="qa_handle", property="qaHandle", jdbcType=JdbcType.VARCHAR),
        @Result(column="qa_sign", property="qaSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="qa_handle_time", property="qaHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="quality_master_handle", property="qualityMasterHandle", jdbcType=JdbcType.VARCHAR),
        @Result(column="quality_master_sign", property="qualityMasterSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="quality_master_handle_time", property="qualityMasterHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="current_flow", property="currentFlow", jdbcType=JdbcType.VARCHAR)
    })
    List<BpDeviation> selectByExample(BpDeviationExample example);

    @Select({
        "select",
        "pid, no, gname, span, bno, batch, operation, position, reporter, deviation_handle_time, ",
        "deviation_type, deviation_content, deviation_reason, deviation_handle, deviation_sign, ",
        "qa_handle, qa_sign, qa_handle_time, quality_master_handle, quality_master_sign, ",
        "quality_master_handle_time, current_flow",
        "from bp_deviation",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="gname", property="gname", jdbcType=JdbcType.VARCHAR),
        @Result(column="span", property="span", jdbcType=JdbcType.VARCHAR),
        @Result(column="bno", property="bno", jdbcType=JdbcType.VARCHAR),
        @Result(column="batch", property="batch", jdbcType=JdbcType.VARCHAR),
        @Result(column="operation", property="operation", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="reporter", property="reporter", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_handle_time", property="deviationHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deviation_type", property="deviationType", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_content", property="deviationContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_reason", property="deviationReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_handle", property="deviationHandle", jdbcType=JdbcType.VARCHAR),
        @Result(column="deviation_sign", property="deviationSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="qa_handle", property="qaHandle", jdbcType=JdbcType.VARCHAR),
        @Result(column="qa_sign", property="qaSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="qa_handle_time", property="qaHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="quality_master_handle", property="qualityMasterHandle", jdbcType=JdbcType.VARCHAR),
        @Result(column="quality_master_sign", property="qualityMasterSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="quality_master_handle_time", property="qualityMasterHandleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="current_flow", property="currentFlow", jdbcType=JdbcType.VARCHAR)
    })
    BpDeviation selectByPrimaryKey(Integer pid);

    @UpdateProvider(type=BpDeviationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BpDeviation record, @Param("example") BpDeviationExample example);

    @UpdateProvider(type=BpDeviationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BpDeviation record, @Param("example") BpDeviationExample example);

    @UpdateProvider(type=BpDeviationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BpDeviation record);

    @Update({
        "update bp_deviation",
        "set no = #{no,jdbcType=VARCHAR},",
          "gname = #{gname,jdbcType=VARCHAR},",
          "span = #{span,jdbcType=VARCHAR},",
          "bno = #{bno,jdbcType=VARCHAR},",
          "batch = #{batch,jdbcType=VARCHAR},",
          "operation = #{operation,jdbcType=VARCHAR},",
          "position = #{position,jdbcType=VARCHAR},",
          "reporter = #{reporter,jdbcType=VARCHAR},",
          "deviation_handle_time = #{deviationHandleTime,jdbcType=TIMESTAMP},",
          "deviation_type = #{deviationType,jdbcType=VARCHAR},",
          "deviation_content = #{deviationContent,jdbcType=VARCHAR},",
          "deviation_reason = #{deviationReason,jdbcType=VARCHAR},",
          "deviation_handle = #{deviationHandle,jdbcType=VARCHAR},",
          "deviation_sign = #{deviationSign,jdbcType=VARCHAR},",
          "qa_handle = #{qaHandle,jdbcType=VARCHAR},",
          "qa_sign = #{qaSign,jdbcType=VARCHAR},",
          "qa_handle_time = #{qaHandleTime,jdbcType=TIMESTAMP},",
          "quality_master_handle = #{qualityMasterHandle,jdbcType=VARCHAR},",
          "quality_master_sign = #{qualityMasterSign,jdbcType=VARCHAR},",
          "quality_master_handle_time = #{qualityMasterHandleTime,jdbcType=TIMESTAMP},",
          "current_flow = #{currentFlow,jdbcType=VARCHAR}",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BpDeviation record);
}