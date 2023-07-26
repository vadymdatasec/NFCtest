public class e.h.d.a.a.s.m0 extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.m0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 23 */
		 /* move-object/from16 v0, p0 */
		 final String v1 = "badge"; // const-string v1, "badge"
		 final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
		 final String v3 = "INTEGER"; // const-string v3, "INTEGER"
		 /* .line 1 */
		 (( e.h.d.a.a.s.h0 ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 2 */
		 v2 = this.b;
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "update badge set regenerationDate = "; // const-string v4, "update badge set regenerationDate = "
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* new-instance v4, Ljava/util/Date; */
		 /* const-wide/16 v5, 0x0 */
		 /* invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V */
		 (( java.util.Date ) v4 ).getTime ( ); // invoke-virtual {v4}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v4 */
		 (( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v4 = " where tokenData is not null"; // const-string v4, " where tokenData is not null"
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.database.sqlite.SQLiteDatabase ) v2 ).execSQL ( v3 ); // invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 final String v4 = "isTransactionAllowed"; // const-string v4, "isTransactionAllowed"
		 final String v5 = "rssi"; // const-string v5, "rssi"
		 final String v6 = "rssiButtonInterval"; // const-string v6, "rssiButtonInterval"
		 final String v7 = "rssiDurationForButtonComputation"; // const-string v7, "rssiDurationForButtonComputation"
		 final String v8 = "userId"; // const-string v8, "userId"
		 final String v9 = "bleSessionTimeout"; // const-string v9, "bleSessionTimeout"
		 final String v10 = "tempoAfterBadgeOk"; // const-string v10, "tempoAfterBadgeOk"
		 final String v11 = "delayAfterBadgeOk"; // const-string v11, "delayAfterBadgeOk"
		 final String v12 = "nfcOnly"; // const-string v12, "nfcOnly"
		 final String v13 = "badgeStatus"; // const-string v13, "badgeStatus"
		 final String v14 = "conditionToBeginTransaction"; // const-string v14, "conditionToBeginTransaction"
		 final String v15 = "manualConnectionAllowed"; // const-string v15, "manualConnectionAllowed"
		 final String v16 = "contactlessType"; // const-string v16, "contactlessType"
		 final String v17 = "lockable"; // const-string v17, "lockable"
		 final String v18 = "unlockedDuration"; // const-string v18, "unlockedDuration"
		 final String v19 = "unlockableByZoneID"; // const-string v19, "unlockableByZoneID"
		 final String v20 = "lockable"; // const-string v20, "lockable"
		 final String v21 = "unlockedDuration"; // const-string v21, "unlockedDuration"
		 final String v22 = "unlockableByZoneID"; // const-string v22, "unlockableByZoneID"
		 /* .line 3 */
		 /* filled-new-array/range {v4 ..v22}, [Ljava/lang/String; */
		 final String v3 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v3, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
		 (( e.h.d.a.a.s.h0 ) v0 ).a ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 return;
	 } // .end method
