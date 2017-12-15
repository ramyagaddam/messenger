package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class ReportSubGroup extends AbstractReportGroup implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5675556116278514672L;

    private List<ReportSubRow> reportSubRowList;

}
