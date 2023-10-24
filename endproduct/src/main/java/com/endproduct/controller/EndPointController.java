package com.endproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.endproduct.entity.EndPoint;
import com.endproduct.service.EndPointService;

@RestController
public class EndPointController {
	@Autowired
	EndPointService es;
	@Autowired
	RestTemplate rt;
	
	
	
	
	

	

	@GetMapping("/getnum/{a}/{b}")

	public int getNum(@PathVariable int a, @PathVariable int b) {
		String s = "http://localhost:8081/getnumber/" + a + "/" + b;
		ResponseEntity<Integer> r = rt.exchange(s, HttpMethod.GET, null, Integer.class);

		return r.getBody();
	}

@GetMapping("/getvalue")
public List<EndPoint> getProduct() {
	String s1="http://localhost:8081/getall";
    String s2="http://localhost:8082/gettaxbyhsn/";
    
    ResponseEntity<List<EndPoint>> re=rt.exchange(s1, HttpMethod.GET,null, new ParameterizedTypeReference<List<EndPoint>>(){});
    
    List<EndPoint> ab=re.getBody();
    ab.forEach(x->{
    	int hsn=x.getHsn();
    	
    	ResponseEntity<Integer>bc=rt.exchange(s2+hsn, HttpMethod.GET,null,Integer.class);
    	Integer d=bc.getBody();
    	x.setPrice(x.getPrice()+x.getPrice()*d/100);
    });
    
    return ab;
}


@GetMapping("/taxdis")
public List<EndPoint> getProduct1() {

String s1="http://localhost:8082/gettaxbyhsn/";
String s2="http://localhost:8082/getdisbyhsn/";

List<EndPoint> ab=es.getall();

ab.forEach(x-> {
	
	int hsn=x.getHsn();
	
	ResponseEntity<Integer> tax=rt.exchange(s1+hsn, HttpMethod.GET,null,Integer.class);
	ResponseEntity<Integer> dis=rt.exchange(s2+hsn, HttpMethod.GET,null,Integer.class);
	Integer t1=tax.getBody();
	Integer t2=dis.getBody();
	
	x.setTaxAmount(x.getPrice()*t1/100);
	x.setDisAmount(x.getPrice()*t2/100);
	
});
return ab;

}


@GetMapping("/getdata")

public ResponseEntity<String> getvalue() {
	String a = "http://localhost:8081/getname";
	ResponseEntity<String> b = rt.exchange(a, HttpMethod.GET, null, String.class);
	return b;
}

@GetMapping("/getupper")

public String getUpper() {
	String a = "http://localhost:8081/getname";
	ResponseEntity<String> b = rt.exchange(a, HttpMethod.GET, null, String.class);
	String c = b.getBody();
	return c.toUpperCase();
}









@PostMapping("/saveall")
public String postAll() {
	List<EndPoint>ab=getProduct();
	return es.postAll(ab);
}

			
			


	@PostMapping("/setall")
	public String setall(@RequestBody List<EndPoint> e) {
		return es.setall(e);
	}

	@GetMapping("/getall")
	public List<EndPoint> getall() {
		return es.getall();
	}

}
