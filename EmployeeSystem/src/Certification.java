
public interface Certification
{
	static enum Cert {
		PMI, SCJP, SCWCD, SCBCD
	};

	public Cert[] getCerts();

	public void addCert(Cert cert);
}
