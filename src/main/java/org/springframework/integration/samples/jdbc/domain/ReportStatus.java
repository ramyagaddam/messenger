package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ReportStatus implements Serializable {

    private Long rptStatusId;
    private Long grantId;
    private Long granteeId;
    private Long ProgramGranteeId;
    private String fy;
    private Integer qtr;
    private Integer mon;
    private Date currentQtr;
    private Date nextQtr;

}
