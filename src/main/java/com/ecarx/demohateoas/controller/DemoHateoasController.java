package com.ecarx.demohateoas.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecarx.demohateoas.model.DemoRequest;
import com.ecarx.demohateoas.model.DemoResponse;

@RestController
public class DemoHateoasController {

	@PostMapping(value = "/demo/submitctn", produces = MediaType.APPLICATION_JSON_VALUE)
	public Resource<Object> submitCTN(@RequestBody DemoRequest demoRequest) {
		DemoResponse demoResponse = new DemoResponse();
		demoResponse.setCtn("123");
		demoResponse.setOtac("1234");
		Resource<Object> resource = null;
		
		Link links = linkTo(methodOn(DemoHateoasController.class).validateOTAC(demoRequest)).withRel("validateotac");
		
		resource = new Resource<Object>(demoResponse, links);
		
		return resource;
	}
	
	@PostMapping(value = "/demo/validateotac", produces = MediaType.APPLICATION_JSON_VALUE)
	public Resource<Object> validateOTAC(@RequestBody DemoRequest demoRequest) {
		DemoResponse demoResponse = null;
		Resource<Object> resource = null;
		
		
		
		return resource;
	}
}
