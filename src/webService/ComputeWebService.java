package webService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.ComputeService;

@WebService
@SOAPBinding(style = Style.RPC)
public class ComputeWebService {

	private final ComputeService service = ComputeService.getInstance();
	
	public int addition(int left, int right) {
		return service.compute(left, right);
	}
}
