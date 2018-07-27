package com.coderdream;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CoverageServiceTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		int b = CoverageService.add(5, 20);
		Assert.assertEquals(b, 50);
	}

}
