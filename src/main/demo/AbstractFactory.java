package demo;

/**
 * 抽象工厂模式
 * Abstract factory pattern
 *
 * @author Notis Hell notishell@gmail.com 2024/03/31 10:52:03
 */
public class AbstractFactory {

	interface GUIFactory {
		Button createButton();
		Checkbox createCheckbox();
	}

	class WinFactory implements GUIFactory {
		@Override
		public Button createButton() {
			return new WinButton();
		}

		@Override
		public Checkbox createCheckbox() {
			return new WinCheckbox();
		}
	}

	class MacFactory implements GUIFactory {
		@Override
		public Button createButton() {
			return new MacButton();
		}

		@Override
		public Checkbox createCheckbox() {
			return new MacCheckbox();
		}
	}

	interface Button {
		void paint();
	}

	interface Checkbox {
		void paint();
	}

	class WinButton implements Button {
		@Override
		public void paint() {
			System.out.println("Windows Button");
		}
	}

	class WinCheckbox implements Checkbox {
		@Override
		public void paint() {
			System.out.println("Windows Checkbox");
		}
	}

	class MacButton implements Button {
		@Override
		public void paint() {
			System.out.println("Mac Button");
		}
	}

	class MacCheckbox implements Checkbox {
		@Override
		public void paint() {
			System.out.println("Mac Checkbox");
		}
	}

	/**
	 * 客户端代码
	 */
	class Application {
		private Button button;
		private Checkbox checkbox;

		public Application(GUIFactory factory) {
			button = factory.createButton();
			checkbox = factory.createCheckbox();
		}

		public void paint() {
			button.paint();
			checkbox.paint();
		}
	}

	public void demo() {
		Application application1 = new Application(new MacFactory());
		application1.paint();

		Application application2 = new Application(new WinFactory());
		application2.paint();
	}
}