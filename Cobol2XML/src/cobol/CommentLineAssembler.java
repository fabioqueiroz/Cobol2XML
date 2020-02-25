package cobol;

import parse.*;
import parse.tokens.*;

/*** Pop a string, and set the target DataDivision to this* string.** 
 * @param   Assembly   the assembly to work on
 */
public class CommentLineAssembler extends Assembler {

	@Override
	public void workOn(Assembly a) {
		//System.out.println("commentLineAssembler");
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		
		if(t.sval() != null) {
			c.setCommentLine(t.sval().trim());
			a.setTarget(c);
		}
		
	}

	
}
