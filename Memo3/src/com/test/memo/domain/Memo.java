package com.test.memo.domain;

public class Memo {
	//1●홍길동●메모입니다.●2025-01-02 12:05:402
	
	private String seq;
	private String name;
	private String memo;
	private String regdate;
	
	public Memo(String seq, String name, String memo, String regdate) {
		super();
		this.seq = seq;
		this.name = name;
		this.memo = memo;
		this.regdate = regdate;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memo [seq=");
		builder.append(seq);
		builder.append(", name=");
		builder.append(name);
		builder.append(", memo=");
		builder.append(memo);
		builder.append(", regdate=");
		builder.append(regdate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
