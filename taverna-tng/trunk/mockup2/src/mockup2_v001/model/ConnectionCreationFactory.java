package mockup2_v001.model;

import org.eclipse.gef.requests.CreationFactory;

public class ConnectionCreationFactory implements CreationFactory {

	private int connectionType;
	
	public ConnectionCreationFactory(int connectionType) {
		this.connectionType = connectionType;
	}
	
	@Override
	public Object getNewObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getObjectType() {
		// TODO Auto-generated method stub
		return connectionType;
	}

}
