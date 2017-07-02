/**
 * 
 */
package com.devopswise;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 */
@Document(collection="note")
public class Note {
	
	@Id
	private String id;
	private String content;
	
	public Note() {
		super();
	}

	public Note(String id, String content) {
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	};
}
