package com.haier.openplatform.showcase.security.service.impl;

import javax.annotation.Resource;

import org.junit.Ignore;

import com.haier.openplatform.showcase.BaseTestCase;
import com.haier.openplatform.showcase.security.service.FileServiceClientAdapter;
import com.haier.openplatform.showcase.security.service.FileUploadService;
import com.haier.openplatform.showcase.security.service.OperationLogService;

/**
 * security模块测试基类
 * @author WangXuzheng
 * 
 */
@Ignore
public class BaseSecurityTestCase extends BaseTestCase {
	@Resource
	protected FileServiceClientAdapter fileServiceClientAdapter;
	@Resource
	protected FileUploadService fileUploadService;
	@Resource
	protected OperationLogService operationLogService;
}
