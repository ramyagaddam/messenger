package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class ReportScreen implements Serializable {

    private Long rptScreenId;
    private Long rptScreenDataId;
    private String screenTitle;
    private Integer screenOrder;
    private Integer screenIteration;
    private String screenCode;
    private boolean screenIterated;

    private List<ReportGroup> multiPageReportGroupList;

}
