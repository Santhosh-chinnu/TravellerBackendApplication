package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.Tourist;
import com.pack.repository.ITouristRepository;

@Service
public class ServiceTouristMgmtImpl implements IServiceTouristMgmt {

	@Autowired
	private ITouristRepository trepo;
	
	@Override
	public String registerTourist(Tourist tourist) {
	     int 	 idval=trepo.save(tourist).getTid();
	    return "Tourist registered Successfully :"+idval;
	}
	
   @Override
	public List<Tourist> findAllTorusit() {
		return trepo.findAll();
	}
   
    @Override
    public Tourist findByIdTouriest(Integer id) {
    	return trepo.findById(id).orElseThrow(()->new IllegalArgumentException());
    }   
    
    @Override
    public String updateTouristdetails(Tourist tourist) {
     Optional<Tourist>	opt=trepo.findById(tourist.getTid());
     if(opt.isPresent()) {
    	 trepo.save(tourist);
    	 return tourist.getTid()+" -->traveller data Updated";
     }
     else
     {
    	 throw new IllegalArgumentException(tourist.getTid()+"not found");
     }
    }
    
    @Override
    public Tourist deteleByidTouristdetails(Integer id) throws Exception {
     Tourist  tu=trepo.findById(id).orElseThrow(()-> new IllegalAccessException("invalid data "));
     trepo.deleteById(id);
     return tu;
    }
}

