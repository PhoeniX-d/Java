public class ProcessHandleDemo{
	public static void main(String[] args) throws Exception{
		ProcessHandle handle = ProcessHandle.current();
		long pid = handle.pid();
		System.out.println("The PID of current JVM instance is : " + pid);
		Thread.sleep(100000);
	}
}
