public class e.h.d.a.a.s.u extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.u ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 11 */
		 final String v0 = "user"; // const-string v0, "user"
		 final String v1 = "simCentric"; // const-string v1, "simCentric"
		 final String v2 = "BOOLEAN DEFAULT 0"; // const-string v2, "BOOLEAN DEFAULT 0"
		 /* .line 1 */
		 (( e.h.d.a.a.s.h0 ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 final String v0 = "badge"; // const-string v0, "badge"
		 final String v1 = "badgeStatus"; // const-string v1, "badgeStatus"
		 final String v2 = "VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\'"; // const-string v2, "VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\'"
		 /* .line 2 */
		 (( e.h.d.a.a.s.h0 ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "conditionToBeginTransaction"; // const-string v3, "conditionToBeginTransaction"
		 final String v4 = "manualConnectionAllowed"; // const-string v4, "manualConnectionAllowed"
		 final String v5 = "contactlessType"; // const-string v5, "contactlessType"
		 final String v6 = "rssiButtonInterval"; // const-string v6, "rssiButtonInterval"
		 final String v7 = "rssiDurationForButtonComputation"; // const-string v7, "rssiDurationForButtonComputation"
		 final String v8 = "lockable"; // const-string v8, "lockable"
		 final String v9 = "unlockedDuration"; // const-string v9, "unlockedDuration"
		 final String v10 = "unlockableByZoneID"; // const-string v10, "unlockableByZoneID"
		 /* .line 3 */
		 /* filled-new-array/range {v3 ..v10}, [Ljava/lang/String; */
		 final String v2 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v2, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
		 (( e.h.d.a.a.s.h0 ) p0 ).a ( v2, v0, v1 ); // invoke-virtual {p0, v2, v0, v1}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 return;
	 } // .end method
