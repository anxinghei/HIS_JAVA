# HIS_JAVA
 
 
## AJAX������ 
 
1����ʽ�� 
 
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
 
2����ȡ������ 
 
	@ResponseBody
	@PutMapping("/member")
	public String addCategory(@RequestBody Member member)  {
		System.out.println("springboot���ܵ��������JSON��ʽ�ύ�����ݣ�" + member);
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
 
## tk.mybatis���� 

1�������� 
	<dependency>
    		<groupId>tk.mybatis</groupId>
    		<artifactId>mapper</artifactId>
    		<version>4.1.5</version>
	</dependency> 
 
## JQuery������  

1����ȡ id=authGroup_id ���ı�ֵ��  
 	var authGroup_id = $("#authGroup_id").text(); 

2����ȡ���鵥ѡ�������ѡ��ֵ��   
	var rules = [];
	$('input:radio:checked').each(function(){
    		rules.push($(this).val());
	}); 
 
3��ˢ�µ�ǰҳ�棺  
	location.reload(true);// Ĭ��Ϊ false���ӿͻ��˻�����ȡ��ǰҳ��true, ���� GET ��ʽ���ӷ����ȡ���µ�ҳ��, �൱�ڿͻ��˵�� F5("ˢ��") 
 
4��
