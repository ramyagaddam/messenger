package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ReportFormLevelAttachment implements Serializable {

    private Long attachmentId;
    private String fileName;
    private String fileType;
    private Date dateReceived;
    private String uuid;
    private Integer uploadStatus;

   
}
