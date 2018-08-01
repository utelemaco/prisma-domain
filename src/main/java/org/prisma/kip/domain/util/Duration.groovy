package org.prisma.kip.domain.util

class Duration {
	
	public Duration() {
		super();
	}
	

    public Duration(Long durationInMilliseconds) {
		super();
		this.durationInMilliseconds = durationInMilliseconds;
	}

	Long durationInMilliseconds = 0

    Long inSeconds() {
        return durationInMilliseconds/1000
    }

    Long inMinutes() {
        return inSeconds()/60
    }

    Long inHours() {
        return inMinutes()/60
    }

    Long inDays() {
        return inHours()/24
    }

    Long inMonths() {
        return inDays()/30
    }
}
