package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AbstractReportCell implements Serializable {

    private Long rptCellId;
    private Long cellDataId;
    private String cellMetaName;
    private String cellTitle;
    private Integer cellDataType;
    private boolean cellHasAttachment;
    private String stringDataValue;
    private Double numberDataValue;
    private Date dateDataValue;
    private Long blobBinId;
    private String columnTitle;
    private Integer columnType;
    private Long parentRowId;
    private Integer columnOrder;
    private Integer columnContentType;
    private Long reportColumnId;
    private Integer maskType;
    private Integer capCode;
    

}
