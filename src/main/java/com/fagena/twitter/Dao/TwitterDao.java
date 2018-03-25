package com.fagena.twitter.Dao;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


public class TwitterDao 
{
	private JdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) 
	{
		this.jdbc = new JdbcTemplate (jdbc);
		
	}
	
	public List<Table> getTables(){
		
		return jdbc.query("select * from twitter_record_1", new RowMapper<Table>(){
			
			public Table mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				Table table = new Table();
				
				table.setId(rs.getInt("id"));
				table.setName(rs.getString("name"));
				table.setMessage(rs.getString("text"));
				table.setFriends(rs.getInt("fiends"));
				table.setDate(rs.getString("date"));
				
				return table;
			}
			
		});
	}
		
}
			
