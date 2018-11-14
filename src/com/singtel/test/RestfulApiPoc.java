package com.singtel.test;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulApiPoc {
  
  @PostMapping(value = "/test/callToCheckRoosterSound", 
      produces = MediaType.APPLICATION_XML_VALUE, 
      consumes = MediaType.APPLICATION_XML_VALUE) //This can be json also
      public MessageTypeVO callToCheckRoosterSound(
          @Valid @RequestBody MessageType messageBody, BindingResult result)
              throws Exception {

        if (result.hasErrors()) {
          throw SomeException();
        }

        //Logic here for assigning the sound-type base on the language
        //If this calls for a service class to do the business logic,
        //the class need to have @Service annotation
        
        //If the logic involves looking up a JPA repository, then @Autowired can be used
        //JPA Repo need to be tied with Database table java entity (@Entity) 
        //where primary key (@Id) and for columns (@Column) are mentioned where by the logic can query using the field name

        return messageTypeVO;
      }

}
