package multiplication.book.application.challenge;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/*
 * 
 * This class provide a REST API to POST attempts from user
 */

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/attempts")
public class ChallengeAttemptController {
	
	
	@Autowired
	private final ChallengeService challengeService;
	


    @PostMapping(consumes =MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ChallengeAttempt> postResult(@RequestBody @Valid ChallengeAttemptDTO
    challengeAttemptDTO) {
        return ResponseEntity.ok(challengeService.verifyAttempt
        (challengeAttemptDTO));
    }
    
   @GetMapping
    ResponseEntity<List<ChallengeAttempt>> getStatistics(@RequestParam("alias")
    String alias) {
        return ResponseEntity.ok(
               challengeService.getStatsForUser(alias)
        );
    }
    

    


}
