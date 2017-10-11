package com.beyond_h.ota.week04;

public class Week04Application {
		public static void main(String[] args) {
			CreateInstanceWithEnum();
			CreateInstanceWithDoubleCheckLocking();
		}

	/**
	 * 通过枚举创建一个单例类
	 */
	private static void CreateInstanceWithEnum()
	{
		EnumInstanceCreater.INSTANCE.getInstance().PrintStudent();
	}

	/**
	 * 通过Double check locking 创建一个单例对象
	 */
	private static void CreateInstanceWithDoubleCheckLocking()
	{
		DoubleCheckLockingInstanceCreater.getInstance().PrintStudent();
	}


}
