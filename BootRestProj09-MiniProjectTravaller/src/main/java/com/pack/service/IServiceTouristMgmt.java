package com.pack.service;

import java.util.List;
import com.pack.entity.Tourist;

public interface IServiceTouristMgmt {
	
	public String registerTourist(Tourist tourist);
	public List<Tourist>findAllTorusit();
	public Tourist findByIdTouriest(Integer id);
	public String updateTouristdetails(Tourist tourist);
	public Tourist deteleByidTouristdetails(Integer id) throws Exception;
}
