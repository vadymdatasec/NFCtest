public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Boolean a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean p1, p0, Le/h/d/a/a/s/k0/b;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.content.ContentValues a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
		 /* .locals 3 */
		 /* .line 41 */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 42 */
		 v1 = 		 (( e.h.d.a.a.s.k0.b ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/b;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 43 */
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactlessTypePersonalisedVersion ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypePersonalisedVersion()Ljava/lang/Integer;
			 final String v2 = "contactlessTypePersonalisedVersion"; // const-string v2, "contactlessTypePersonalisedVersion"
			 /* .line 44 */
			 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
			 /* .line 45 */
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactlessTypePersonalisedUp ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypePersonalisedUp()Lcom/orange/oab/contactless/packid/ContactlessType;
			 (( java.lang.Enum ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;
			 final String v2 = "contactlessTypePersonalisedUp"; // const-string v2, "contactlessTypePersonalisedUp"
			 /* .line 46 */
			 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 47 */
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactlessTypePersonalisedDown ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactlessTypePersonalisedDown()Lcom/orange/oab/contactless/packid/ContactlessType;
			 (( java.lang.Enum ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->toString()Ljava/lang/String;
			 final String v1 = "contactlessTypePersonalisedDown"; // const-string v1, "contactlessTypePersonalisedDown"
			 /* .line 48 */
			 (( android.content.ContentValues ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 } // :cond_0
	 } // .end method
	 public final android.content.ContentValues a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, fr.mbs.binary.Octets p1 ) {
		 /* .locals 4 */
		 final String v0 = "badge"; // const-string v0, "badge"
		 i.h.c.k .c ( p1,v0 );
		 final String v0 = "walletId"; // const-string v0, "walletId"
		 i.h.c.k .c ( p2,v0 );
		 /* .line 1 */
		 /* new-instance v1, Landroid/content/ContentValues; */
		 /* invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 2 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 final String v3 = "cipheredId"; // const-string v3, "cipheredId"
		 (( android.content.ContentValues ) v1 ).put ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 3 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 final String v3 = "zoneId"; // const-string v3, "zoneId"
		 (( android.content.ContentValues ) v1 ).put ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 4 */
		 (( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 (( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 5 */
		 p2 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isSecured ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 6 */
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredWalletKey ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
			 (( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
			 final String v0 = "cipheredWalletKey"; // const-string v0, "cipheredWalletKey"
			 /* .line 7 */
			 (( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 8 */
		 } // :cond_0
		 /* iget-boolean p2, p0, Le/h/d/a/a/s/k0/b;->a:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p2 != null) { // if-eqz p2, :cond_4
			 /* .line 9 */
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getTokenData ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
			 /* if-nez p2, :cond_1 */
			 /* move-object p2, v0 */
		 } // :cond_1
		 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toHexa()Ljava/lang/String;
	 } // :goto_0
	 final String v2 = "tokenData"; // const-string v2, "tokenData"
	 /* .line 10 */
	 (( android.content.ContentValues ) v1 ).put ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 11 */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredTokenDataSignature ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
	 /* if-nez p2, :cond_2 */
	 /* move-object p2, v0 */
} // :cond_2
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_1
final String v2 = "cipheredTokenDataSignature"; // const-string v2, "cipheredTokenDataSignature"
/* .line 12 */
(( android.content.ContentValues ) v1 ).put ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 13 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getRegenerationDate ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRegenerationDate()Ljava/util/Date;
/* if-nez p2, :cond_3 */
/* move-object p2, v0 */
} // :cond_3
(( java.util.Date ) p2 ).getTime ( ); // invoke-virtual {p2}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
java.lang.Long .valueOf ( v2,v3 );
} // :goto_2
final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
/* .line 14 */
(( android.content.ContentValues ) v1 ).put ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
/* .line 15 */
} // :cond_4
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
final String v2 = "description"; // const-string v2, "description"
(( android.content.ContentValues ) v1 ).put ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 16 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getLogoFile ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getLogoFile()Ljava/lang/String;
final String v2 = "logoFile"; // const-string v2, "logoFile"
(( android.content.ContentValues ) v1 ).put ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 17 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredUrl ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;
/* if-nez p2, :cond_5 */
} // :cond_5
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_3
final String p2 = "cipheredUrl"; // const-string p2, "cipheredUrl"
/* .line 18 */
(( android.content.ContentValues ) v1 ).put ( p2, v0 ); // invoke-virtual {v1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 19 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getMaskedId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;
final String v0 = "maskedId"; // const-string v0, "maskedId"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 20 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isTransactionAllowed ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isTransactionAllowed()Z
java.lang.Integer .valueOf ( p2 );
final String v0 = "isTransactionAllowed"; // const-string v0, "isTransactionAllowed"
/* .line 21 */
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 22 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getRssi ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B
java.lang.Byte .valueOf ( p2 );
final String v0 = "rssi"; // const-string v0, "rssi"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Byte;)V
/* .line 23 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getRssiButtonInterval ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssiButtonInterval()B
java.lang.Byte .valueOf ( p2 );
final String v0 = "rssiButtonInterval"; // const-string v0, "rssiButtonInterval"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Byte;)V
/* .line 24 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getUserId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
final String v0 = "userId"; // const-string v0, "userId"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 25 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getBleSessionTimeout ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getBleSessionTimeout()Ljava/lang/Integer;
final String v0 = "bleSessionTimeout"; // const-string v0, "bleSessionTimeout"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 26 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDelayAfterBadgeOk ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDelayAfterBadgeOk()Ljava/lang/Integer;
final String v0 = "delayAfterBadgeOk"; // const-string v0, "delayAfterBadgeOk"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 27 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isNfcOnly ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z
java.lang.Boolean .valueOf ( p2 );
final String v0 = "nfcOnly"; // const-string v0, "nfcOnly"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 28 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactLessType ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;
(( java.lang.Enum ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;
final String v0 = "contactlessType"; // const-string v0, "contactlessType"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 29 */
(( e.h.d.a.a.s.k0.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/b;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Landroid/content/ContentValues;
/* .line 30 */
(( android.content.ContentValues ) v1 ).putAll ( p2 ); // invoke-virtual {v1, p2}, Landroid/content/ContentValues;->putAll(Landroid/content/ContentValues;)V
/* .line 31 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isLockable ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isLockable()Z
java.lang.Boolean .valueOf ( p2 );
final String v0 = "lockable"; // const-string v0, "lockable"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 32 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getUnlockableByZoneID ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUnlockableByZoneID()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.s.k0.b ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/s/k0/b;->a(Lfr/mbs/binary/Octets;)Ljava/lang/String;
final String v0 = "unlockableByZoneID"; // const-string v0, "unlockableByZoneID"
/* .line 33 */
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 34 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getUnlockedDuration ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUnlockedDuration()Ljava/lang/Integer;
final String v0 = "unlockedDuration"; // const-string v0, "unlockedDuration"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 35 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getStatus ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getStatus()Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
(( java.lang.Enum ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;
final String v0 = "badgeStatus"; // const-string v0, "badgeStatus"
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 36 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getConditionToBeginTransaction ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
(( java.lang.Enum ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;
final String v0 = "conditionToBeginTransaction"; // const-string v0, "conditionToBeginTransaction"
/* .line 37 */
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 38 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isManualConnectionAllowed ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isManualConnectionAllowed()Z
java.lang.Boolean .valueOf ( p2 );
final String v0 = "manualConnectionAllowed"; // const-string v0, "manualConnectionAllowed"
/* .line 39 */
(( android.content.ContentValues ) v1 ).put ( v0, p2 ); // invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 40 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getRssiDurationForButtonComputation ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssiDurationForButtonComputation()Ljava/lang/Integer;
final String p2 = "rssiDurationForButtonComputation"; // const-string p2, "rssiDurationForButtonComputation"
(( android.content.ContentValues ) v1 ).put ( p2, p1 ); // invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
} // .end method
public final java.lang.String a ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 49 */
} // :cond_0
(( fr.mbs.binary.Octets ) p1 ).toString ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
public final Boolean b ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 1 */
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactLessType ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;
v0 = com.orange.oab.contactless.packid.ContactlessType.PERSONALISED;
/* if-ne p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
