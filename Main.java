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
        	//�׳��쳣
        }
        if (/* args[0] ����Ч��command*/) {
        	if(/*.gitlet �ļ��Ѿ�����*/) {
        		//��������
        	}
        	else {
        		if (args[0] == "init") {
        			//�½�repository
        		}
        		else {
        			System.out.println("Repository is not initialized");
        			//�׳��쳣
        		}
        	}
        }
    }

}
