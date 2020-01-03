package cn.myccit.ifactory.mybatis.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class BpDeviation implements Serializable {
    private Integer pid;

    private String no;

    private String gname;

    private String span;

    private String bno;

    private String batch;

    private String operation;

    private String position;

    private String reporter;

    private Timestamp deviationHandleTime;

    private String deviationType;

    private String deviationContent;

    private String deviationReason;

    private String deviationHandle;

    private String deviationSign;

    private String qaHandle;

    private String qaSign;

    private Timestamp qaHandleTime;

    private String qualityMasterHandle;

    private String qualityMasterSign;

    private Timestamp qualityMasterHandleTime;

    private String currentFlow;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getSpan() {
        return span;
    }

    public void setSpan(String span) {
        this.span = span == null ? null : span.trim();
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno == null ? null : bno.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public Timestamp getDeviationHandleTime() {
        return deviationHandleTime;
    }

    public void setDeviationHandleTime(Timestamp deviationHandleTime) {
        this.deviationHandleTime = deviationHandleTime;
    }

    public String getDeviationType() {
        return deviationType;
    }

    public void setDeviationType(String deviationType) {
        this.deviationType = deviationType == null ? null : deviationType.trim();
    }

    public String getDeviationContent() {
        return deviationContent;
    }

    public void setDeviationContent(String deviationContent) {
        this.deviationContent = deviationContent == null ? null : deviationContent.trim();
    }

    public String getDeviationReason() {
        return deviationReason;
    }

    public void setDeviationReason(String deviationReason) {
        this.deviationReason = deviationReason == null ? null : deviationReason.trim();
    }

    public String getDeviationHandle() {
        return deviationHandle;
    }

    public void setDeviationHandle(String deviationHandle) {
        this.deviationHandle = deviationHandle == null ? null : deviationHandle.trim();
    }

    public String getDeviationSign() {
        return deviationSign;
    }

    public void setDeviationSign(String deviationSign) {
        this.deviationSign = deviationSign == null ? null : deviationSign.trim();
    }

    public String getQaHandle() {
        return qaHandle;
    }

    public void setQaHandle(String qaHandle) {
        this.qaHandle = qaHandle == null ? null : qaHandle.trim();
    }

    public String getQaSign() {
        return qaSign;
    }

    public void setQaSign(String qaSign) {
        this.qaSign = qaSign == null ? null : qaSign.trim();
    }

    public Timestamp getQaHandleTime() {
        return qaHandleTime;
    }

    public void setQaHandleTime(Timestamp qaHandleTime) {
        this.qaHandleTime = qaHandleTime;
    }

    public String getQualityMasterHandle() {
        return qualityMasterHandle;
    }

    public void setQualityMasterHandle(String qualityMasterHandle) {
        this.qualityMasterHandle = qualityMasterHandle == null ? null : qualityMasterHandle.trim();
    }

    public String getQualityMasterSign() {
        return qualityMasterSign;
    }

    public void setQualityMasterSign(String qualityMasterSign) {
        this.qualityMasterSign = qualityMasterSign == null ? null : qualityMasterSign.trim();
    }

    public Timestamp getQualityMasterHandleTime() {
        return qualityMasterHandleTime;
    }

    public void setQualityMasterHandleTime(Timestamp qualityMasterHandleTime) {
        this.qualityMasterHandleTime = qualityMasterHandleTime;
    }

    public String getCurrentFlow() {
        return currentFlow;
    }

    public void setCurrentFlow(String currentFlow) {
        this.currentFlow = currentFlow == null ? null : currentFlow.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", no=").append(no);
        sb.append(", gname=").append(gname);
        sb.append(", span=").append(span);
        sb.append(", bno=").append(bno);
        sb.append(", batch=").append(batch);
        sb.append(", operation=").append(operation);
        sb.append(", position=").append(position);
        sb.append(", reporter=").append(reporter);
        sb.append(", deviationHandleTime=").append(deviationHandleTime);
        sb.append(", deviationType=").append(deviationType);
        sb.append(", deviationContent=").append(deviationContent);
        sb.append(", deviationReason=").append(deviationReason);
        sb.append(", deviationHandle=").append(deviationHandle);
        sb.append(", deviationSign=").append(deviationSign);
        sb.append(", qaHandle=").append(qaHandle);
        sb.append(", qaSign=").append(qaSign);
        sb.append(", qaHandleTime=").append(qaHandleTime);
        sb.append(", qualityMasterHandle=").append(qualityMasterHandle);
        sb.append(", qualityMasterSign=").append(qualityMasterSign);
        sb.append(", qualityMasterHandleTime=").append(qualityMasterHandleTime);
        sb.append(", currentFlow=").append(currentFlow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}