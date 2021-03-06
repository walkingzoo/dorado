/*
 * Copyright 2014-2018 f2time.com All right reserved.
 */
package mobi.f2time.dorado.example;

import mobi.f2time.dorado.rest.server.DoradoServerBuilder;
import mobi.f2time.dorado.swagger.EnableSwagger;

/**
 * @author wangweiping
 *
 */
@EnableSwagger
public class Application {
	public static void main(String[] args) throws Exception {
		DoradoServerBuilder.forPort(18889).build().start();
	}
}
