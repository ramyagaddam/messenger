
package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data
public class ReportCell extends AbstractReportCell implements Serializable{
    private List<ReportCellLevelAttachment> reportCellLevelAttachmentList;
}
