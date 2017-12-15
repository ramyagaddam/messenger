package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class ReportReceipt extends AbstractReportReceipt implements Serializable {

    private ReportStatus reportStatus;
    private List<ReportFormLevelAttachment> reportFormLevelAttachmentList;
    private List<ReportGroup> singlePageReportGroupList;//This list will be populated for a single page
    private List<ReportScreen> reportScreenList;//This list will be populated for a multi page

}
