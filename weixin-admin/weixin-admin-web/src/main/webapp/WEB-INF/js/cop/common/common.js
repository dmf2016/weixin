/***
 * 共公js方法
 */
var E9NET = {
	// 获取所选的数据信息
	getSelectionsIds : function()
	{
		var ids="";
		jQuery("input[name=checkItem]").each(function(){
			if($(this).prop("checked")==true)
			{
				var id=$(this).val();
				if(ids!="")
				{
					ids+=",";
				}
				ids+=id;
			};
		});
		return ids;
	}
};