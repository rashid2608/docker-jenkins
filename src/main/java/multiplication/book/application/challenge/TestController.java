package multiplication.book.application.challenge;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/test", produces =MediaType.APPLICATION_XML_VALUE)
public class TestController {

	
    @GetMapping
    ResponseEntity<String> getStatistics1(@RequestParam("a")
    String alias) {
    	
    	String res = "its working ";
    	
    	//return  challengeService.getStatsForUser1(alias+res);
       
    	return ResponseEntity.ok(res+alias);
       
    }
    
    @PostMapping(consumes =MediaType.APPLICATION_XML_VALUE)
    ResponseEntity<ArrayList<TestResponseDTO>> postResult(@RequestBody @Valid ChallengeAttemptDTO
    challengeAttemptDTO) {
    	
   
		ArrayList<TestResponseDTO> testResponseDTO = new ArrayList<TestResponseDTO>();
    	
    	TestResponseDTO testResponseDTO1 =  new TestResponseDTO();
    	
    	TestResponseDTO testResponseDTO2 =  new TestResponseDTO();
    	
		testResponseDTO1.setA(challengeAttemptDTO.getFactorA()+2);
		testResponseDTO1.setB(challengeAttemptDTO.getFactorB()+2);
		testResponseDTO1.setC(challengeAttemptDTO.getUserAlias()+" very good");
		testResponseDTO1.setD(challengeAttemptDTO.getGuess()+2);
		
		testResponseDTO.add(testResponseDTO1);
		
		testResponseDTO2.setA(challengeAttemptDTO.getFactorA()+6);
		testResponseDTO2.setB(challengeAttemptDTO.getFactorB()+9);
		testResponseDTO2.setC(challengeAttemptDTO.getUserAlias()+" very good");
		testResponseDTO2.setD(challengeAttemptDTO.getGuess()+12);
		
		
		testResponseDTO.add(testResponseDTO2);
		
		return new ResponseEntity<>(testResponseDTO, HttpStatus.OK);
    	
       // return ResponseEntity.ok(
       // (testResponseDTO));
    }


    

}
