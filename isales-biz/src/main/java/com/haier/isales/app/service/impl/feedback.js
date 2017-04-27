var infoPath = "/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot?INT_CODE=EAI_JOB_0468";

/*---------------------------BPM接口  Begin-----------------------------------*/
/**
*一，问题提报A0000007<br>
*
*@paramuserId
*提问人ID
*@paramtitle
*问题标题（您的问题）
*@paramquesType
*问题分类,描述
*@paramnotes
*问题补充
*@paramimageId
*照片uuid
*@paramfirst
*第一受理人
*@paramcustNo
*门店
*@paramplId
*产品线
*@paramchannelType
*渠道
*@paramtradeCode;
*中心,工贸<br>
*obj:userId,title,quesType,notes,imageId,first,tradeCode,
*channelType,plId,custNo,extend1
*/
function createProcess(obj) {
	// return obj;
	// 1. 创建流程 WorkflowService createProcessInstance
	// 2. 查询一级处理人
	// 3. 创建任务 WorkflowTaskService createProcessTaskInstance
	// 4. 更新BPM数据 BOService createBOData

	// 1. 获得一级处理人
	var participantId;// 任务的处理人

	// first :B 渠道经营体长, Z 产品经理
	if (obj.first == 'B') {
		var returnVal = VIEW_MDM_BTB(obj.custNo, obj.tradeCode);
		if (returnVal.flag) {
			participantId = returnVal.first;
		} else {
			return {
				flag : false,
				msg : "亲，未找到渠道经营体长!"
			};
		}
	} else {
		// 产品创新经理
		var returnVal = BO_OMS_EXE_SYNC(obj.tradeCode, "4", obj.linecode);
		if (returnVal.flag) {
			participantId = returnVal.first;
			if (participantId == '') {
				return {
					flag : false,
					msg : "亲，未找到产品经理!"
				};
			}
		} else {
			return {
				flag : false,
				msg : "亲，未找到产品经理!"
			};
		}
	}

	// 2。创建流程
	var processInstanceId = createProcessInstance(obj.userId, obj.title).processInstanceId;

	// 3. 创建任务 WorkflowTaskService createProcessTaskInstance
	createProcessTaskInstance(obj.userId, processInstanceId, participantId,
			obj.title);

	var date = new Date();
	var recordData = '{"CLDZ" :"问题提问","HTYPE":"任务协同",' + '"UPDATEUSER":"'
			+ obj.userId + '","TBSJ" :"' + date.pattern("yyyy-MM-dd HH:mm:ss")
			+ '","WTBT" :"' + obj.title + '","WTSM" :"' + obj.notes
			+ '","CPZ" :"' + obj.plId + '","GM"  :"' + obj.tradeCode
			+ '","MD" :"' + obj.custNo + '","XSQD" :"' + obj.channelType
			+ '" ,"ONE":"' + obj.quesType + '","TBRBH":"' + obj.userId
			+ '","TBR":"' + obj.tbr + '","JC":"-2","TWO":"APP" ,"EXTEND1":"'
			+ obj.imageId + '"}';
	// 
	// 4. 更新BPM数据 BOService createBOData
	var wtid = createBOData(recordData, processInstanceId, obj.userId,
			'BO_HDPT_PSI_E');
	if ('' != wtid.WTID) {
		return {
			flag : true
		};
	}
	return {
		flag : false,
		msg : "问题创建失败!"
	};
}

// <!-- 1.创建流程 WorkflowService -->
function createProcessInstance(userId, title) {

	var request = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wor="http://workflow.level0.services.sdk.actionsoft.com/">'
			+ '<soapenv:Header><aws-auth xmlns="http://services.sdk.actionsoft.com/">00984323309036a573e72726a2355da3</aws-auth></soapenv:Header>'
			+ '<soapenv:Body><wor:createProcessInstance1>'
			+ '<workflowDefUUID>00fc8643f24b236072b3db248380a2ea</workflowDefUUID>'
			+ '<userId>admin</userId>'
			+ '<title>'
			+ title
			+ '</title>'
			+ '</wor:createProcessInstance1></soapenv:Body></soapenv:Envelope>';

	var path = getPath(
			"/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot?INT_CODE=EAI_INT_1742",
			null);
	var input = {
		method : 'post',
		returnedContentType : 'xml',
		path : path,
		body : {
			content : request.toString(),
			contentType : 'text/xml; charset=utf-8'
		}
	};

	var result = WL.Server.invokeHttp(input);
	// 特别的一定要用这种方式去提取数据
	var jsobj = new Object();// 多次尝试用这种方法成功获取需要的值
	jsobj.processInstanceId = result.Envelope.Body.createProcessInstance1Response["return"];
	return jsobj;
}

/**
*OK<br>
*2.1.查询第一受理人<br>
*MDM数据视图<br>
*查询语句：whereCUSTOMER_NUMBER_SH='售达方编码'andTRADE_CODE='中心'andrownum=1
*CUSTOMER_NUMBER_SH='8800008259'andTRADE_code='12A02'
*
*@paramcustNo
*@paramtradeCode
*/
function VIEW_MDM_BTB(custNo, tradeCode) {
	var request = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:quer="http://www.example.org/QueryCommanInterface/">'
			+ '<soapenv:Header/><soapenv:Body><quer:QueryCommanInterface><in>'
			+ '<Department>BPM</Department><TableName>aws5_user.VIEW_MDM_BTB</TableName>'
			+ '<condition_sql>where rownum=1 '
			+ ' and CUSTOMER_NUMBER_SH = \''
			+ custNo
			+ '\' and TRADE_CODE=\''
			+ tradeCode
			+ '\''
			+ '</condition_sql>'
			+ '<dataSource>jdbc/AWS_AWS_eaiuser_DB</dataSource>'
			+ '<currentPage>1</currentPage>'
			+ '</in></quer:QueryCommanInterface></soapenv:Body></soapenv:Envelope>';

	var path = getPath(
			"/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot?INT_CODE=EAI_INT_1508",
			null);

	var input = {
		method : 'post',
		returnedContentType : 'xml',
		path : path,
		body : {
			content : request.toString(),
			contentType : 'text/xml; charset=utf-8'
		}
	};

	var result = WL.Server.invokeHttp(input);
	var response = result.Envelope.Body.QueryCommanInterfaceResponse.out;
	if (response.indexOf("SMB_MANAGER") == -1) {
		return {
			"flag" : false
		}
	}
	var val = xmlToJson.parser(response);

	// 小心此处会不会有多条
	return {
		"flag" : true,
		"first" : val.output.rowset.row.smb_manager
	};
}

/**
*OK没有数据<br>
*2.2.查询第一受理人<br>
*OMS存储表<br>
*OMS存储表查询语句:whereTRADE_CODE='中心编码'andCODE12!='-'andrownum=1code12小微总
*code5产品创新经理
*/
function BO_OMS_EXE_SYNC(tradeCode, num, line_code) {

	if (line_code != '') {
		line_code = ' and LINECODE=\'' + line_code + '\'';
	}

	var request = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:quer="http://www.example.org/QueryCommanInterface/">'
			+ '<soapenv:Header/><soapenv:Body><quer:QueryCommanInterface><in>'
			+ '<Department>BPM</Department><TableName>aws5_user.BO_OMS_EXE_SYNC</TableName>'
			+ '<condition_sql>where rownum=1'
			+ ' and CODE'
			+ num
			+ '!=\'-\' and TRADECODE=\''
			+ tradeCode
			+ '\' '
			+ line_code
			+ '</condition_sql>'
			+ '<dataSource>jdbc/AWS_AWS_eaiuser_DB</dataSource>'
			+ '<currentPage>1</currentPage>'
			+ '</in></quer:QueryCommanInterface></soapenv:Body></soapenv:Envelope>';
	// return {"res":request};
	var path = getPath(
			"/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot?INT_CODE=EAI_INT_1508",
			null);
	var input = {
		method : 'post',
		returnedContentType : 'xml',
		path : path,
		body : {
			content : request.toString(),
			contentType : 'text/xml; charset=utf-8'
		}
	};

	var result = WL.Server.invokeHttp(input);

	// return result;
	var response = result.Envelope.Body.QueryCommanInterfaceResponse.out;// .out.ROWSET;
	// 小心此处会不会有多条

	if (response.indexOf("CODE" + num) == -1) {
		return {
			"flag" : false
		}
	}
	// 小心此处会不会有多条
	return {
		"flag" : true,
		"first" : xmlToJson.parser(response).output.rowset.row["code" + num]
	};
}

// <!-- 3.创建任务 WorkflowTaskService -->
/**
*@paramuserId
*提问人ID
*@paramtitle
*问题标题（您的问题）
*@paramprocessInstanceId,实例ID
*3283175
*@paramparticipantId,下一处理人ID
*
*/
function createProcessTaskInstance(userId, processInstanceId, participantId,
		title) {

	var request = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wor="http://workflowtask.level0.services.sdk.actionsoft.com/">'
			+ '<soapenv:Header><aws-auth xmlns="http://services.sdk.actionsoft.com/">009843233092dc795992c4786551f1bd</aws-auth></soapenv:Header>'
			+ '<soapenv:Body><wor:createProcessTaskInstance1>'
			+ '<ownerId>admin</ownerId>'
			+ '<processInstanceId>'
			+ processInstanceId
			+ '</processInstanceId>'
			+ '<synType></synType>'
			+ '<priorityType></priorityType>'
			+ '<activityNo>1</activityNo>'
			+ '<participantId>'
			+ participantId
			+ '</participantId>'
			+ '<title>'
			+ title
			+ '</title>'
			+ '<isShortMessage></isShortMessage>'
			+ '<localDepartmentId></localDepartmentId>'
			+ '</wor:createProcessTaskInstance1></soapenv:Body></soapenv:Envelope>';

	var path = getPath(
			"/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot?INT_CODE=EAI_INT_1743",
			null);

	var input = {
		method : 'post',
		returnedContentType : 'xml',
		path : path,
		body : {
			content : request.toString(),
			contentType : 'text/xml; charset=utf-8'
		}
	};

	var result = WL.Server.invokeHttp(input);
	var response = result.Envelope.Body.createProcessTaskInstance1Response['return'];
	return {
		"processTaskInstanceId" : response
	};
}

// 4. 更新BPM数据 BOService createBOData
function createBOData(recordData, processInstanceId, userId, boTableName) {

	var request = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:bo="http://bo.level0.services.sdk.actionsoft.com/">'
			+ '<soapenv:Header><aws-auth xmlns="http://services.sdk.actionsoft.com/">00fc8643f2597e57113e741278491895</aws-auth></soapenv:Header>'
			+ '<soapenv:Body><bo:createBOData><boTableName>'
			+ boTableName
			+ '</boTableName>'
			+ '<recordData>'
			+ recordData
			+ '</recordData>'
			+ '<processInstanceId>'
			+ processInstanceId
			+ '</processInstanceId>'
			+ '<createUser>admin</createUser>'
			+ '</bo:createBOData>' + '</soapenv:Body>' + '</soapenv:Envelope>';

	var path = getPath(
			"/EAI/RoutingProxyService/EAI_SOAP_ServiceRoot?INT_CODE=EAI_INT_1744",
			null);

	var input = {
		method : 'post',
		returnedContentType : 'xml',
		path : path,
		body : {
			content : request.toString(),
			contentType : 'text/xml; charset=utf-8'
		}
	};

	var result = WL.Server.invokeHttp(input);
	var response = result.Envelope.Body.createBODataResponse['return'];
	return {
		"WTID" : response
	// ,
	// "TTTT" : JSON.parse(recordData)
	};
}


