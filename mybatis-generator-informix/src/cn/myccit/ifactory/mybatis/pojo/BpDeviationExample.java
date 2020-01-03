package cn.myccit.ifactory.mybatis.pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BpDeviationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BpDeviationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andSpanIsNull() {
            addCriterion("span is null");
            return (Criteria) this;
        }

        public Criteria andSpanIsNotNull() {
            addCriterion("span is not null");
            return (Criteria) this;
        }

        public Criteria andSpanEqualTo(String value) {
            addCriterion("span =", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotEqualTo(String value) {
            addCriterion("span <>", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanGreaterThan(String value) {
            addCriterion("span >", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanGreaterThanOrEqualTo(String value) {
            addCriterion("span >=", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanLessThan(String value) {
            addCriterion("span <", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanLessThanOrEqualTo(String value) {
            addCriterion("span <=", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanLike(String value) {
            addCriterion("span like", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotLike(String value) {
            addCriterion("span not like", value, "span");
            return (Criteria) this;
        }

        public Criteria andSpanIn(List<String> values) {
            addCriterion("span in", values, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotIn(List<String> values) {
            addCriterion("span not in", values, "span");
            return (Criteria) this;
        }

        public Criteria andSpanBetween(String value1, String value2) {
            addCriterion("span between", value1, value2, "span");
            return (Criteria) this;
        }

        public Criteria andSpanNotBetween(String value1, String value2) {
            addCriterion("span not between", value1, value2, "span");
            return (Criteria) this;
        }

        public Criteria andBnoIsNull() {
            addCriterion("bno is null");
            return (Criteria) this;
        }

        public Criteria andBnoIsNotNull() {
            addCriterion("bno is not null");
            return (Criteria) this;
        }

        public Criteria andBnoEqualTo(String value) {
            addCriterion("bno =", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotEqualTo(String value) {
            addCriterion("bno <>", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThan(String value) {
            addCriterion("bno >", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThanOrEqualTo(String value) {
            addCriterion("bno >=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThan(String value) {
            addCriterion("bno <", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThanOrEqualTo(String value) {
            addCriterion("bno <=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLike(String value) {
            addCriterion("bno like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotLike(String value) {
            addCriterion("bno not like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoIn(List<String> values) {
            addCriterion("bno in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotIn(List<String> values) {
            addCriterion("bno not in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoBetween(String value1, String value2) {
            addCriterion("bno between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotBetween(String value1, String value2) {
            addCriterion("bno not between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeIsNull() {
            addCriterion("deviation_handle_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeIsNotNull() {
            addCriterion("deviation_handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeEqualTo(Timestamp value) {
            addCriterion("deviation_handle_time =", value, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeNotEqualTo(Timestamp value) {
            addCriterion("deviation_handle_time <>", value, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeGreaterThan(Timestamp value) {
            addCriterion("deviation_handle_time >", value, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("deviation_handle_time >=", value, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeLessThan(Timestamp value) {
            addCriterion("deviation_handle_time <", value, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("deviation_handle_time <=", value, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeIn(List<Timestamp> values) {
            addCriterion("deviation_handle_time in", values, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeNotIn(List<Timestamp> values) {
            addCriterion("deviation_handle_time not in", values, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("deviation_handle_time between", value1, value2, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("deviation_handle_time not between", value1, value2, "deviationHandleTime");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeIsNull() {
            addCriterion("deviation_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeIsNotNull() {
            addCriterion("deviation_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeEqualTo(String value) {
            addCriterion("deviation_type =", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeNotEqualTo(String value) {
            addCriterion("deviation_type <>", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeGreaterThan(String value) {
            addCriterion("deviation_type >", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deviation_type >=", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeLessThan(String value) {
            addCriterion("deviation_type <", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeLessThanOrEqualTo(String value) {
            addCriterion("deviation_type <=", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeLike(String value) {
            addCriterion("deviation_type like", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeNotLike(String value) {
            addCriterion("deviation_type not like", value, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeIn(List<String> values) {
            addCriterion("deviation_type in", values, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeNotIn(List<String> values) {
            addCriterion("deviation_type not in", values, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeBetween(String value1, String value2) {
            addCriterion("deviation_type between", value1, value2, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationTypeNotBetween(String value1, String value2) {
            addCriterion("deviation_type not between", value1, value2, "deviationType");
            return (Criteria) this;
        }

        public Criteria andDeviationContentIsNull() {
            addCriterion("deviation_content is null");
            return (Criteria) this;
        }

        public Criteria andDeviationContentIsNotNull() {
            addCriterion("deviation_content is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationContentEqualTo(String value) {
            addCriterion("deviation_content =", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentNotEqualTo(String value) {
            addCriterion("deviation_content <>", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentGreaterThan(String value) {
            addCriterion("deviation_content >", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentGreaterThanOrEqualTo(String value) {
            addCriterion("deviation_content >=", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentLessThan(String value) {
            addCriterion("deviation_content <", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentLessThanOrEqualTo(String value) {
            addCriterion("deviation_content <=", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentLike(String value) {
            addCriterion("deviation_content like", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentNotLike(String value) {
            addCriterion("deviation_content not like", value, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentIn(List<String> values) {
            addCriterion("deviation_content in", values, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentNotIn(List<String> values) {
            addCriterion("deviation_content not in", values, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentBetween(String value1, String value2) {
            addCriterion("deviation_content between", value1, value2, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationContentNotBetween(String value1, String value2) {
            addCriterion("deviation_content not between", value1, value2, "deviationContent");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonIsNull() {
            addCriterion("deviation_reason is null");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonIsNotNull() {
            addCriterion("deviation_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonEqualTo(String value) {
            addCriterion("deviation_reason =", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonNotEqualTo(String value) {
            addCriterion("deviation_reason <>", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonGreaterThan(String value) {
            addCriterion("deviation_reason >", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("deviation_reason >=", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonLessThan(String value) {
            addCriterion("deviation_reason <", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonLessThanOrEqualTo(String value) {
            addCriterion("deviation_reason <=", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonLike(String value) {
            addCriterion("deviation_reason like", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonNotLike(String value) {
            addCriterion("deviation_reason not like", value, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonIn(List<String> values) {
            addCriterion("deviation_reason in", values, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonNotIn(List<String> values) {
            addCriterion("deviation_reason not in", values, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonBetween(String value1, String value2) {
            addCriterion("deviation_reason between", value1, value2, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationReasonNotBetween(String value1, String value2) {
            addCriterion("deviation_reason not between", value1, value2, "deviationReason");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleIsNull() {
            addCriterion("deviation_handle is null");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleIsNotNull() {
            addCriterion("deviation_handle is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleEqualTo(String value) {
            addCriterion("deviation_handle =", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleNotEqualTo(String value) {
            addCriterion("deviation_handle <>", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleGreaterThan(String value) {
            addCriterion("deviation_handle >", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleGreaterThanOrEqualTo(String value) {
            addCriterion("deviation_handle >=", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleLessThan(String value) {
            addCriterion("deviation_handle <", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleLessThanOrEqualTo(String value) {
            addCriterion("deviation_handle <=", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleLike(String value) {
            addCriterion("deviation_handle like", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleNotLike(String value) {
            addCriterion("deviation_handle not like", value, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleIn(List<String> values) {
            addCriterion("deviation_handle in", values, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleNotIn(List<String> values) {
            addCriterion("deviation_handle not in", values, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleBetween(String value1, String value2) {
            addCriterion("deviation_handle between", value1, value2, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationHandleNotBetween(String value1, String value2) {
            addCriterion("deviation_handle not between", value1, value2, "deviationHandle");
            return (Criteria) this;
        }

        public Criteria andDeviationSignIsNull() {
            addCriterion("deviation_sign is null");
            return (Criteria) this;
        }

        public Criteria andDeviationSignIsNotNull() {
            addCriterion("deviation_sign is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationSignEqualTo(String value) {
            addCriterion("deviation_sign =", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignNotEqualTo(String value) {
            addCriterion("deviation_sign <>", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignGreaterThan(String value) {
            addCriterion("deviation_sign >", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignGreaterThanOrEqualTo(String value) {
            addCriterion("deviation_sign >=", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignLessThan(String value) {
            addCriterion("deviation_sign <", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignLessThanOrEqualTo(String value) {
            addCriterion("deviation_sign <=", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignLike(String value) {
            addCriterion("deviation_sign like", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignNotLike(String value) {
            addCriterion("deviation_sign not like", value, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignIn(List<String> values) {
            addCriterion("deviation_sign in", values, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignNotIn(List<String> values) {
            addCriterion("deviation_sign not in", values, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignBetween(String value1, String value2) {
            addCriterion("deviation_sign between", value1, value2, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andDeviationSignNotBetween(String value1, String value2) {
            addCriterion("deviation_sign not between", value1, value2, "deviationSign");
            return (Criteria) this;
        }

        public Criteria andQaHandleIsNull() {
            addCriterion("qa_handle is null");
            return (Criteria) this;
        }

        public Criteria andQaHandleIsNotNull() {
            addCriterion("qa_handle is not null");
            return (Criteria) this;
        }

        public Criteria andQaHandleEqualTo(String value) {
            addCriterion("qa_handle =", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleNotEqualTo(String value) {
            addCriterion("qa_handle <>", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleGreaterThan(String value) {
            addCriterion("qa_handle >", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleGreaterThanOrEqualTo(String value) {
            addCriterion("qa_handle >=", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleLessThan(String value) {
            addCriterion("qa_handle <", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleLessThanOrEqualTo(String value) {
            addCriterion("qa_handle <=", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleLike(String value) {
            addCriterion("qa_handle like", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleNotLike(String value) {
            addCriterion("qa_handle not like", value, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleIn(List<String> values) {
            addCriterion("qa_handle in", values, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleNotIn(List<String> values) {
            addCriterion("qa_handle not in", values, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleBetween(String value1, String value2) {
            addCriterion("qa_handle between", value1, value2, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaHandleNotBetween(String value1, String value2) {
            addCriterion("qa_handle not between", value1, value2, "qaHandle");
            return (Criteria) this;
        }

        public Criteria andQaSignIsNull() {
            addCriterion("qa_sign is null");
            return (Criteria) this;
        }

        public Criteria andQaSignIsNotNull() {
            addCriterion("qa_sign is not null");
            return (Criteria) this;
        }

        public Criteria andQaSignEqualTo(String value) {
            addCriterion("qa_sign =", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignNotEqualTo(String value) {
            addCriterion("qa_sign <>", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignGreaterThan(String value) {
            addCriterion("qa_sign >", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignGreaterThanOrEqualTo(String value) {
            addCriterion("qa_sign >=", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignLessThan(String value) {
            addCriterion("qa_sign <", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignLessThanOrEqualTo(String value) {
            addCriterion("qa_sign <=", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignLike(String value) {
            addCriterion("qa_sign like", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignNotLike(String value) {
            addCriterion("qa_sign not like", value, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignIn(List<String> values) {
            addCriterion("qa_sign in", values, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignNotIn(List<String> values) {
            addCriterion("qa_sign not in", values, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignBetween(String value1, String value2) {
            addCriterion("qa_sign between", value1, value2, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaSignNotBetween(String value1, String value2) {
            addCriterion("qa_sign not between", value1, value2, "qaSign");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeIsNull() {
            addCriterion("qa_handle_time is null");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeIsNotNull() {
            addCriterion("qa_handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeEqualTo(Timestamp value) {
            addCriterion("qa_handle_time =", value, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeNotEqualTo(Timestamp value) {
            addCriterion("qa_handle_time <>", value, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeGreaterThan(Timestamp value) {
            addCriterion("qa_handle_time >", value, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("qa_handle_time >=", value, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeLessThan(Timestamp value) {
            addCriterion("qa_handle_time <", value, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("qa_handle_time <=", value, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeIn(List<Timestamp> values) {
            addCriterion("qa_handle_time in", values, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeNotIn(List<Timestamp> values) {
            addCriterion("qa_handle_time not in", values, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("qa_handle_time between", value1, value2, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQaHandleTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("qa_handle_time not between", value1, value2, "qaHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleIsNull() {
            addCriterion("quality_master_handle is null");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleIsNotNull() {
            addCriterion("quality_master_handle is not null");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleEqualTo(String value) {
            addCriterion("quality_master_handle =", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleNotEqualTo(String value) {
            addCriterion("quality_master_handle <>", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleGreaterThan(String value) {
            addCriterion("quality_master_handle >", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleGreaterThanOrEqualTo(String value) {
            addCriterion("quality_master_handle >=", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleLessThan(String value) {
            addCriterion("quality_master_handle <", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleLessThanOrEqualTo(String value) {
            addCriterion("quality_master_handle <=", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleLike(String value) {
            addCriterion("quality_master_handle like", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleNotLike(String value) {
            addCriterion("quality_master_handle not like", value, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleIn(List<String> values) {
            addCriterion("quality_master_handle in", values, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleNotIn(List<String> values) {
            addCriterion("quality_master_handle not in", values, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleBetween(String value1, String value2) {
            addCriterion("quality_master_handle between", value1, value2, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleNotBetween(String value1, String value2) {
            addCriterion("quality_master_handle not between", value1, value2, "qualityMasterHandle");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignIsNull() {
            addCriterion("quality_master_sign is null");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignIsNotNull() {
            addCriterion("quality_master_sign is not null");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignEqualTo(String value) {
            addCriterion("quality_master_sign =", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignNotEqualTo(String value) {
            addCriterion("quality_master_sign <>", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignGreaterThan(String value) {
            addCriterion("quality_master_sign >", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignGreaterThanOrEqualTo(String value) {
            addCriterion("quality_master_sign >=", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignLessThan(String value) {
            addCriterion("quality_master_sign <", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignLessThanOrEqualTo(String value) {
            addCriterion("quality_master_sign <=", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignLike(String value) {
            addCriterion("quality_master_sign like", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignNotLike(String value) {
            addCriterion("quality_master_sign not like", value, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignIn(List<String> values) {
            addCriterion("quality_master_sign in", values, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignNotIn(List<String> values) {
            addCriterion("quality_master_sign not in", values, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignBetween(String value1, String value2) {
            addCriterion("quality_master_sign between", value1, value2, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterSignNotBetween(String value1, String value2) {
            addCriterion("quality_master_sign not between", value1, value2, "qualityMasterSign");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeIsNull() {
            addCriterion("quality_master_handle_time is null");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeIsNotNull() {
            addCriterion("quality_master_handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeEqualTo(Timestamp value) {
            addCriterion("quality_master_handle_time =", value, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeNotEqualTo(Timestamp value) {
            addCriterion("quality_master_handle_time <>", value, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeGreaterThan(Timestamp value) {
            addCriterion("quality_master_handle_time >", value, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("quality_master_handle_time >=", value, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeLessThan(Timestamp value) {
            addCriterion("quality_master_handle_time <", value, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("quality_master_handle_time <=", value, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeIn(List<Timestamp> values) {
            addCriterion("quality_master_handle_time in", values, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeNotIn(List<Timestamp> values) {
            addCriterion("quality_master_handle_time not in", values, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("quality_master_handle_time between", value1, value2, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andQualityMasterHandleTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("quality_master_handle_time not between", value1, value2, "qualityMasterHandleTime");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowIsNull() {
            addCriterion("current_flow is null");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowIsNotNull() {
            addCriterion("current_flow is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowEqualTo(String value) {
            addCriterion("current_flow =", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowNotEqualTo(String value) {
            addCriterion("current_flow <>", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowGreaterThan(String value) {
            addCriterion("current_flow >", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowGreaterThanOrEqualTo(String value) {
            addCriterion("current_flow >=", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowLessThan(String value) {
            addCriterion("current_flow <", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowLessThanOrEqualTo(String value) {
            addCriterion("current_flow <=", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowLike(String value) {
            addCriterion("current_flow like", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowNotLike(String value) {
            addCriterion("current_flow not like", value, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowIn(List<String> values) {
            addCriterion("current_flow in", values, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowNotIn(List<String> values) {
            addCriterion("current_flow not in", values, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowBetween(String value1, String value2) {
            addCriterion("current_flow between", value1, value2, "currentFlow");
            return (Criteria) this;
        }

        public Criteria andCurrentFlowNotBetween(String value1, String value2) {
            addCriterion("current_flow not between", value1, value2, "currentFlow");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}