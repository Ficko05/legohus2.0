package PresentationLayer;

import FunctionLayer.Bricks;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.Calculate;
import FunctionLayer.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Calculator extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        int w = Integer.parseInt(request.getParameter("w"));
        int l = Integer.parseInt(request.getParameter("l"));
        int h = Integer.parseInt(request.getParameter("h"));
        request.setAttribute("w", w);
        request.setAttribute("l", l);
        request.setAttribute("h", h);
        //Calculate cal = new Calculate();
        Bricks bricks = Calculate.orderCalculator(new Order(w, l, h));
        request.setAttribute("bricks", bricks);
        return "customerOrder";
    }

}
