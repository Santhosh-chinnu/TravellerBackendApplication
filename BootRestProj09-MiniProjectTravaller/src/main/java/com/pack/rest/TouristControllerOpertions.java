package com.pack.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pack.entity.Tourist;
import com.pack.service.IServiceTouristMgmt;

@RestController
@RequestMapping("/travaller-api")
public class TouristControllerOpertions {
	
	@Autowired
	private IServiceTouristMgmt Tservice;
	
	@PostMapping("/register")
	 public ResponseEntity<String> SaveTourist(@RequestBody Tourist tourist){
		try {
		String	msg=Tservice.registerTourist(tourist);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Wait some times try again",HttpStatus.INTERNAL_SERVER_ERROR);		
		}	
	}
	
	@GetMapping("/report")
	public ResponseEntity<?>showAllTravellers(){
		try {
			List<Tourist> list=Tservice.findAllTorusit();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("fetching problem",HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	@GetMapping("/find/{id}")
	public  ResponseEntity<?>showbyIdTraveller(@PathVariable("id") Integer id ){
		try {
			Tourist tourist=Tservice.findByIdTouriest(id);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<String>("internal problem",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?>updateDetails(@RequestBody Tourist tourist){
		try {
		String	msg=Tservice.updateTouristdetails(tourist);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("not updated",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTraveller(@PathVariable ("id") Integer id) throws Exception{
		try {
		Tourist	 tours=Tservice.deteleByidTouristdetails(id);
		return new ResponseEntity<Tourist>(tours,HttpStatus.OK);
		}
		catch (Exception e) {
		return new ResponseEntity<String>("not found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
}
