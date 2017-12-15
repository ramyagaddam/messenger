package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class ReportGroup extends AbstractReportGroup implements Serializable {

    private List<ReportRow> reportRowList;

}
