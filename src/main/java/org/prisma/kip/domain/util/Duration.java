package org.prisma.kip.domain.util;

public class Duration {
	
	public Duration() {
		super();
	}
	
    public Duration(Long durationInMilliseconds) {
		super();
		this.durationInMilliseconds = durationInMilliseconds;
	}

	private Long durationInMilliseconds = 0L;
	
    public Long getDurationInMilliseconds() {
		return durationInMilliseconds;
	}

	public void setDurationInMilliseconds(Long durationInMilliseconds) {
		this.durationInMilliseconds = durationInMilliseconds;
	}

	public Long inSeconds() {
        return durationInMilliseconds/1000;
    }

    public Long inMinutes() {
        return inSeconds()/60;
    }

    public Long inHours() {
        return inMinutes()/60;
    }

    public Long inDays() {
        return inHours()/24;
    }

    public Long inMonths() {
        return inDays()/30;
    }
    
}
