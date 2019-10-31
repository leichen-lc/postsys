package com.xd.controller;

import com.xd.bean.*;
import com.xd.service.SignService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
        Integer id = ss.findId(email);
        session.setAttribute("id",id);



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

        int resume_person=2;
            List<Resume> res = ss.findRes(resume_person);

            System.out.println(res);
            model.addAttribute("res", res);
            if(res.isEmpty()){
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




    @RequestMapping("add2")
    @ResponseBody
    public String add2(@RequestParam("files") MultipartFile files [],HttpServletRequest sr) {

        System.out.println(files.length);
        for (MultipartFile file : files) {
            System.out.println(file);
        }
        //保存文件地址
        MultipartFile workstu = files[0];
        MultipartFile workstu1 = files[1];
        MultipartFile workstu2 = files[2];
        HttpSession session1 = sr.getSession();
        session1.setAttribute("files",workstu);
        session1.setAttribute("files1",workstu1);
        session1.setAttribute("files2",workstu2);
        return null;


}


        @RequestMapping("add")
        @ResponseBody
        public String add(@RequestBody Ree re ,HttpServletRequest sr,JobInformation job,Resume res,Jobs jobs,Education edu,Skills ski, Works wor, Identification ide) {
            //获取工作地址
            String city = re.getJob().getCity();
            String province = re.getJob().getProvince();
            re.getJob().setJob_address(province + city);
            System.out.println(re.getJob().getJob_address());

            //获取文件地址
            HttpSession session1 = sr.getSession();
            MultipartFile files = (MultipartFile) session1.getAttribute("files");
            MultipartFile files1 = (MultipartFile) session1.getAttribute("files1");
            MultipartFile files2 = (MultipartFile) session1.getAttribute("files2");
            //将文件地址放入相应对象中
            re.getWor().setWorks_image(files.toString());
            re.getIde().setWorkstu1(files1.toString());
            re.getIde().setWorkstu2(files2.toString());

            System.out.println(re.getWor().getWorks_image());
            System.out.println(re.getIde().getWorkstu1());
            System.out.println(re.getIde().getWorkstu2());

            System.out.println(re);

           // 获取user_id
             int userid=2;
            //Integer userid = (Integer)session1.getAttribute("id");
            //System.out.println(userid);



            //JobInformation
            JobInformation job1 = re.getJob();
            job1.setJob_person(userid);


            //Resume
            String resume_workstatus = re.getRes().getResume_workstatus();
            res.setResume_workstatus(resume_workstatus);
            String resume_workdirection = re.getRes().getResume_workdirection();
            res.setResume_workdirection(resume_workdirection);
            String resume_jobs = re.getRes().getResume_jobs();
            res.setResume_jobs(resume_jobs);
            res.setResume_person(userid);

            //Jobs
            String time = re.getRes().getTime();
            jobs.setTime(time);
            String company = re.getRes().getCompany();
            jobs.setCompany(company);
            String position = re.getRes().getPosition();
            jobs.setPosition(position);
            jobs.setJobs_user(userid);


            //Education
            String education_date = re.getRes().getEducation_date();
            edu.setEducation_date(education_date);
            String school_name = re.getRes().getSchool_name();
            edu.setSchool_name(school_name);
            String profession = re.getRes().getProfession();
            edu.setProfession(profession);
            String education_level = re.getRes().getEducation_level();
            edu.setEducation_level(education_level);
            edu.setEducation_person(userid);

            //Skill
            String skill_name = re.getWor().getSkill_name();
            ski.setSkill_name(skill_name);
            String skill_evaluate = re.getWor().getSkill_evaluate();
            ski.setSkill_evaluate(skill_evaluate);
            ski.setSkill_person(userid);


            //Works
            String works_name = re.getWor().getWorks_name();
            wor.setWorks_name(works_name);
            String works_trade = re.getWor().getWorks_trade();
            wor.setWorks_trade(works_trade);
            String works_keyword = re.getWor().getWorks_keyword();
            wor.setWorks_keyword(works_keyword);
            String works_href = re.getWor().getWorks_href();
            wor.setWorks_href(works_href);
            String works_image = re.getWor().getWorks_image();
            wor.setWorks_image(works_image);
            wor.setWorks_person(userid);


            //Identification
             Identification ide1 =re.getIde();
             ide1.setIdentity_person(userid);
             ide1.setIdentity_status(0);


            System.out.println(job1);
            System.out.println(res);
            System.out.println(ide1);
            System.out.println(jobs);
            System.out.println(ski);
            System.out.println(wor);
            System.out.println(edu);

            //实现增加操作
            boolean b = ss.addJob(job1);
            boolean b1 = ss.addRes(res);
            boolean b2 = ss.addJobs(jobs);
            boolean b3 = ss.addEdu(edu);
            boolean b4 = ss.addSki(ski);
            boolean b5 = ss.addWor(wor);
            boolean b6 = ss.addIde(ide1);
            if(b){
                System.out.println("success");
            }
           return null;

        }



}




