package org.prisma.kip.util;

import org.junit.Assert;
import org.junit.Test;
import org.prisma.kip.domain.projectInstance.Iteration;

public class IterationTest {
	
	@Test
	public void test() {
		Iteration iteration = new Iteration();
		Assert.assertNotNull(iteration); 
	}

}
