package chapter_17;

public abstract class Decorator extends Component {
	private Component component = null;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
