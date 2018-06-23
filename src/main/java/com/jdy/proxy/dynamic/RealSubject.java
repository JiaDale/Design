package com.jdy.proxy.dynamic;

/**
 * 接口的实现类
 * @author Dale
 *
 */
public class RealSubject implements Subject {

	public void request() {
		System.out.println(RealSubject.class.getSimpleName());
	}
}
