package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class MultiPageCache implements Serializable {

    private ReportReceipt reportReceipt;

}
