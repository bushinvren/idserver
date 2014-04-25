package com.idserver.server.domain;

import java.util.List;

public class Results<T> {
	private int count;
	private List<T> results;
	
	public int getCount() {
		return count;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
		this.count = results.size();
	}
	
	public void setCount(int count){
		this.count = count;
	}
}
