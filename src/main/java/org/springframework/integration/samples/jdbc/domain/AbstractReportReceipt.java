package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public abstract class AbstractReportReceipt implements Serializable {

    private Long reportReceiptId;
    private String formCode;
    private String formCodeVersion;
    private Long formId;
    private String formNumber;
    private String formShortTitle;
    private Long dependencyType;
    private Long reportFrequency;
    private Date reportPeriodStartDate;
    private Date reportPeriodEndDate;
    private Date reportDueDate;
    private boolean finalIndicator;
    private boolean screenBased;
    private String grantNumber;
    private Long budgetPeriodId;
    private Integer budgetPeriodSequenceNumber;
    private Date budgetPeriodStartDate;
    private Date budgetPeriodEndDate;
    private Long externalApplicationId;
    private String submissionStatus;
    private Integer revisionSeqNumber;
    private Date receiptDate;
    private String expenditureStatus;
    private String estimateStatus;
    private Long sysPersonId;
    private String dunsIdOther;
    private String dunsId9;
    private String dunsId4;
    private String programAcronym;
    private String postalCode;
    private Integer sysProgramCode;
    private String formVersionNumber;
    private String adminCode;
    private String ein;
    
}
