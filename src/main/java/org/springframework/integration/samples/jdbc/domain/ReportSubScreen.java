package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class ReportSubScreen implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3982571117969931201L;
	private Long rptSubScreenId;
    private Long rptSubScreenDataId;
    private Long rptReceiptId;
    private long sysRowDataIdMain;
    private long sysRptCellId;
    private String screenStatus;
    private String userSubScreenName;
    private String subScreenName;
    private List<ReportSubGroup> reportSubGroupList;

}