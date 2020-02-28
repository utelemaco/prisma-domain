package org.prisma.kip.util;

import org.junit.Assert;
import org.junit.Test;
import org.prisma.kip.domain.util.Duration;

public class DurationTest {
	
	@Test
	public void test() {
		Duration d = new Duration(10000L);
		Assert.assertNotNull(d);
		Assert.assertEquals((Long) 10L, (Long) d.inSeconds());
	}

}
