public class THE_FIRST_JAVA_CODE {

	public static void main(String args[]) {
		System.out.println("Hello Java Im here !");
	}
}


/* 

HOW DOES JAVA WORK?

1-------------------------- COMPILATION 

		(JDK) = DEV TOOLS + (JRE) + LIBRARIES + (JVM)
		(JRE) = LIBRARIES + (JVM)
		(JDK)----->(JRE)----->(JVM)
		
		we write source code (in .java extension) then it goes to JDK which has compiler
		compiler then converts source code into the byte code (in . class extension)
		byte code is then it goes to (JVM) which converts byte code into native code 
		which can be understood by (OS / Machine )  (Windows / Mac / Linux)
		
		JAVA IS PORTABLE AND PLATFORM INDEPENDENT LANGUAGE SINCE BYTE CODE CAN BE GIVEN 
		INTO ANY PLATFORM TO RUN ANY APP DATA OR WEBSITE
		
2-------------------------- EXECUTION

1. Class Loader: The Java Virtual Machine (JVM) loads the .class file into memory.
2. Verification: JVM verifies the bytecode for correctness and security.
3. Interpreter/Just-In-Time (JIT) Compiler: JVM interprets or compiles the bytecode into machine-specific code.
    - Interpreter: Executes bytecode instruction-by-instruction (slow).
    - JIT Compiler: Compiles bytecode into machine code for frequent execution (fast).
4. Execution: JVM executes the machine code, interacting with the operating system and hardware.

*/