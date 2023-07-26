public class e.h.d.a.a.s.b0 extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.b0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 22 */
		 /* move-object/from16 v1, p0 */
		 final String v0 = "text"; // const-string v0, "text"
		 final String v2 = "badge"; // const-string v2, "badge"
		 try { // :try_start_0
			 final String v3 = "cipheredId"; // const-string v3, "cipheredId"
			 /* .line 1 */
			 (( e.h.d.a.a.s.h0 ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
			 final String v3 = "maskedId"; // const-string v3, "maskedId"
			 /* .line 2 */
			 (( e.h.d.a.a.s.h0 ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 3 */
			 /* new-instance v0, Le/h/d/a/a/s/x; */
			 /* invoke-direct {v0}, Le/h/d/a/a/s/x;-><init>()V */
			 /* .line 4 */
			 v3 = this.b;
			 (( e.h.d.a.a.s.k0.o ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
			 /* .line 5 */
			 (( e.h.d.a.a.s.b0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/h/d/a/a/s/b0;->a(Ljava/util/List;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 final String v0 = "CREATE TABLE tokenTransaction (id TEXT PRIMARY KEY, zoneId TEXT, transactionDate NUMERIC, amountInCents INTEGER, description TEXT);"; // const-string v0, "CREATE TABLE tokenTransaction (id TEXT PRIMARY KEY, zoneId TEXT, transactionDate NUMERIC, amountInCents INTEGER, description TEXT);"
			 final String v3 = "tokenTransaction"; // const-string v3, "tokenTransaction"
			 try { // :try_start_1
				 final String v4 = "tokenId"; // const-string v4, "tokenId"
				 /* .line 6 */
				 /* filled-new-array {v4}, [Ljava/lang/String; */
				 (( e.h.d.a.a.s.h0 ) v1 ).a ( v0, v3, v4 ); // invoke-virtual {v1, v0, v3, v4}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
				 final String v0 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v0, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
				 try { // :try_start_2
					 final String v3 = "badgeId"; // const-string v3, "badgeId"
					 final String v4 = "logoFile"; // const-string v4, "logoFile"
					 final String v5 = "regenerationDate"; // const-string v5, "regenerationDate"
					 final String v6 = "isTransactionAllowed"; // const-string v6, "isTransactionAllowed"
					 final String v7 = "rssi"; // const-string v7, "rssi"
					 final String v8 = "rssiButtonInterval"; // const-string v8, "rssiButtonInterval"
					 final String v9 = "rssiDurationForButtonComputation"; // const-string v9, "rssiDurationForButtonComputation"
					 final String v10 = "userId"; // const-string v10, "userId"
					 final String v11 = "bleSessionTimeout"; // const-string v11, "bleSessionTimeout"
					 final String v12 = "tempoAfterBadgeOk"; // const-string v12, "tempoAfterBadgeOk"
					 final String v13 = "delayAfterBadgeOk"; // const-string v13, "delayAfterBadgeOk"
					 final String v14 = "nfcOnly"; // const-string v14, "nfcOnly"
					 final String v15 = "badgeStatus"; // const-string v15, "badgeStatus"
					 final String v16 = "conditionToBeginTransaction"; // const-string v16, "conditionToBeginTransaction"
					 final String v17 = "manualConnectionAllowed"; // const-string v17, "manualConnectionAllowed"
					 final String v18 = "contactlessType"; // const-string v18, "contactlessType"
					 final String v19 = "lockable"; // const-string v19, "lockable"
					 final String v20 = "unlockedDuration"; // const-string v20, "unlockedDuration"
					 final String v21 = "unlockableByZoneID"; // const-string v21, "unlockableByZoneID"
					 /* .line 7 */
					 /* filled-new-array/range {v3 ..v21}, [Ljava/lang/String; */
					 (( e.h.d.a.a.s.h0 ) v1 ).a ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
					 /* :try_end_2 */
					 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
					 /* :catch_0 */
					 /* move-exception v0 */
					 /* .line 8 */
					 v2 = this.a;
					 (( android.content.Context ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
					 com.orange.oab.contactless.packid.report.ReportSender .send ( v2,v0 );
				 } // :goto_0
				 return;
			 } // .end method
			 public final void a ( java.util.List p0 ) {
				 /* .locals 4 */
				 /* .annotation system Ldalvik/annotation/Signature; */
				 /* value = { */
				 /* "(", */
				 /* "Ljava/util/List<", */
				 /* "Le/h/d/a/a/s/z;", */
				 /* ">;)V" */
				 /* } */
			 } // .end annotation
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Lcom/orange/oab/contactless/packid/g/u/e; */
			 /* } */
		 } // .end annotation
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 v0 = 			 /* .line 9 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 10 */
			 } // :cond_0
			 v0 = this.a;
			 e.h.d.a.a.n.w.c .b ( v0 );
			 /* .line 11 */
		 v1 = 		 } // :goto_0
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* check-cast v1, Le/h/d/a/a/s/z; */
			 /* .line 12 */
			 v2 = this.b;
			 (( e.h.d.a.a.n.w.c ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
			 /* .line 13 */
			 /* new-instance v3, Le/h/d/a/a/s/v; */
			 /* invoke-direct {v3, v1, v2}, Le/h/d/a/a/s/v;-><init>(Le/h/d/a/a/s/z;Lfr/mbs/binary/Octets;)V */
			 /* .line 14 */
			 v1 = this.b;
			 (( e.h.d.a.a.s.v ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Le/h/d/a/a/s/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
		 } // :cond_1
	 } // :goto_1
	 return;
} // .end method
