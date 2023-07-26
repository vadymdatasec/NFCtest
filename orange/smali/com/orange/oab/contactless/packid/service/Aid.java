public class com.orange.oab.contactless.packid.service.Aid {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String AID_PREFIX_PACK_ID;
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0, java.util.List p1, java.lang.Class p2 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/content/Context;", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;", */
		 /* "Ljava/lang/Class<", */
		 /* "*>;)Z" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 android.nfc.NfcAdapter .getDefaultAdapter ( p0 );
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
} // :cond_0
/* new-instance v2, Landroid/content/ComponentName; */
/* invoke-direct {v2, p0, p2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 3 */
try { // :try_start_0
	 android.nfc.cardemulation.CardEmulation .getInstance ( v0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
	 final String p2 = "other"; // const-string p2, "other"
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 4 */
			 v0 = 		 try { // :try_start_1
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 5 */
			 } // :cond_1
			 p0 = 			 (( android.nfc.cardemulation.CardEmulation ) p0 ).registerAidsForService ( v2, p2, p1 ); // invoke-virtual {p0, v2, p2, p1}, Landroid/nfc/cardemulation/CardEmulation;->registerAidsForService(Landroid/content/ComponentName;Ljava/lang/String;Ljava/util/List;)Z
			 /* .line 6 */
		 } // :cond_2
	 } // :goto_0
	 p0 = 	 (( android.nfc.cardemulation.CardEmulation ) p0 ).removeAidsForService ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Landroid/nfc/cardemulation/CardEmulation;->removeAidsForService(Landroid/content/ComponentName;Ljava/lang/String;)Z
	 /* :try_end_1 */
	 /* .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* :catch_0 */
} // .end method
public static void register ( android.content.Context p0 ) {
	 /* .locals 5 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 /* .line 2 */
	 e.h.d.a.a.s.m .c ( p0 );
	 (( e.h.d.a.a.s.g0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "A00000050000000000000000"; // const-string v4, "A00000050000000000000000"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getContactlessId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v4 ).toHexa ( ); // invoke-virtual {v4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 4 */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v2 ).getBadges ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v2 = e.h.d.a.a.i .a ( p0,v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 5 */
	 /* .line 6 */
} // :cond_1
/* const-class v1, Lcom/orange/oab/contactless/packid/service/PackIdApduService; */
p0 = com.orange.oab.contactless.packid.service.Aid .a ( p0,v0,v1 );
/* if-nez p0, :cond_2 */
final String p0 = "packid.aid"; // const-string p0, "packid.aid"
final String v0 = "Could not register hce aids"; // const-string v0, "Could not register hce aids"
/* .line 7 */
android.util.Log .e ( p0,v0 );
} // :cond_2
return;
} // .end method
