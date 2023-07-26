public class e.h.d.a.a.s.e0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.database.sqlite.SQLiteDatabase b;
	 /* # direct methods */
	 public e.h.d.a.a.s.e0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static fr.mbs.binary.Octets b ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
		 /* add-int/lit8 v0, v0, -0x8 */
		 int v1 = 0; // const/4 v1, 0x0
		 (( fr.mbs.binary.Octets ) p0 ).get ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 } // .end method
	 public static fr.mbs.binary.Octets c ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x8 */
		 /* .line 1 */
		 (( fr.mbs.binary.Octets ) p0 ).getLast ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;
	 } // .end method
	 /* # virtual methods */
	 public final fr.mbs.binary.Octets a ( java.io.File p0, Object p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 34 */
	 e.f.b.c.s .b ( p1 );
	 /* .line 35 */
	 (( e.h.d.a.a.n.w.c ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/n/w/c;->b([B)[B
	 fr.mbs.binary.Octets .createOctets ( p1 );
} // .end method
public void a ( ) {
	 /* .locals 4 */
	 final String v0 = "packid.UserFileToDb"; // const-string v0, "packid.UserFileToDb"
	 final String v1 = "Migrating old user information from file to database"; // const-string v1, "Migrating old user information from file to database"
	 /* .line 1 */
	 android.util.Log .i ( v0,v1 );
	 /* .line 2 */
	 /* new-instance v1, Ljava/io/File; */
	 v2 = this.a;
	 (( android.content.Context ) v2 ).getFilesDir ( ); // invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
	 final String v3 = "user.json"; // const-string v3, "user.json"
	 /* invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 /* .line 3 */
	 v2 = 	 (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 4 */
		 try { // :try_start_0
			 v2 = this.a;
			 e.h.d.a.a.n.w.c .b ( v2 );
			 /* .line 5 */
			 (( e.h.d.a.a.s.e0 ) p0 ).b ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/h/d/a/a/s/e0;->b(Ljava/io/File;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/User;
			 /* .line 6 */
			 (( e.h.d.a.a.s.e0 ) p0 ).a ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Le/h/d/a/a/s/e0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/n/w/c;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* :catch_0 */
			 /* move-exception v2 */
			 try { // :try_start_1
				 final String v3 = "Cannot upgrade database"; // const-string v3, "Cannot upgrade database"
				 /* .line 7 */
				 android.util.Log .e ( v0,v3,v2 );
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 8 */
			 } // :goto_0
			 (( e.h.d.a.a.s.e0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V
		 } // :goto_1
		 (( e.h.d.a.a.s.e0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V
		 /* .line 9 */
		 /* throw v0 */
	 } // :cond_0
} // :goto_2
return;
} // .end method
public final void a ( android.database.sqlite.SQLiteDatabase p0, com.orange.oab.contactless.packid.hce.user.User p1, java.io.File p2, com.orange.oab.contactless.packid.hce.user.wallet.Badge p3, Object p4 ) {
/* .locals 3 */
final String v0 = "packid.UserFileToDb"; // const-string v0, "packid.UserFileToDb"
/* .line 16 */
try { // :try_start_0
	 (( e.h.d.a.a.s.e0 ) p0 ).a ( p3, p5 ); // invoke-virtual {p0, p3, p5}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;
	 /* .line 17 */
	 v2 = 	 (( e.h.d.a.a.s.e0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/e0;->a(Lfr/mbs/binary/Octets;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 final String p5 = "Delete badge with old default token data, you need to update user to retrieve the server default token data"; // const-string p5, "Delete badge with old default token data, you need to update user to retrieve the server default token data"
		 /* .line 18 */
		 android.util.Log .i ( v0,p5 );
		 /* .line 19 */
		 /* new-instance p5, Le/h/d/a/a/s/k0/g; */
		 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getWallet ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
		 /* invoke-direct {p5, v1, p4}, Le/h/d/a/a/s/k0/g;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
		 (( e.h.d.a.a.s.k0.g ) p5 ).a ( p1 ); // invoke-virtual {p5, p1}, Le/h/d/a/a/s/k0/g;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 20 */
		 (( e.h.d.a.a.s.e0 ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V
		 return;
		 /* .line 21 */
	 } // :cond_0
	 try { // :try_start_1
		 e.h.d.a.a.s.e0 .b ( v1 );
		 com.orange.oab.contactless.packid.hce.user.TokenData .parse ( v2 );
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p4 ).setTokenData ( v2 ); // invoke-virtual {p4, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
		 /* .line 22 */
		 e.h.d.a.a.s.e0 .c ( v1 );
		 (( e.h.d.a.a.n.w.c ) p5 ).a ( v1 ); // invoke-virtual {p5, v1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p4 ).setCipheredTokenDataSignature ( p5 ); // invoke-virtual {p4, p5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
		 /* .line 23 */
		 /* new-instance p5, Le/h/d/a/a/s/k0/c; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p5, p4, v1}, Le/h/d/a/a/s/k0/c;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V */
		 (( e.h.d.a.a.s.k0.c ) p5 ).a ( p1 ); // invoke-virtual {p5, p1}, Le/h/d/a/a/s/k0/c;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* :catch_0 */
		 /* move-exception p5 */
		 try { // :try_start_2
			 final String v1 = "Cannot update tokens"; // const-string v1, "Cannot update tokens"
			 /* .line 24 */
			 android.util.Log .w ( v0,v1,p5 );
			 /* .line 25 */
			 /* new-instance v0, Le/h/d/a/a/s/k0/g; */
			 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getWallet ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p2 ).getId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
			 /* invoke-direct {v0, p2, p4}, Le/h/d/a/a/s/k0/g;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
			 (( e.h.d.a.a.s.k0.g ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/g;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
			 /* .line 26 */
			 p1 = this.a;
			 final String p2 = "user deleted by migrateToken"; // const-string p2, "user deleted by migrateToken"
			 com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,p2 );
			 /* .line 27 */
			 p1 = this.a;
			 com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,p5 );
			 /* .line 28 */
			 p1 = this.a;
			 final String p2 = "====================="; // const-string p2, "====================="
			 com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,p2 );
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* .line 29 */
		 } // :goto_0
		 (( e.h.d.a.a.s.e0 ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V
		 return;
		 /* .line 30 */
	 } // :goto_1
	 (( e.h.d.a.a.s.e0 ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V
	 /* .line 31 */
	 /* throw p1 */
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.User p0, Object p1 ) {
	 /* .locals 10 */
	 /* .line 10 */
	 /* new-instance v0, Ljava/io/File; */
	 v1 = this.a;
	 (( android.content.Context ) v1 ).getFilesDir ( ); // invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
	 final String v2 = "tokens"; // const-string v2, "tokens"
	 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 /* .line 11 */
	 v1 = 	 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 12 */
		 (( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
		 /* array-length v2, v1 */
		 int v3 = 0; // const/4 v3, 0x0
	 } // :goto_0
	 /* if-ge v3, v2, :cond_0 */
	 /* aget-object v7, v1, v3 */
	 /* .line 13 */
	 (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getWallet ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
	 (( java.io.File ) v7 ).getName ( ); // invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;
	 fr.mbs.binary.Octets .createOctets ( v5 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v4 ).findBadgeByZone ( v5 ); // invoke-virtual {v4, v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
	 /* .line 14 */
	 v5 = this.b;
	 /* move-object v4, p0 */
	 /* move-object v6, p1 */
	 /* move-object v9, p2 */
	 /* invoke-virtual/range {v4 ..v9}, Le/h/d/a/a/s/e0;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/io/File;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Le/h/d/a/a/n/w/c;)V */
	 /* add-int/lit8 v3, v3, 0x1 */
	 /* .line 15 */
} // :cond_0
(( e.h.d.a.a.s.e0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V
} // :cond_1
return;
} // .end method
public final void a ( java.io.File p0 ) {
/* .locals 2 */
/* .line 32 */
v0 = (( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* if-nez v0, :cond_0 */
/* .line 33 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Can\'t delete :"; // const-string v1, "Can\'t delete :"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p1 ).getAbsolutePath ( ); // invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.UserFileToDb"; // const-string v0, "packid.UserFileToDb"
android.util.Log .w ( v0,p1 );
} // :cond_0
return;
} // .end method
public final Boolean a ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 36 */
p1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* const/16 v0, 0x14 */
/* if-ne p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final com.orange.oab.contactless.packid.hce.user.User b ( java.io.File p0, Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Lorg/json/JSONObject; */
/* new-instance v1, Ljava/lang/String; */
e.f.b.c.s .b ( p1 );
(( e.h.d.a.a.n.w.c ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/n/w/c;->b([B)[B
v2 = java.nio.charset.StandardCharsets.UTF_8;
/* invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
/* invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 3 */
/* new-instance p1, Le/h/d/a/a/n/v; */
/* invoke-direct {p1, p2}, Le/h/d/a/a/n/v;-><init>(Le/h/d/a/a/n/w/c;)V */
(( e.h.d.a.a.n.v ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/User;
/* .line 4 */
/* new-instance p2, Le/h/d/a/a/s/k0/y; */
/* invoke-direct {p2, p1}, Le/h/d/a/a/s/k0/y;-><init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V */
v0 = this.b;
(( e.h.d.a.a.s.k0.y ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;)Le/h/d/a/a/p/a/a/a;
} // .end method
