public class ProcessInfoDemo {
	public static void main(String[] args) throws Exception {
		ProcessHandle handle = ProcessHandle.current();
		ProcessHandle.Info info = handle.info();
		System.out.println("Complete Process Information:\n" + info);
		System.out.println("User : " + info.user().get());
		System.out.println("Command : " + info.command().get());
		System.out.println("Start Time : " + info.startInstant().get());
		System.out.println("Total CPU Time : " + info.totalCpuDuration().get());
	}
}
