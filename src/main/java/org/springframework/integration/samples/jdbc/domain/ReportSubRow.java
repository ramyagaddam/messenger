package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class ReportSubRow extends AbstractReportRow implements Serializable {

    private List<ReportSubCell> reportSubCellList;

}
