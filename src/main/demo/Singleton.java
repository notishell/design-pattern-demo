package demo;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * 单例模式
 * demo.Singleton pattern
 *
 * @author Notis Hell notishell@gmail.com 2024/03/29 18:48:44
 */
public class Singleton implements Serializable {
	/**
	 * 私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
 	 */
	private static volatile Singleton instance = null;

	/**
	 * 私有构造方法，防止被实例化
	 */
	private Singleton() {
	}

	/**
	 * 静态工程方法，创建实例
 	 */
	public static Singleton getInstance() {
		if (Objects.nonNull(instance)) {
			return instance;
		}
		synchronized(Singleton.class) {
			if (Objects.isNull(instance)) {
				instance = new Singleton();
			}
		}
		return instance;
	}

	/**
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
 	 */
	@Serial
	public Object readResolve() {
		return getInstance();
	}
}
