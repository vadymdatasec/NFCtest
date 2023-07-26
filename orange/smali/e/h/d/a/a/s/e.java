public class e.h.d.a.a.s.e extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 19 */
		 /* move-object/from16 v0, p0 */
		 final String v1 = "MultiAccountDbMigrator"; // const-string v1, "MultiAccountDbMigrator"
		 final String v2 = "Begin DB migration to MultiAccount"; // const-string v2, "Begin DB migration to MultiAccount"
		 /* .line 1 */
		 android.util.Log .i ( v1,v2 );
		 final String v2 = "cipheredUri"; // const-string v2, "cipheredUri"
		 final String v3 = "id"; // const-string v3, "id"
		 final String v4 = "simCentric"; // const-string v4, "simCentric"
		 /* .line 2 */
		 /* filled-new-array {v2, v3, v4}, [Ljava/lang/String; */
		 final String v3 = "CREATE TABLE user (contactlessId TEXT UNIQUE,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE);"; // const-string v3, "CREATE TABLE user (contactlessId TEXT UNIQUE,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE);"
		 final String v4 = "user"; // const-string v4, "user"
		 (( e.h.d.a.a.s.h0 ) v0 ).a ( v3, v4, v2 ); // invoke-virtual {v0, v3, v4, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 final String v5 = "userId"; // const-string v5, "userId"
		 final String v6 = "bleSessionTimeout"; // const-string v6, "bleSessionTimeout"
		 final String v7 = "tempoAfterBadgeOk"; // const-string v7, "tempoAfterBadgeOk"
		 final String v8 = "delayAfterBadgeOk"; // const-string v8, "delayAfterBadgeOk"
		 final String v9 = "nfcOnly"; // const-string v9, "nfcOnly"
		 final String v10 = "badgeStatus"; // const-string v10, "badgeStatus"
		 final String v11 = "conditionToBeginTransaction"; // const-string v11, "conditionToBeginTransaction"
		 final String v12 = "manualConnectionAllowed"; // const-string v12, "manualConnectionAllowed"
		 final String v13 = "rssiButtonInterval"; // const-string v13, "rssiButtonInterval"
		 final String v14 = "rssiDurationForButtonComputation"; // const-string v14, "rssiDurationForButtonComputation"
		 final String v15 = "contactlessType"; // const-string v15, "contactlessType"
		 final String v16 = "lockable"; // const-string v16, "lockable"
		 final String v17 = "unlockedDuration"; // const-string v17, "unlockedDuration"
		 final String v18 = "unlockableByZoneID"; // const-string v18, "unlockableByZoneID"
		 /* .line 3 */
		 /* filled-new-array/range {v5 ..v18}, [Ljava/lang/String; */
		 final String v3 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v3, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
		 final String v4 = "badge"; // const-string v4, "badge"
		 (( e.h.d.a.a.s.h0 ) v0 ).a ( v3, v4, v2 ); // invoke-virtual {v0, v3, v4, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 final String v2 = "Begin data migration to MultiAccount"; // const-string v2, "Begin data migration to MultiAccount"
		 /* .line 4 */
		 android.util.Log .i ( v1,v2 );
		 /* .line 5 */
		 /* invoke-virtual/range {p0 ..p0}, Le/h/d/a/a/s/e;->b()V */
		 final String v2 = "End migration to MultiAccount"; // const-string v2, "End migration to MultiAccount"
		 /* .line 6 */
		 android.util.Log .i ( v1,v2 );
		 return;
	 } // .end method
	 public final void b ( ) {
		 /* .locals 6 */
		 final String v0 = "MultiAccountDbMigrator"; // const-string v0, "MultiAccountDbMigrator"
		 /* .line 1 */
		 try { // :try_start_0
			 /* new-instance v1, Le/h/d/a/a/s/i0; */
			 v2 = this.a;
			 /* invoke-direct {v1, v2}, Le/h/d/a/a/s/i0;-><init>(Landroid/content/Context;)V */
			 (( e.h.d.a.a.s.i0 ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/s/i0;->b()Lfr/mbs/binary/Octets;
			 /* .line 2 */
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v3 = "cipheredUri found "; // const-string v3, "cipheredUri found "
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .i ( v0,v2 );
			 /* .line 3 */
			 /* new-instance v2, Le/h/d/a/a/s/s0; */
			 /* invoke-direct {v2, p0}, Le/h/d/a/a/s/s0;-><init>(Le/h/d/a/a/s/e;)V */
			 v3 = this.b;
			 (( e.h.d.a.a.s.s0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/h/d/a/a/s/s0;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
			 /* .line 4 */
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).setCipheredUri ( v1 ); // invoke-virtual {v2, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V
			 /* .line 5 */
			 java.util.UUID .randomUUID ( );
			 (( java.util.UUID ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).setId ( v1 ); // invoke-virtual {v2, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setId(Ljava/lang/String;)V
			 /* .line 6 */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v3 = "User found for contactlessId: "; // const-string v3, "User found for contactlessId: "
			 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getContactlessId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
			 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .i ( v0,v1 );
			 /* .line 7 */
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).getBadges ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
		 v3 = 		 } // :goto_0
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
			 /* .line 8 */
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).setUserId ( v4 ); // invoke-virtual {v3, v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUserId(Ljava/lang/String;)V
			 /* .line 9 */
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v5 = "Badge found for with cipheredBadgeID: "; // const-string v5, "Badge found for with cipheredBadgeID: "
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getCipheredId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
			 (( fr.mbs.binary.Octets ) v5 ).toHexa ( ); // invoke-virtual {v5}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .i ( v0,v4 );
			 /* .line 10 */
			 /* new-instance v4, Le/h/d/a/a/s/a; */
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v5 ).getId ( ); // invoke-virtual {v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
			 /* invoke-direct {v4, p0, v5, v3}, Le/h/d/a/a/s/a;-><init>(Le/h/d/a/a/s/e;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
			 v3 = this.b;
			 (( e.h.d.a.a.s.a ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Le/h/d/a/a/s/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
			 /* .line 11 */
		 } // :cond_0
		 /* new-instance v1, Le/h/d/a/a/s/c; */
		 /* invoke-direct {v1, p0, v2}, Le/h/d/a/a/s/c;-><init>(Le/h/d/a/a/s/e;Lcom/orange/oab/contactless/packid/hce/user/User;)V */
		 v2 = this.b;
		 (( e.h.d.a.a.s.c ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/s/c;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
		 /* .line 12 */
		 /* new-instance v1, Le/h/d/a/a/s/i0; */
		 v2 = this.a;
		 /* invoke-direct {v1, v2}, Le/h/d/a/a/s/i0;-><init>(Landroid/content/Context;)V */
		 (( e.h.d.a.a.s.i0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/s/i0;->a()V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 final String v2 = "Can\'t migrate User URI file to User DB"; // const-string v2, "Can\'t migrate User URI file to User DB"
		 /* .line 13 */
		 android.util.Log .e ( v0,v2,v1 );
	 } // :goto_1
	 return;
} // .end method
