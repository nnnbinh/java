package PhanSo;

public class PhanSo {
	int iTu;
	int iMau;
	
	public int getiTu() {
		return iTu;
	}
	public void setiTu(int iTu) {
		this.iTu = iTu;
	}
	public int getiMau() {
		return iMau;
	}
	public void setiMau(int iMau) {
		this.iMau = iMau;
	}
	
	public PhanSo(int Tu,int Mau) {
		iTu=Tu;
		iMau=Mau;
		Rutgon();
	}
	
	public PhanSo() {
		
	}
	
	private int UCLN() {
		int a=iTu;
		int b=iMau;
		
		if(a!=0) {
			if(a>=0) {
				while(a!=b) {
					if(a>b) a= a-b;
					else b=b-a;
				}
				return a;
			}
			else {
				a=-a;
				while(a!=b) {
					if(a>b) a= a-b;
					else b=b-a;
				}
				return a;
			}
		}else return 0;
	}
	
	public void Rutgon() {
		int a=UCLN();
		if(a!=0) {
			if(a>0) {
				iTu=iTu/a;
				iMau=iMau/a;
			}
			else {
				iTu=iTu/(-a);
				iMau=iMau/a;
			}
		}
		else {
			iTu=0;
			iMau=0;
		}
	}
	
	public PhanSo Cong (PhanSo b) {
		PhanSo psTong=new PhanSo();
		
		psTong.iTu=this.iTu*b.iMau+this.iMau*b.iTu;
		psTong.iMau=this.iMau*b.iMau;
		
		psTong.Rutgon();
		
		return psTong;
	}
	
	public PhanSo Tru (PhanSo b) {
		PhanSo psTong=new PhanSo();
		
		psTong.iTu=this.iTu*b.iMau-this.iMau*b.iTu;
		psTong.iMau=this.iMau*b.iMau;
		psTong.Rutgon();
		
		return psTong;
	}
	
	public PhanSo Nhan (PhanSo b) {
		PhanSo psTong=new PhanSo();
		
		psTong.iTu=this.iTu*b.iTu;
		psTong.iMau=this.iMau*b.iMau;
		psTong.Rutgon();		
		return psTong;
	}
	
	public PhanSo Chia (PhanSo b) {
		PhanSo psTong=new PhanSo();
		
		psTong.iTu=this.iTu*b.iMau;
		psTong.iMau=this.iMau*b.iTu;
		psTong.Rutgon();
		
		return psTong;
	}
	
}
