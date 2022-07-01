package lk.ac.vau.elms.Model;

public class ErrorMsg {
	private String Message;
	private int StatusCode;
	private String Help;
	
	public ErrorMsg() {
		
	}

	public ErrorMsg(String message, int statusCode, String help) {
		super();
		Message = message;
		StatusCode = statusCode;
		Help = help;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public int getStatusCode() {
		return StatusCode;
	}

	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}

	public String getHelp() {
		return Help;
	}

	public void setHelp(String help) {
		Help = help;
	}

}

