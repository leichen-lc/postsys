package com.xd.controller;

import com.xd.bean.Project;
import com.xd.bean.Resume;
import com.xd.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class SignController {
    @Autowired
    private SignService ss;

    @Autowired
    private JavaMailSenderImpl js;

    @RequestMapping("sendMail")
    @ResponseBody
    public String sendMail(HttpServletRequest sr){
        HttpSession session = sr.getSession();
        String email = (String)session.getAttribute("email");

        try {
            MimeMessage  message = js.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,false);
            helper.setFrom("17792259304@163.com");
            helper.setTo(email);
            helper.setSubject("通知邮件");
            helper.setText("您发布的项目请求已有程序员接单,联系方式为：15388627353,请您尽快与程序员联系.----管理员");
            helper.setSentDate(new Date());
            //发送邮件
            js.send(message);
            return "success";
        } catch (MessagingException e) {
            e.printStackTrace();
        }
          return "fail";
        }



        @RequestMapping("detial")
        public String detial(Integer project_id,Model model){
            List<Project> id = ss.findByid(project_id);
            model.addAttribute("id", id);
            return "detial";
        }

        @RequestMapping("sign")
        public String step(Model model){
            List<Resume> res = ss.findRes();
            model.addAttribute("res", res);
            if(res==null){
                return "step";
            }else{

                return "redirect:/show";
            }

        }


     @RequestMapping("show")
     public String show(Model model){
         List<Project> list = ss.findAll();
         model.addAttribute("list",list);
        return "show";
    }


}
