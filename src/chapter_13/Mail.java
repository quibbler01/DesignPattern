package chapter_13;

public class Mail implements Cloneable {
	@Override
	protected Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mail;
	}

	private String receiver;
	private String subject;
	private String appellation;
	private String context;
	private String tail;

	public Mail() {
		System.out.println("Constructor Mail");
	}

	public Mail(AdvTemplate advTemplate) {
		this.context = advTemplate.getAdvContent();
		this.subject = advTemplate.getAdvSubject();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

}
