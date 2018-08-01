package org.prisma.kip.util

import org.junit.Test
import org.prisma.kip.domain.util.Duration

class DurationTest {
	
	@Test
	public void test() {
		Duration d = new Duration(10000);
		assert d
		assert d.inSeconds() == 10 
	}

}
