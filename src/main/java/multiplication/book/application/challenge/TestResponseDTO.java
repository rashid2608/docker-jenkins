package multiplication.book.application.challenge;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.*;

@XmlRootElement
public class TestResponseDTO {
	
	@Setter
	@Getter
	int a;
	
	@Setter
	@Getter
	int b;
	
	@Setter
	@Getter
	String c;
	
	@Setter
	@Getter
	int d;

}
