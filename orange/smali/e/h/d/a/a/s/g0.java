public class e.h.d.a.a.s.g0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.h.d.a.a.s.q a;
	 /* # direct methods */
	 public e.h.d.a.a.s.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 1 */
		 final String v0 = "ALTER TABLE badge ADD COLUMN cipheredUrl TEXT;"; // const-string v0, "ALTER TABLE badge ADD COLUMN cipheredUrl TEXT;"
		 /* .line 1 */
		 (( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 final String v0 = "ALTER TABLE badge ADD COLUMN isUpToDate BOOLEAN DEFAULT 1;"; // const-string v0, "ALTER TABLE badge ADD COLUMN isUpToDate BOOLEAN DEFAULT 1;"
		 /* .line 2 */
		 (( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static void b ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 1 */
		 final String v0 = "CREATE TABLE user (contactlessId TEXT UNIQUE NOT NULL,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,tenantName TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE,firebaseEnable INTEGER,premium INTEGER,sendEnrolmentNotification BOOLEAN DEFAULT 0);"; // const-string v0, "CREATE TABLE user (contactlessId TEXT UNIQUE NOT NULL,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,tenantName TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE,firebaseEnable INTEGER,premium INTEGER,sendEnrolmentNotification BOOLEAN DEFAULT 0);"
		 /* .line 1 */
		 (( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 final String v0 = "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"; // const-string v0, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"
		 /* .line 2 */
		 (( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 final String v0 = "CREATE TABLE IF NOT EXISTS tenant (name TEXT UNIQUE NOT NULL,logoUrl TEXT);"; // const-string v0, "CREATE TABLE IF NOT EXISTS tenant (name TEXT UNIQUE NOT NULL,logoUrl TEXT);"
		 /* .line 3 */
		 (( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.hce.user.User a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
		 /* .locals 2 */
		 /* .line 5 */
		 v0 = this.a;
		 /* new-instance v1, Le/h/d/a/a/s/k0/r; */
		 /* invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/r;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
		 (( e.h.d.a.a.s.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
		 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
	 } // .end method
	 public com.orange.oab.contactless.packid.hce.user.User a ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 v0 = this.a;
		 /* new-instance v1, Le/h/d/a/a/s/k0/u; */
		 /* invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/u;-><init>(Lfr/mbs/binary/Octets;)V */
		 (( e.h.d.a.a.s.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
		 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
	 } // .end method
	 public com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( java.lang.String p0, fr.mbs.binary.Octets p1 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 v0 = this.a;
		 /* new-instance v1, Le/h/d/a/a/s/k0/q; */
		 /* invoke-direct {v1, p1, p2}, Le/h/d/a/a/s/k0/q;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
		 (( e.h.d.a.a.s.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
		 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
	 } // .end method
	 public e.h.d.a.a.p.a.a.a a ( com.orange.oab.contactless.packid.hce.user.User p0 ) {
		 /* .locals 2 */
		 /* .line 6 */
		 v0 = this.a;
		 /* new-instance v1, Le/h/d/a/a/s/k0/y; */
		 /* invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/y;-><init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V */
		 (( e.h.d.a.a.s.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
		 /* check-cast p1, Le/h/d/a/a/p/a/a/a; */
	 } // .end method
	 public java.util.List a ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "()", */
		 /* "Ljava/util/List<", */
		 /* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 3 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/k0/w; */
	 /* invoke-direct {v1}, Le/h/d/a/a/s/k0/w;-><init>()V */
	 (( e.h.d.a.a.s.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/util/List; */
} // .end method
public void a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 7 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/k0/j; */
	 /* invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/j;-><init>(Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 return;
} // .end method
public Boolean a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, fr.mbs.binary.Octets p1 ) {
	 /* .locals 2 */
	 /* .line 8 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/k0/c; */
	 /* invoke-direct {v1, p1, p2}, Le/h/d/a/a/s/k0/c;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V */
	 (( e.h.d.a.a.s.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/Boolean; */
	 p1 = 	 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public com.orange.oab.contactless.packid.hce.user.User b ( fr.mbs.binary.Octets p0 ) {
	 /* .locals 2 */
	 /* .line 10 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/k0/s; */
	 /* invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/s;-><init>(Lfr/mbs/binary/Octets;)V */
	 (( e.h.d.a.a.s.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
} // .end method
public com.orange.oab.contactless.packid.hce.user.User b ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 4 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/k0/v; */
	 /* invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/v;-><init>(Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
} // .end method
public void b ( ) {
	 /* .locals 2 */
	 final String v0 = "packid.UserRepository"; // const-string v0, "packid.UserRepository"
	 final String v1 = "delete Everything"; // const-string v1, "delete Everything"
	 /* .line 5 */
	 android.util.Log .i ( v0,v1 );
	 /* .line 6 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/k0/f; */
	 /* invoke-direct {v1}, Le/h/d/a/a/s/k0/f;-><init>()V */
	 (( e.h.d.a.a.s.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 return;
} // .end method
public void b ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
	 /* .locals 3 */
	 /* .line 7 */
	 /* new-instance v0, Ljava/util/Date; */
	 /* const-wide/16 v1, 0x0 */
	 /* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
	 /* .line 8 */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).setRegenerationDate ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V
	 /* .line 9 */
	 v1 = this.a;
	 /* new-instance v2, Le/h/d/a/a/s/k0/a; */
	 /* invoke-direct {v2, p1, v0}, Le/h/d/a/a/s/k0/a;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/util/Date;)V */
	 (( e.h.d.a.a.s.q ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 return;
} // .end method
public void c ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 (( e.h.d.a.a.s.g0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Z
	 return;
} // .end method
