package cn.myccit.ifactory.mybatis.pojo;

import cn.myccit.ifactory.mybatis.pojo.BpDeviation;
import cn.myccit.ifactory.mybatis.pojo.BpDeviationExample.Criteria;
import cn.myccit.ifactory.mybatis.pojo.BpDeviationExample.Criterion;
import cn.myccit.ifactory.mybatis.pojo.BpDeviationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BpDeviationSqlProvider {

    public String countByExample(BpDeviationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("bp_deviation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(BpDeviationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("bp_deviation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(BpDeviation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bp_deviation");
        
        if (record.getNo() != null) {
            sql.VALUES("no", "#{no,jdbcType=VARCHAR}");
        }
        
        if (record.getGname() != null) {
            sql.VALUES("gname", "#{gname,jdbcType=VARCHAR}");
        }
        
        if (record.getSpan() != null) {
            sql.VALUES("span", "#{span,jdbcType=VARCHAR}");
        }
        
        if (record.getBno() != null) {
            sql.VALUES("bno", "#{bno,jdbcType=VARCHAR}");
        }
        
        if (record.getBatch() != null) {
            sql.VALUES("batch", "#{batch,jdbcType=VARCHAR}");
        }
        
        if (record.getOperation() != null) {
            sql.VALUES("operation", "#{operation,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            sql.VALUES("position", "#{position,jdbcType=VARCHAR}");
        }
        
        if (record.getReporter() != null) {
            sql.VALUES("reporter", "#{reporter,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationHandleTime() != null) {
            sql.VALUES("deviation_handle_time", "#{deviationHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviationType() != null) {
            sql.VALUES("deviation_type", "#{deviationType,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationContent() != null) {
            sql.VALUES("deviation_content", "#{deviationContent,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationReason() != null) {
            sql.VALUES("deviation_reason", "#{deviationReason,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationHandle() != null) {
            sql.VALUES("deviation_handle", "#{deviationHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationSign() != null) {
            sql.VALUES("deviation_sign", "#{deviationSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQaHandle() != null) {
            sql.VALUES("qa_handle", "#{qaHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getQaSign() != null) {
            sql.VALUES("qa_sign", "#{qaSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQaHandleTime() != null) {
            sql.VALUES("qa_handle_time", "#{qaHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getQualityMasterHandle() != null) {
            sql.VALUES("quality_master_handle", "#{qualityMasterHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getQualityMasterSign() != null) {
            sql.VALUES("quality_master_sign", "#{qualityMasterSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQualityMasterHandleTime() != null) {
            sql.VALUES("quality_master_handle_time", "#{qualityMasterHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentFlow() != null) {
            sql.VALUES("current_flow", "#{currentFlow,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(BpDeviationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("pid");
        } else {
            sql.SELECT("pid");
        }
        sql.SELECT("no");
        sql.SELECT("gname");
        sql.SELECT("span");
        sql.SELECT("bno");
        sql.SELECT("batch");
        sql.SELECT("operation");
        sql.SELECT("position");
        sql.SELECT("reporter");
        sql.SELECT("deviation_handle_time");
        sql.SELECT("deviation_type");
        sql.SELECT("deviation_content");
        sql.SELECT("deviation_reason");
        sql.SELECT("deviation_handle");
        sql.SELECT("deviation_sign");
        sql.SELECT("qa_handle");
        sql.SELECT("qa_sign");
        sql.SELECT("qa_handle_time");
        sql.SELECT("quality_master_handle");
        sql.SELECT("quality_master_sign");
        sql.SELECT("quality_master_handle_time");
        sql.SELECT("current_flow");
        sql.FROM("bp_deviation");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        BpDeviation record = (BpDeviation) parameter.get("record");
        BpDeviationExample example = (BpDeviationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("bp_deviation");
        
        if (record.getPid() != null) {
            sql.SET("pid = #{record.pid,jdbcType=INTEGER}");
        }
        
        if (record.getNo() != null) {
            sql.SET("no = #{record.no,jdbcType=VARCHAR}");
        }
        
        if (record.getGname() != null) {
            sql.SET("gname = #{record.gname,jdbcType=VARCHAR}");
        }
        
        if (record.getSpan() != null) {
            sql.SET("span = #{record.span,jdbcType=VARCHAR}");
        }
        
        if (record.getBno() != null) {
            sql.SET("bno = #{record.bno,jdbcType=VARCHAR}");
        }
        
        if (record.getBatch() != null) {
            sql.SET("batch = #{record.batch,jdbcType=VARCHAR}");
        }
        
        if (record.getOperation() != null) {
            sql.SET("operation = #{record.operation,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            sql.SET("position = #{record.position,jdbcType=VARCHAR}");
        }
        
        if (record.getReporter() != null) {
            sql.SET("reporter = #{record.reporter,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationHandleTime() != null) {
            sql.SET("deviation_handle_time = #{record.deviationHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviationType() != null) {
            sql.SET("deviation_type = #{record.deviationType,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationContent() != null) {
            sql.SET("deviation_content = #{record.deviationContent,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationReason() != null) {
            sql.SET("deviation_reason = #{record.deviationReason,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationHandle() != null) {
            sql.SET("deviation_handle = #{record.deviationHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationSign() != null) {
            sql.SET("deviation_sign = #{record.deviationSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQaHandle() != null) {
            sql.SET("qa_handle = #{record.qaHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getQaSign() != null) {
            sql.SET("qa_sign = #{record.qaSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQaHandleTime() != null) {
            sql.SET("qa_handle_time = #{record.qaHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getQualityMasterHandle() != null) {
            sql.SET("quality_master_handle = #{record.qualityMasterHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getQualityMasterSign() != null) {
            sql.SET("quality_master_sign = #{record.qualityMasterSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQualityMasterHandleTime() != null) {
            sql.SET("quality_master_handle_time = #{record.qualityMasterHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentFlow() != null) {
            sql.SET("current_flow = #{record.currentFlow,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("bp_deviation");
        
        sql.SET("pid = #{record.pid,jdbcType=INTEGER}");
        sql.SET("no = #{record.no,jdbcType=VARCHAR}");
        sql.SET("gname = #{record.gname,jdbcType=VARCHAR}");
        sql.SET("span = #{record.span,jdbcType=VARCHAR}");
        sql.SET("bno = #{record.bno,jdbcType=VARCHAR}");
        sql.SET("batch = #{record.batch,jdbcType=VARCHAR}");
        sql.SET("operation = #{record.operation,jdbcType=VARCHAR}");
        sql.SET("position = #{record.position,jdbcType=VARCHAR}");
        sql.SET("reporter = #{record.reporter,jdbcType=VARCHAR}");
        sql.SET("deviation_handle_time = #{record.deviationHandleTime,jdbcType=TIMESTAMP}");
        sql.SET("deviation_type = #{record.deviationType,jdbcType=VARCHAR}");
        sql.SET("deviation_content = #{record.deviationContent,jdbcType=VARCHAR}");
        sql.SET("deviation_reason = #{record.deviationReason,jdbcType=VARCHAR}");
        sql.SET("deviation_handle = #{record.deviationHandle,jdbcType=VARCHAR}");
        sql.SET("deviation_sign = #{record.deviationSign,jdbcType=VARCHAR}");
        sql.SET("qa_handle = #{record.qaHandle,jdbcType=VARCHAR}");
        sql.SET("qa_sign = #{record.qaSign,jdbcType=VARCHAR}");
        sql.SET("qa_handle_time = #{record.qaHandleTime,jdbcType=TIMESTAMP}");
        sql.SET("quality_master_handle = #{record.qualityMasterHandle,jdbcType=VARCHAR}");
        sql.SET("quality_master_sign = #{record.qualityMasterSign,jdbcType=VARCHAR}");
        sql.SET("quality_master_handle_time = #{record.qualityMasterHandleTime,jdbcType=TIMESTAMP}");
        sql.SET("current_flow = #{record.currentFlow,jdbcType=VARCHAR}");
        
        BpDeviationExample example = (BpDeviationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(BpDeviation record) {
        SQL sql = new SQL();
        sql.UPDATE("bp_deviation");
        
        if (record.getNo() != null) {
            sql.SET("no = #{no,jdbcType=VARCHAR}");
        }
        
        if (record.getGname() != null) {
            sql.SET("gname = #{gname,jdbcType=VARCHAR}");
        }
        
        if (record.getSpan() != null) {
            sql.SET("span = #{span,jdbcType=VARCHAR}");
        }
        
        if (record.getBno() != null) {
            sql.SET("bno = #{bno,jdbcType=VARCHAR}");
        }
        
        if (record.getBatch() != null) {
            sql.SET("batch = #{batch,jdbcType=VARCHAR}");
        }
        
        if (record.getOperation() != null) {
            sql.SET("operation = #{operation,jdbcType=VARCHAR}");
        }
        
        if (record.getPosition() != null) {
            sql.SET("position = #{position,jdbcType=VARCHAR}");
        }
        
        if (record.getReporter() != null) {
            sql.SET("reporter = #{reporter,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationHandleTime() != null) {
            sql.SET("deviation_handle_time = #{deviationHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviationType() != null) {
            sql.SET("deviation_type = #{deviationType,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationContent() != null) {
            sql.SET("deviation_content = #{deviationContent,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationReason() != null) {
            sql.SET("deviation_reason = #{deviationReason,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationHandle() != null) {
            sql.SET("deviation_handle = #{deviationHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviationSign() != null) {
            sql.SET("deviation_sign = #{deviationSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQaHandle() != null) {
            sql.SET("qa_handle = #{qaHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getQaSign() != null) {
            sql.SET("qa_sign = #{qaSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQaHandleTime() != null) {
            sql.SET("qa_handle_time = #{qaHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getQualityMasterHandle() != null) {
            sql.SET("quality_master_handle = #{qualityMasterHandle,jdbcType=VARCHAR}");
        }
        
        if (record.getQualityMasterSign() != null) {
            sql.SET("quality_master_sign = #{qualityMasterSign,jdbcType=VARCHAR}");
        }
        
        if (record.getQualityMasterHandleTime() != null) {
            sql.SET("quality_master_handle_time = #{qualityMasterHandleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentFlow() != null) {
            sql.SET("current_flow = #{currentFlow,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("pid = #{pid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, BpDeviationExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}