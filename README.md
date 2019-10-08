# HIS_JAVA
 
 
## AJAX初体验 
 
1、格式： 
 
	$.ajax({
               type:"get",
               url: page,
               data:{idd:idd},
		//data:jsonData,
		//dataType:"json",
               contentType : "application/json;charset=UTF-8",
               success: function(result){
            	   $("#messageDiv").html("111111111111111");
               },
               error:function(result){
            	   console.log("222222222222222");
               },
               fail:function(result){
            	   $("#messageDiv").html("333333333333333");
               }
            }); 
 
2、获取参数： 
 
	@ResponseBody
	@PutMapping("/member")
	public String addCategory(@RequestBody Member member)  {
		System.out.println("springboot接受到浏览器以JSON格式提交的数据：" + member);
		return "success";
	}
	@ResponseBody
	@GetMapping("/member2/{idd}")
	public String Category(@PathVariable("idd") int id) throws Exception {
		System.out.println("111111111111111");
		return "success";
	}
	
	@ResponseBody
	@GetMapping("/member3")
	public String Category3(@RequestParam("idd") int id) throws Exception {
		System.out.println("111111111111111");
		return "success";
	} 
 
## tk.mybatis尝试 

1、依赖： 
	<dependency>
    		<groupId>tk.mybatis</groupId>
    		<artifactId>mapper</artifactId>
    		<version>4.1.5</version>
	</dependency> 
 
## JQuery初体验  

1、获取 id=authGroup_id 的文本值：  
 	var authGroup_id = $("#authGroup_id").text(); 

2、获取多组单选框的所有选中值：   
	var rules = [];  
	$('input:radio:checked').each(function(){  
    		rules.push($(this).val());  
	});   
 
3、刷新当前页面：  
	location.reload(true);  
	// 默认为 false，从客户端缓存里取当前页。true, 则以 GET 方式，从服务端取最新的页面, 相当于客户端点击 F5("刷新") 
 
4、  
  
## Thymeleaf 补充  
  
1、<link/>  
	<link type="text/css" href="css/bootstrap.min.css"  rel="stylesheet" th:href="@{/css/bootstrap.min.css}"/>  
  
## bootStrap初体验  
  
1、引用文件  
	<script type="text/javascript" src="../../js/jquery.min.js" th:src="@{/js/jquery.min.js}"></script>  
	link type="text/css" href="css/bootstrap.min.css"  rel="stylesheet" th:href="@{/css/bootstrap.min.css}"/>  
	<script type="text/javascript" src="../../js/bootstrap.min.js" th:src="@{/js/bootstrap.min.js}"></script>
