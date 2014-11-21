package com.thecolony.tractus.networking;



import com.jme3.network.Client;
import com.jme3.network.Message;
import com.jme3.network.MessageListener;


public class ClientListener implements MessageListener<Client> {

    public void messageReceived(Client source, Message message) {
        
        if (message instanceof GreetingMessage) {
            GreetingMessage helloMessage = (GreetingMessage) message;
            System.out.println("Client #" + source.getId()
                    + " received the message: '"
                    + helloMessage.getGreeting() + "'");
            
            if(helloMessage.getMap()!=null){
                for(int i = 0; i<helloMessage.getMap().length; i++){   
                }
            }
        }  
        
        /*
        else if (message instanceof PlanetMessage) {
            final PlanetMessage planetMessage = (PlanetMessage) message;
            app.enqueue(new Callable() {
                public Void call() {
                    int 
                    change something in the scene graph from here 
                    
                    app.getRootNode().getChild(0).setPosition();
                    return null;
                }
            });
        } 
        */
        
       
        
        
    }

}


