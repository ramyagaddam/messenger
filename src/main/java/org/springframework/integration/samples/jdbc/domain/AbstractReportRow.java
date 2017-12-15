package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class AbstractReportRow implements Serializable{

    private Long rptRowId;
    private Long rowDataId;
    private String rowType;
    private Integer rowIteration;
    private String rowTitle;
    private Integer rowOrder;
    private String rowCode;

}
