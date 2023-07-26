public class e.h.d.a.a.s.k extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 18 */
		 /* move-object/from16 v0, p0 */
		 final String v1 = "badge"; // const-string v1, "badge"
		 final String v2 = "delayAfterBadgeOk"; // const-string v2, "delayAfterBadgeOk"
		 final String v3 = "INTEGER"; // const-string v3, "INTEGER"
		 /* .line 1 */
		 (( e.h.d.a.a.s.h0 ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 2 */
		 v2 = this.b;
		 final String v3 = "update badge set delayAfterBadgeOk = tempoAfterBadgeOk"; // const-string v3, "update badge set delayAfterBadgeOk = tempoAfterBadgeOk"
		 (( android.database.sqlite.SQLiteDatabase ) v2 ).execSQL ( v3 ); // invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 final String v4 = "tempoAfterBadgeOk"; // const-string v4, "tempoAfterBadgeOk"
		 final String v5 = "nfcOnly"; // const-string v5, "nfcOnly"
		 final String v6 = "badgeStatus"; // const-string v6, "badgeStatus"
		 final String v7 = "conditionToBeginTransaction"; // const-string v7, "conditionToBeginTransaction"
		 final String v8 = "manualConnectionAllowed"; // const-string v8, "manualConnectionAllowed"
		 final String v9 = "rssiButtonInterval"; // const-string v9, "rssiButtonInterval"
		 final String v10 = "rssiDurationForButtonComputation"; // const-string v10, "rssiDurationForButtonComputation"
		 final String v11 = "contactlessType"; // const-string v11, "contactlessType"
		 final String v12 = "lockable"; // const-string v12, "lockable"
		 final String v13 = "unlockedDuration"; // const-string v13, "unlockedDuration"
		 final String v14 = "unlockableByZoneID"; // const-string v14, "unlockableByZoneID"
		 final String v15 = "lockable"; // const-string v15, "lockable"
		 final String v16 = "unlockedDuration"; // const-string v16, "unlockedDuration"
		 final String v17 = "unlockableByZoneID"; // const-string v17, "unlockableByZoneID"
		 /* .line 3 */
		 /* filled-new-array/range {v4 ..v17}, [Ljava/lang/String; */
		 final String v3 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v3, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
		 (( e.h.d.a.a.s.h0 ) v0 ).a ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 return;
	 } // .end method
