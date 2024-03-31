package demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.*;

/**
 * 单例模式测试
 * Test for singleton pattern
 *
 * @author Notis Hell notishell@gmail.com 2024/03/29 18:54:02
 */
public class SingletonTests {

	@Test
	public void should_getInstance_return_notNull() {
		Singleton singleton = Singleton.getInstance();

		Assert.notNull(singleton, "return null");
	}

	@Test
	public void should_getInstance_return_same() {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		Assert.isTrue(singleton1 == singleton2, "not same instance");
	}

	@Test
	public void should_getInstance_after_deserial_return_same() throws IOException, ClassNotFoundException {
		Singleton singleton1 = Singleton.getInstance();

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(singleton1);

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

		Singleton singleton2 = (Singleton)objectInputStream.readObject();

		Assert.isTrue(singleton1 == singleton2, "not same instance");
	}

}
