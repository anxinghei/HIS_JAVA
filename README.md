# HIS_JAVA
 
 
## AJAX������ 
 
1����ʽ�� 
 
$("#sender").click(function(){
        var uesr_name=document.getElementById('uesr_name').value;
        var password=document.getElementById('password').value;
        var category={"uesr_name":uesr_name,"password":password};
        var jsonData = JSON.stringify(category);
        var idd=document.getElementById('idd').value;
        var page="member3";
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