/*ajax加载菜单*/
$.ajax ( {
		async : false,
		url : rootPath+'/modules/list',
		type : 'POST',
		cache : false, // 禁用缓存
		dataType :'json',
		success: function(data){
				$.each(data,function(index,item){					
					if(item.moduleFid==0){	
						$("<li id='li_"+item.id+"'></li>").appendTo($("#menu_ul"));						
						$("<a href='#' id='a_"+item.id+"'></a>").appendTo($("#li_"+item.id));
						$("<span id='span_"+item.id+"'></span>").addClass("icon color7").appendTo($("#a_"+item.id));						
					    $("<i></i>").addClass(item.icon).appendTo($("#span_"+item.id));
					    $("#a_"+item.id).append(item.moduleName);												
						$("<span></span>").addClass("caret").appendTo($("#a_"+item.id));
                        $("<ul id='ul_"+item.id+"'></ul>").appendTo($("#li_"+item.id));
					}else{
						var text="<li><a href='"+rootPath+item.moduleUrl+"' id='a_"+item.id+"'>"+item.moduleName+"</a></li>";
						$("#ul_"+item.moduleFid).append(text);
					}
				})
		}
});

/* 定位菜单当前项 */
$(document).ready(function () {
	var module_fid=$("#module_fid").val();
	var module_id=$("#module_id").val();
	//$("#a_"+module_fid).addClass('active');	
	$("#a_"+module_fid).next().slideToggle();
	$("#a_"+module_id).addClass('active');
});