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
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


public class TwitterDao 
{
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) 
	{
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	// Batch update: prepared statement 
	@Transactional
		public int[]createInsert (List<Table>table){
			SqlParameterSource[]params=SqlParameterSourceUtils.createBatch(table.toArray());
			return jdbc.batchUpdate("insert into twitter_record_1 (name, screenName, friendsCount, text, createdAt, id) values (:name,:screenName,:friends,:message,:date,:id)",params);
			
		}
		
}
			
