package gitlet;
import java.io.File
/** Driver class for Gitlet, the tiny stupid version-control system.
 *  @author
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND> .... */
    public static void main(String... args) {
        if (args.length == 0) {
        	System.out.println("Empty command.");
        	//抛出异常
        }
        if (/* args[0] 是有效的command*/) {
        	if(/*.gitlet 文件已经存在*/) {
        		//处理命令
        	}
        	else {
        		if (args[0] == "init") {
        			//新建repository
        		}
        		else {
        			System.out.println("Repository is not initialized");
        			//抛出异常
        		}
        	}
        }
    }

}
