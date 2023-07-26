public class e.h.d.a.a.s.i extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 13 */
		 final String v0 = "nfcOnly"; // const-string v0, "nfcOnly"
		 final String v1 = "badgeStatus"; // const-string v1, "badgeStatus"
		 final String v2 = "conditionToBeginTransaction"; // const-string v2, "conditionToBeginTransaction"
		 final String v3 = "manualConnectionAllowed"; // const-string v3, "manualConnectionAllowed"
		 final String v4 = "contactlessType"; // const-string v4, "contactlessType"
		 final String v5 = "rssiButtonInterval"; // const-string v5, "rssiButtonInterval"
		 final String v6 = "rssiDurationForButtonComputation"; // const-string v6, "rssiDurationForButtonComputation"
		 final String v7 = "lockable"; // const-string v7, "lockable"
		 final String v8 = "unlockedDuration"; // const-string v8, "unlockedDuration"
		 final String v9 = "unlockableByZoneID"; // const-string v9, "unlockableByZoneID"
		 final String v10 = "lockable"; // const-string v10, "lockable"
		 final String v11 = "unlockedDuration"; // const-string v11, "unlockedDuration"
		 final String v12 = "unlockableByZoneID"; // const-string v12, "unlockableByZoneID"
		 /* .line 1 */
		 /* filled-new-array/range {v0 ..v12}, [Ljava/lang/String; */
		 final String v1 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v1, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
		 final String v2 = "badge"; // const-string v2, "badge"
		 (( e.h.d.a.a.s.h0 ) p0 ).a ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 return;
	 } // .end method
