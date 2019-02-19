package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            // num personas, edad ppal, ni�os, n� dias
            Perfil perfil = new Perfil(2, 34, false, 5);
            kSession.insert(perfil);
            
            Norma dispHor = new Norma("horario",true);
            Norma pelig = new Norma("peligro",false);
            kSession.insert(dispHor);
            kSession.insert(pelig);
            
            Actividad para= new Actividad("Parapente","AEREA",Actividad.MEDIA);
            Actividad loro= new Actividad("LoroParque","Cultural",Actividad.ALTA);
            kSession.insert(para);
            // s�lo una actividad cada vez 
            //kSession.insert(loro);

            kSession.startProcess("com.sample.bpmn.hello");
            kSession.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
