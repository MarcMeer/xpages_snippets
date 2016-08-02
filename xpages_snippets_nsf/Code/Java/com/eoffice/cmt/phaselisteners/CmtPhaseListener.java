package com.eoffice.cmt.phaselisteners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletResponse;

public class CmtPhaseListener implements PhaseListener {

	   private static final long serialVersionUID = 1L;

	    public void afterPhase(PhaseEvent event) {
	    }

	    public void beforePhase(PhaseEvent event) {
	        HttpServletResponse response = (HttpServletResponse) event
	                .getFacesContext().getExternalContext().getResponse();
	        response.setHeader("X-UA-Compatible", "IE=edge");

	        
	    }

	    public PhaseId getPhaseId() {
	        return PhaseId.RENDER_RESPONSE;
	    }

}
