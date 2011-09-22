import java.io.PrintWriter;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.core.compiler.batch.BatchCompiler;


public class TestEcj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("pdw: "+System.getProperty("user.dir"));
		CompilationProgress progress = null; // instantiate your subclass
		BatchCompiler.compile(
		   "-classpath rt.jar bin/A.java",
		   new PrintWriter(System.out),
		   new PrintWriter(System.err),
		   progress);
	}

}
