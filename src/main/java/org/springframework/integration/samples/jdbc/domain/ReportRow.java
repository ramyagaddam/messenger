
package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data
public class ReportRow extends AbstractReportRow implements Serializable{
    private List<ReportCell> reportCellList;

    public List<ReportCell> getReportCellList() {
        return reportCellList;
    }

    public void setReportCellList(List<ReportCell> reportCellList) {
        this.reportCellList = reportCellList;
    }

    
    
    
}
