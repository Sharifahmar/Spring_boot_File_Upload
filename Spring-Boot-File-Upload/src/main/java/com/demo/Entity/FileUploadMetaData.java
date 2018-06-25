package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** An entity that stores file meta data into database*/
@Entity
@Table(name="document_metadata")
public class FileUploadMetaData {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	private String name;
	
	private String contentType;
	
	private long contentSize;
	
	private String path;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getContentSize() {
		return contentSize;
	}

	public void setContentSize(long contentSize) {
		this.contentSize = contentSize;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

	
	
}
