/**
 * date:2012-9-24 /上午10:07:45
 * FileName:JsonResponse.java
 * Description:用泛型类.代替包中其他处理类.简化扩展工作量.
 */
package com.idserver.server.json;

import java.util.List;

/**
 * @author liuzw
 * 
 */
public class JsonResponse<T> {
	
	private List<T> rows;

	/**
	 * Current page of the query
	 */
	private String page;

	/**
	 * Total pages for the query
	 */
	private String total;

	/**
	 * Total number of records for the query
	 */
	private String records;

	public JsonResponse() {

	}

	/**
	 * @return the rows
	 */
	public List<T> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}

	/**
	 * @param page
	 *            the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @return the records
	 */
	public String getRecords() {
		return records;
	}

	/**
	 * @param records
	 *            the records to set
	 */
	public void setRecords(String records) {
		this.records = records;
	}

}
