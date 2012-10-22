package jp.SandBox.service;

import javax.servlet.http.HttpSession;

import org.slim3.util.RequestLocator;

public class SessionManagementService {
    public void setUserId(String userId){
        HttpSession session = RequestLocator.get().getSession(true);
        session.setAttribute("userId", userId);
    }
    
    public String getUserId(){
        HttpSession session = RequestLocator.get().getSession(true);
        if(session.getAttribute("userId")!=null){
            return (String)session.getAttribute("userId");
        }else{
            return "";
        }
    }
}
