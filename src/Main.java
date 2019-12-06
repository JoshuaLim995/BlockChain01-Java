import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	
	static int count = 1;

	public static void main(String[] args) {
		System.out.println("=====Test BlockChain=====");
		ArrayList<Object> chain = new ArrayList<Object>();


		chain.add(newDavidBlock("first", "dd"));
		String hash = ((DavidBlock)chain.get(chain.size()-1)).getHash();
		
		chain.add(newDavidBlock(hash, "55"));
		hash = ((DavidBlock)chain.get(chain.size()-1)).getHash();
		
		chain.add(newDavidBlock(hash, "uu"));
		hash = ((DavidBlock)chain.get(chain.size()-1)).getHash();
		
		chain.add(newDavidBlock(hash, "iuyyititytuytuu"));
		
	}
	
	public static DavidBlock newDavidBlock(String hash, String assertion) {
		
		Timestamp timestamp = geTimestamp();
		
		DavidBlock davidBlock = new DavidBlock(hash, timestamp, assertion);
		
		System.out.println("DavidBlock " + count);
		System.out.println("previousHash " + hash);
		System.out.println("timestamp " + timestamp);
		System.out.println("assertion " + assertion);
		System.out.println("hash " + davidBlock.getHash());
		System.out.println();
		
		count++;
		return davidBlock;
	}

	public static Timestamp geTimestamp() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());

		return ts;
	}
	

}
