package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class AbstractReportGroup implements Serializable {

    private Long rptGroupId;
    private String groupName;
    private Integer groupOrder;
    private Long groupStatusId;
    private Integer saveStatus;
    private Integer groupType;

}
