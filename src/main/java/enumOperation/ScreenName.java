package enumOperation;

	public enum ScreenName {
	    CARGO("Cargo"),
	    SHIFT_PLAN("Shift Plan"),
	    OTHER_SCREEN("Other Screen"), 
		SCREEN("https://vaadin.dev.dawinci.cloud");

	    private final String screenName;

	    ScreenName(String screenValue) {
	        this.screenName = screenValue;
	    }

	    public String getScreenName() {
	        return screenName;
	    }
	}

