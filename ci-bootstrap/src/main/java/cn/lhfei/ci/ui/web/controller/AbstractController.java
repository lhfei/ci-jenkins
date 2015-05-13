/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.lhfei.ci.ui.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * @version 1.0.0
 *
 * @author Hefei Li
 *
 * @since May 13, 2015
 */
public abstract class AbstractController {
	protected Marker marker = MarkerFactory.getMarker("_CONTROLLER");
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * Operated <tt>SUCCESS</tt> result code: -- [-0]
	 */
	protected static final String SUCCESS = "0";
	
	/**
	 * Operated <tt>Failure</tt> result code: -- [-1]
	 */
	protected static final String FAILUE = "-1";
}
