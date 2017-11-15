// 手机号码验证  
function mobille_validator(value,element,required){    
    var length = value.length;
    var text=/^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})|(170[0|5|9]{1}+\d{7})$/;
    if(required)
    	return (length == 11 && text.test(value));
    else
        return this.optional(element) || (length == 11 && text.test(value));  
}

// 座机验证
function phone_validator(value,element,required){
	 var text = /^(0?\d{2,3}-?)?[1-9]{1}\d{6,8}$/;  
	 if(required)
		 return tel.test(value);
	 else
		 return this.optional(element) || (text.test(value));	    
}