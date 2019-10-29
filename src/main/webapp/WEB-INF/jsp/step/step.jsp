<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>入驻平台</title>
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">    
    <link href="../step/layui/css/layui.css" rel="stylesheet"/>
    <link href="../step/step-lay/step.css" rel="stylesheet">
    <script src="layui/jquery-1.12.3.min.js"></script>
</head>
<body>
    <div class="layui-fluid">
        <div class="layui-card">
            <div class="layui-card-body" style="padding-top: 40px;">
                <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto;">
                    <div carousel-item>
                        <div>
                            <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px;" id="f1">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">工作时间:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="job_time"  class="layui-input" id="test9" placeholder="请选择可工作时间(工作日)" required="required" />
 
                                    </div>
                                    <div class="layui-input-block">
                                        <input type="text" name="job_untime" class="layui-input" id="test10" placeholder="请选择可工作时间(非工作日)" required="required" />
  
                                    </div>
                                </div>
                             
                                
                                
                                <div class="layui-form-item" id="area-picker">
                                    <label class="layui-form-label">工作地址:</label>
                                    <div class="layui-input-block">
                                        <select name="province" class="province-selector" data-value="广东省" lay-filter="province-1">
					                        <option value="">请选择省</option>
					                    </select>
                                    </div>
                                    <div class="layui-input-block">
                                        <select name="city" class="city-selector" data-value="深圳市" lay-filter="city-1">
					                        <option value="">请选择市</option>
					                    </select>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">工作方式:</label>
                                    <div class="layui-input-block">
                                        <select lay-verify="required" name="job_pattern">
                                            <option value="1" selected>远程</option>
                                            <option value="2">驻场</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">工作时长:</label>
                                    <div class="layui-input-block">
                                 	<input type="number" name="job_hours" placeholder="请填写每周可提供的工作时长(小时)" class="layui-input" lay-verify="number" required="required">
 
                                    </div>
                                </div>
                                
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">工作日薪:</label>
                                    <div class="layui-input-block">
                                 	<input type="number" name="job_daysal" placeholder="请填写工作日薪" class="layui-input" lay-verify="number" required="required">
 
                                    </div>
                                </div>
                                
                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button class="layui-btn" lay-submit lay-filter="formStep" id="btu1">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div>
                            <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px;" id="f2">
                                <div class="layui-form-item">
                                   <label class="layui-form-label">工作状态:</label>
											<div class="layui-input-block">
												<select lay-verify="required" name="resume_workstatus">
                                                   <option value="1" selected>全职</option>
                                                   <option value="2">兼职</option>
                                                </select>
                                            </div>
                                </div>            
                                <div class="layui-form-item">
                                    <label class="layui-form-label">职业方向:</label>
											<div class="layui-input-block">
												<select lay-verify="required" name="resume_workdirection">
                                                   <option value="1" selected>后端工程师</option>
                                                   <option value="2">前端工程师</option>
                                                   <option value="3">移动端工程师</option>
                                                   <option value="4">DBA工程师</option>
                                                   <option value="5">项目经理</option>
                                                   <option value="6">产品经理</option>
                                                   <option value="7">运维</option>
                                                   <option value="8">测试</option>
                                                   <option value="9">其他</option>
                                                </select>
                                            </div>
                                </div>
                                <div class="layui-form-item">
											<label class="layui-form-label">具体职业:</label>
											<div class="layui-input-block">
												<select lay-verify="required" name="resume_specificwork">
                                                   <option value="1" selected>java</option>
                                                   <option value="2">php</option>
                                                   <option value="3">c++</option>
                                                   <option value="4">python</option>
                                                   <option value="5">android</option>
                                                   <option value="6">ios</option>
                                                   <option value="7">前端</option>
                                                   <option value="8">UI设计</option>
                                                   <option value="9">其他</option>
                                                   </select>
											</div>
								</div>			
                                <div class="layui-form-item">
                                    <label class="layui-form-label">工作经历:</label>
                                    <div class="layui-input-block">
                                       <input type="text" name="jobtime" class="layui-input" id="test15" placeholder="请选择始末时间" required="required" />
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">公司名称:</label>
                                    <div class="layui-input-block">
                                    <input type="text" name="company" class="layui-input"  placeholder="请输入公司名称" required="required" />
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                     <label class="layui-form-label">职位:</label>
                                    <div class="layui-input-block">
                                    <input type="text" name="position"  class="layui-input"  placeholder="请输入职位" required="required" />
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">教育经历:</label>
                                    <div class="layui-input-block">
                                       <input type="text" name="education_date" class="layui-input" id="test16" placeholder="请选择始末时间" required="required" />
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">毕业院校:</label>
                                    <div class="layui-input-block">
                                    <input type="text" name="school_name"  class="layui-input"  placeholder="请输入公司名称" required="required" />
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                     <label class="layui-form-label">专业:</label>
                                    <div class="layui-input-block">
                                    <input type="text" name="profession" class="layui-input"  placeholder="请输入职位" required="required" />
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                     <label class="layui-form-label">学历:</label>
                                    <div class="layui-input-block">
                                    <input type="text" name="education_level" class="layui-input"  placeholder="请输入学历" required="required" />
                                    </div>
                                </div>
                                
                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                        <button class="layui-btn" lay-submit lay-filter="formStep2" id="btu2">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div>
                            <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px;" id="f3">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">技能名称:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="skill_name" class="layui-input"  placeholder="请输入技能名称" required="required" />
 
                                    </div>
                                    
                                </div>
                                
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">经验自评:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="skill_evaluate" class="layui-input"  placeholder="请评价(1~5分)" required="required" />
 
                                    </div>
                                    
                                </div>
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">作品名称:</label>
                                    <div class="layui-input-block">
                                        <input type="text"  name="works_name" class="layui-input"  placeholder="请输入作品名称" required="required" />
 
                                    </div>
                                    
                                </div>
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">作品所属行业:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="works_trade" class="layui-input"  placeholder="请输入所属行业" required="required" />
 
                                    </div>
                                    
                                </div>
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">作品关键词:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="works_keyword" class="layui-input"  placeholder="请输入作品关键词" required="required" />
 
                                    </div>
                                    
                                </div>
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">作品链接:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="works_href" class="layui-input"  placeholder="请输入作品链接" required="required" />
 
                                    </div>
                                    
                                </div>
                                 <div class="layui-form-item">
                                    <label class="layui-form-label">作品图片:</label>
                                    <div class="layui-input-block">
                                        <input type="file" dirname="works_image" class="layui-input" name="workstu"  required="required" />
 
                                    </div>
                                    
                                </div>
                                
                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                        <button class="layui-btn" lay-submit lay-filter="formStep3" id="btu3">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                         </form>
                      </div>
                      
                     <div>
                            <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px;" id="f4">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">姓名:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="name" class="layui-input"  placeholder="请输入姓名" required="required" />
 
                                    </div>
                                    
                                </div>  
                                <div class="layui-form-item">
                                    <label class="layui-form-label">身份证号:</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="idcard" class="layui-input"  placeholder="请输入姓名" required="required" />
 
                                    </div>
                                    
                                </div>  
                                <div class="layui-form-item">
                                    <label class="layui-form-label">上传图像:</label>
                                    <div class="layui-input-block">
                                        正面    <input type="file" dirname="idzheng" class="layui-input"  name="iden0" required="required" />
                                        反面<input type="file" dirname="idfan" class="layui-input" name="iden1" required />
                                    </div>
                                    
                                </div>  
                               
                                    <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                        <button class="layui-btn" lay-submit lay-filter="formStep4" id="btu4">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                         </form>
                      </div>
                      
                        <div>
                            <div style="text-align: center;margin-top: 90px;" >
                                <i class="layui-icon layui-circle"
                                   style="color: white;font-size:30px;font-weight:bold;background: #52C41A;padding: 20px;line-height: 80px;">&#xe605;</i>
                                <div style="font-size: 24px;color: #333;font-weight: 500;margin-top: 30px;">
                                  申请成功
                                </div>
                                <div style="font-size: 14px;color: #666;margin-top: 20px;">等待平台审核</div>
                            </div>

                        </div>
                    </div>
                </div>
                <hr>

            </div>
        </div>
    </div>
    <script src="../step/layui/layui.js"></script>
    <script src="../step/step-lay/step.js"></script>
    <script>
    
        layui.config({
            base:'../step/step-lay/'
        }).use([ 'form', 'step'], function () {
            var $ = layui.$
                , form = layui.form
                , step = layui.step;

            step.render({
                elem: '#stepForm',
                filter: 'stepForm',
                width: '100%', //设置容器宽度
                stepWidth: '750px',
                height: '700px',
                stepItems: [{
							title: '填写工作信息'
						}, {
							title: '完善个人履历'
						}, {
							title: '添加技能作品'
						}, {
							title: '完成实名认证'
						}, {
							title: '申请成功'
						}]
            });


            form.on('submit(formStep)', function (data) {
                step.next('#stepForm');
                return false;
            });

            form.on('submit(formStep2)', function (data) {
                step.next('#stepForm');
                return false;
            });
             form.on('submit(formStep3)', function (data) {
                step.next('#stepForm');
                return false;
            });
             form.on('submit(formStep4)', function (data) {
                step.next('#stepForm');
                return false;
            });

            $('.pre').click(function () {
                step.pre('#stepForm');
            });

            $('.next').click(function () {
                step.next('#stepForm');
            });
        })
        //时间段的选择
        layui.use('laydate', function() {
						var laydate = layui.laydate;

						//时分秒
						laydate.render({
							elem: '#test9',
							type: 'time',
							range: true,
                            trigger:'click'
						});
                        laydate.render({
                            elem: '#test10',
                            type: 'time',
                            range: true,
                            trigger:'click'
                        });
						//年月
						laydate.render({
					    elem: '#test15'
					    ,type: 'month'
					    ,range: '~'
					    ,format: 'yyyy-MM'
                            ,trigger:'click'
					  });
                        laydate.render({
                            elem: '#test16'
                            ,type: 'month'
                            ,range: '~'
                            ,format: 'yyyy-MM'
                            ,trigger:'click'
                        });
    
        });
        //省市区三级联动
         layui.use(['layer', 'form', 'layarea'], function () {
            var layer = layui.layer
                , form = layui.form
                , layarea = layui.layarea;

            layarea.render({
                elem: '#area-picker',
                change: function (res) {
                    //选择结果
                    console.log(res);
                }
            });
        });
        
    //获取数据
//  var arr{};
//  $("#next").click()function(){
//  	
//  function getFormData(formId){
//  var data = {};
//  var results = $(formId).serializeArray();
//  $.each(results,function(index,item){
//      //文本表单的值不为空才处理
//      if(item.value && $.trim(item.value)!=""){
//          if(!data[item.name]){
//              data[item.name]=item.value;
//          }else{
//              //name属性相同的表单，值以英文,拼接
//              data[item.name]=data[item.name]+','+item.value;
//          }
//      }
//  });
//  //console.log(data);
//  return data;
//

    	
  //      console.log($(#f1).serialize());
       //  console.log($(#f4).serialize());
        
        
         
   // }
    </script>
</body>
</html>
