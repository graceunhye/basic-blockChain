package eunhyeChain;

import java.util.Date;

public class Block {
	
	public String hash;
	public String previousHash;
	public String data;
	public long timestamp;
	
	//Block Constructor.
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timestamp = new Date().getTime();
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
			String calculatedhash = StringUtil.applySha256(
					previousHash + 
					Long.toString(timestamp) +
					data
					);
			return calculatedhash;
	}
}
