/*
 * Copyright 2017 The OpenDSP Project
 *
 * The OpenDSP Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package mobi.f2time.dorado.rest.http;

/**
 * 请求过滤器，比如做统一的访问权限校验以及获取授权信息
 * 
 * @author wangwp
 */
public interface Filter {

	default boolean preFilter(HttpRequest request, HttpResponse response) {
		return true;
	}

	default void postFilter(HttpRequest request, HttpResponse response) {
	}
}
