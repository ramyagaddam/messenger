/**
 * 
 */
package org.springframework.integration.samples.jdbc.domain;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author <a href="mailto:jerry.li@grantsolutions.gov">Jianwei (Jerry) Li</a> 
 *
 * Created on Oct 13, 2017;	Modified on Oct 13, 2017;
 *
 * This class functions as ...
 */
public class DatastoreMessage implements Serializable {

	private static final long serialVersionUID = 6961682405858453690L;
	
	private int id;
	private long reportReceiptId;
	private String eventSource;
	private boolean formDeleted;

	public DatastoreMessage() {
		formDeleted = false;
	}

	public long getReportReceiptId() {
		return reportReceiptId;
	}

	public void setReportReceiptId(long reportReceiptId) {
		this.reportReceiptId = reportReceiptId;
	}
	
	public String getEventSource() {
		return eventSource;
	}

	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	public boolean isFormDeleted() {
		return formDeleted;
	}

	public void setFormDeleted(boolean formDeleted) {
		this.formDeleted = formDeleted;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventSource == null) ? 0 : eventSource.hashCode());
		result = prime * result + (formDeleted ? 1231 : 1237);
		result = prime * result + (int) (reportReceiptId ^ (reportReceiptId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatastoreMessage other = (DatastoreMessage) obj;
		if (eventSource == null) {
			if (other.eventSource != null)
				return false;
		} else if (!eventSource.equals(other.eventSource))
			return false;
		if (formDeleted != other.formDeleted)
			return false;
		if (reportReceiptId != other.reportReceiptId)
			return false;
		return true;
	}

	@Override
	public String toString(){
		JSONObject jsonInfo = new JSONObject();
		
		try {
			jsonInfo.put("reportReceiptId", this.reportReceiptId);
			jsonInfo.put("eventSource", this.eventSource);
			jsonInfo.put("formDeleted", this.formDeleted);
 
		} catch (JSONException e1) {}
		return jsonInfo.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
