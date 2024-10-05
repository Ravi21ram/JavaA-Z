package com.assn.conol;


	class WhatsAppV1
	{
		final String ver1="version-1";
		public void sendmsg()
		{
			System.out.println("send message");
		}
	}
	class WhatsAppV2 extends WhatsAppV1
	{
		String ver2="version-2";
		public void sendvoicemsg()
		{
			System.out.println("send voice message");
		}
	}
	class WhatsAppV3 extends WhatsAppV2
	{
		String ver3="version-3";
		public void videocall()
		{
			System.out.println("video call");
		}
	}
	public class MultiLevelInheritance {

	public static void main(String[] args) {
		WhatsAppV1 v1=new WhatsAppV1();
		System.out.println("Whatsapp version-1");
		System.out.println(v1.ver1);
		v1.sendmsg();
		System.out.println("--------------------------------------------------");
		WhatsAppV2 v2=new WhatsAppV2();
		System.out.println("Whatsapp version-2");
		System.out.println(v2.ver1);
		System.out.println(v2.ver2);
		v2.sendmsg();
		v2.sendvoicemsg();
		System.out.println("--------------------------------------------------");
		WhatsAppV3 v3=new WhatsAppV3();
		System.out.println("Whatsapp version-3");
		System.out.println(v3.ver1);
		System.out.println(v3.ver2);
		System.out.println(v3.ver3);
		v3.sendmsg();
		v3.sendvoicemsg();
		v3.videocall();
		
		
				
	
	}

}
