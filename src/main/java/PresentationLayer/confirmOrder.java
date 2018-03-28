
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class confirmOrder extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        HttpSession session = request.getSession();
//        session.setAttribute("singleOrder", singleOrder);
        User user = (User) session.getAttribute("user");
        try{
        LogicFacade.createOrder(user, new Order(width, length, height));
            
        }catch(OrderException ex){
            throw new OrderException("could not catch");
        }
        return "confirmOrder";
    }
    
}
