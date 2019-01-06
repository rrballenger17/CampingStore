package com.production.validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;


public class NewsSource {
	
	@NoParenthesis
    @NotNull(message = "{validate.newssource.Name}")
    private String Name;

    // DateFounded
    @NotNull(message = "{validate.newssource.Date}")
    @Past(message = "{validate.newssource.Date}")
    private Date date;
    
    // Associated Press ID
    @NotNull(message = "{validate.newssource.id}")
    @Pattern(
            regexp = "[0-9]*",
            message = "{validate.newssource.id}"
    )
    private String id;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String localDateTime) {

		Date date1;
		try {
			date1 = new SimpleDateFormat("yyyy").parse(localDateTime);
			this.date = date1;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			date1=null;
		}  

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
}
