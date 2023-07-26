public class com.orange.hce.proto.activity.LogActivity$e extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/hce/proto/activity/LogActivity;->s()Landroid/content/BroadcastReceiver; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.LogActivity a; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.LogActivity$e ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final java.lang.String a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, android.content.Context p2 ) {
/* .locals 1 */
/* .line 1 */
try { // :try_start_0
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
	 /* invoke-direct {v0, p3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
	 (( com.orange.business.packid.android.lib.PackId ) v0 ).getUserByContactlessId ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
	 (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getWallet ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p1 ).findBadgeByZone ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 final String p1 = "Unknown"; // const-string p1, "Unknown"
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
	 /* .locals 6 */
	 final String v0 = "contactlessId"; // const-string v0, "contactlessId"
	 /* .line 1 */
	 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 final String v1 = "zoneId"; // const-string v1, "zoneId"
	 /* .line 2 */
	 (( android.content.Intent ) p2 ).getStringExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 fr.mbs.binary.Octets .createOctets ( v1 );
	 final String v2 = "readerAddress"; // const-string v2, "readerAddress"
	 /* .line 3 */
	 (( android.content.Intent ) p2 ).getStringExtra ( v2 ); // invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 int v3 = 0; // const/4 v3, 0x0
	 final String v4 = "rssi"; // const-string v4, "rssi"
	 /* .line 4 */
	 p2 = 	 (( android.content.Intent ) p2 ).getIntExtra ( v4, v3 ); // invoke-virtual {p2, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
	 /* .line 5 */
	 v4 = this.a;
	 com.orange.hce.proto.activity.LogActivity .b ( v4 );
	 v4 = 	 (( java.lang.Boolean ) v4 ).booleanValue ( ); // invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 /* .line 6 */
		 v4 = this.a;
		 com.orange.hce.proto.activity.LogActivity .a ( v4 );
		 /* int-to-byte v5, p2 */
		 (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) v4 ).addValue ( v0, v1, v2, v5 ); // invoke-virtual {v4, v0, v1, v2, v5}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->addValue(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;B)V
		 /* .line 7 */
	 } // :cond_0
	 v4 = this.a;
	 com.orange.hce.proto.activity.LogActivity .a ( v4,v0,v1 );
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* .line 8 */
		 v5 = this.a;
		 com.orange.hce.proto.activity.LogActivity .a ( v5 );
		 (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) v5 ).rssiResults ( v0, v1, v2 ); // invoke-virtual {v5, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->rssiResults(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
		 (( e.h.b.a.l.e1 ) v4 ).a ( v2, p2, v5 ); // invoke-virtual {v4, v2, p2, v5}, Le/h/b/a/l/e1;->a(Ljava/lang/String;ILjava/lang/String;)V
		 /* .line 9 */
	 } // :cond_1
	 p2 = this.a;
	 com.orange.hce.proto.activity.LogActivity .b ( p2 );
	 p2 = 	 (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 p2 = this.a;
		 com.orange.hce.proto.activity.LogActivity .a ( p2 );
		 p2 = 		 (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p2 ).isCalibrationCompleted ( v0, v1, v2 ); // invoke-virtual {p2, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->isCalibrationCompleted(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z
		 if ( p2 != null) { // if-eqz p2, :cond_2
			 /* .line 10 */
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v5 = "RSSI calibration "; // const-string v5, "RSSI calibration "
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( com.orange.hce.proto.activity.LogActivity$e ) p0 ).a ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Lcom/orange/hce/proto/activity/LogActivity$e;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Landroid/content/Context;)Ljava/lang/String;
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v5 = "("; // const-string v5, "("
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v5 = ") with "; // const-string v5, ") with "
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v5 = this.a;
			 com.orange.hce.proto.activity.LogActivity .a ( v5 );
			 v5 = 			 (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) v5 ).count ( v0, v1, v2 ); // invoke-virtual {v5, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->count(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)I
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 final String v5 = " values :"; // const-string v5, " values :"
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.orange.oab.contactless.packid.service.LogManager .log ( p1,p2,v4,v3 );
			 /* .line 11 */
			 v4 = this.a;
			 com.orange.hce.proto.activity.LogActivity .a ( v4 );
			 (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) v4 ).rssiResults ( v0, v1, v2 ); // invoke-virtual {v4, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->rssiResults(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
			 com.orange.oab.contactless.packid.service.LogManager .log ( p1,p2,v4,v3 );
			 /* .line 12 */
			 p1 = this.a;
			 com.orange.hce.proto.activity.LogActivity .a ( p1 );
			 (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p1 ).reset ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->reset(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
		 } // :cond_2
		 return;
	 } // .end method
