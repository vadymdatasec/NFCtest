public class e.f.c.s.t.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String c;
	 /* # instance fields */
	 public final android.content.SharedPreferences a;
	 public final java.lang.String b;
	 /* # direct methods */
	 public static e.f.c.s.t.d ( ) {
		 /* .locals 4 */
		 final String v0 = "*"; // const-string v0, "*"
		 final String v1 = "FCM"; // const-string v1, "FCM"
		 final String v2 = "GCM"; // const-string v2, "GCM"
		 final String v3 = ""; // const-string v3, ""
		 /* .line 1 */
		 /* filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public e.f.c.s.t.d ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
		 final String v1 = "com.google.android.gms.appid"; // const-string v1, "com.google.android.gms.appid"
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 3 */
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 this.a = v0;
		 /* .line 4 */
		 e.f.c.s.t.d .a ( p1 );
		 this.b = p1;
		 return;
	 } // .end method
	 public static java.lang.String a ( Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
		 (( e.f.c.i ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/i;->c()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 (( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
		 (( e.f.c.i ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/i;->b()Ljava/lang/String;
		 final String v0 = "1:"; // const-string v0, "1:"
		 /* .line 3 */
		 v0 = 		 (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_1 */
		 final String v0 = "2:"; // const-string v0, "2:"
		 v0 = 		 (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_1 */
	 } // :cond_1
	 final String v0 = ":"; // const-string v0, ":"
	 /* .line 4 */
	 (( java.lang.String ) p0 ).split ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
	 /* .line 5 */
	 /* array-length v0, p0 */
	 int v1 = 4; // const/4 v1, 0x4
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-eq v0, v1, :cond_2 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* aget-object p0, p0, v0 */
/* .line 7 */
v0 = (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_3
} // .end method
public static java.lang.String a ( java.security.PublicKey p0 ) {
/* .locals 3 */
/* .line 16 */
try { // :try_start_0
	 final String v0 = "SHA1"; // const-string v0, "SHA1"
	 /* .line 17 */
	 java.security.MessageDigest .getInstance ( v0 );
	 /* .line 18 */
	 (( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 19 */
	 /* aget-byte v1, p0, v0 */
	 /* and-int/lit8 v1, v1, 0xf */
	 /* add-int/lit8 v1, v1, 0x70 */
	 /* and-int/lit16 v1, v1, 0xff */
	 /* int-to-byte v1, v1 */
	 /* .line 20 */
	 /* aput-byte v1, p0, v0 */
	 /* const/16 v1, 0x8 */
	 /* const/16 v2, 0xb */
	 /* .line 21 */
	 android.util.Base64 .encodeToString ( p0,v0,v1,v2 );
	 /* :try_end_0 */
	 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 final String p0 = "ContentValues"; // const-string p0, "ContentValues"
	 final String v0 = "Unexpected error, device missing required algorithms"; // const-string v0, "Unexpected error, device missing required algorithms"
	 /* .line 22 */
	 android.util.Log .w ( p0,v0 );
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
	 /* .locals 2 */
	 /* .line 11 */
	 v0 = this.a;
	 /* monitor-enter v0 */
	 /* .line 12 */
	 try { // :try_start_0
		 (( e.f.c.s.t.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/s/t/d;->b()Ljava/lang/String;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 13 */
			 /* monitor-exit v0 */
			 /* .line 14 */
		 } // :cond_0
		 (( e.f.c.s.t.d ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/s/t/d;->c()Ljava/lang/String;
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* .line 15 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v1 */
	 } // .end method
	 public final java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 9 */
		 try { // :try_start_0
			 /* new-instance v0, Lorg/json/JSONObject; */
			 /* invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
			 final String p1 = "token"; // const-string p1, "token"
			 /* .line 10 */
			 (( org.json.JSONObject ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
			 /* :try_end_0 */
			 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 int p1 = 0; // const/4 p1, 0x0
		 } // .end method
		 public final java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
			 /* .locals 2 */
			 /* .line 8 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "|T|"; // const-string v1, "|T|"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String p1 = "|"; // const-string p1, "|"
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 } // .end method
		 public final java.lang.String b ( ) {
			 /* .locals 4 */
			 /* .line 1 */
			 v0 = this.a;
			 /* monitor-enter v0 */
			 /* .line 2 */
			 try { // :try_start_0
				 v1 = this.a;
				 final String v2 = "|S|id"; // const-string v2, "|S|id"
				 int v3 = 0; // const/4 v3, 0x0
				 /* monitor-exit v0 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* .line 3 */
				 /* monitor-exit v0 */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* throw v1 */
			 } // .end method
			 public final java.security.PublicKey b ( java.lang.String p0 ) {
				 /* .locals 2 */
				 /* const/16 v0, 0x8 */
				 /* .line 4 */
				 try { // :try_start_0
					 android.util.Base64 .decode ( p1,v0 );
					 final String v0 = "RSA"; // const-string v0, "RSA"
					 /* .line 5 */
					 java.security.KeyFactory .getInstance ( v0 );
					 /* .line 6 */
					 /* new-instance v1, Ljava/security/spec/X509EncodedKeySpec; */
					 /* invoke-direct {v1, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V */
					 (( java.security.KeyFactory ) v0 ).generatePublic ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
					 /* :try_end_0 */
					 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_2 */
					 /* .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 ..:try_end_0} :catch_1 */
					 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* :catch_0 */
					 /* move-exception p1 */
					 /* :catch_1 */
					 /* move-exception p1 */
					 /* :catch_2 */
					 /* move-exception p1 */
					 /* .line 7 */
				 } // :goto_0
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v1 = "Invalid key stored "; // const-string v1, "Invalid key stored "
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 final String v0 = "ContentValues"; // const-string v0, "ContentValues"
				 android.util.Log .w ( v0,p1 );
				 int p1 = 0; // const/4 p1, 0x0
			 } // .end method
			 public final java.lang.String c ( ) {
				 /* .locals 4 */
				 /* .line 1 */
				 v0 = this.a;
				 /* monitor-enter v0 */
				 /* .line 2 */
				 try { // :try_start_0
					 v1 = this.a;
					 final String v2 = "|S||P|"; // const-string v2, "|S||P|"
					 int v3 = 0; // const/4 v3, 0x0
					 /* if-nez v1, :cond_0 */
					 /* .line 3 */
					 /* monitor-exit v0 */
					 /* .line 4 */
				 } // :cond_0
				 (( e.f.c.s.t.d ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/s/t/d;->b(Ljava/lang/String;)Ljava/security/PublicKey;
				 /* if-nez v1, :cond_1 */
				 /* .line 5 */
				 /* monitor-exit v0 */
				 /* .line 6 */
			 } // :cond_1
			 e.f.c.s.t.d .a ( v1 );
			 /* monitor-exit v0 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* .line 7 */
			 /* monitor-exit v0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v1 */
		 } // .end method
		 public java.lang.String d ( ) {
			 /* .locals 7 */
			 /* .line 1 */
			 v0 = this.a;
			 /* monitor-enter v0 */
			 /* .line 2 */
			 try { // :try_start_0
				 v1 = e.f.c.s.t.d.c;
				 /* array-length v2, v1 */
				 int v3 = 0; // const/4 v3, 0x0
			 } // :goto_0
			 int v4 = 0; // const/4 v4, 0x0
			 /* if-ge v3, v2, :cond_2 */
			 /* aget-object v5, v1, v3 */
			 /* .line 3 */
			 v6 = this.b;
			 (( e.f.c.s.t.d ) p0 ).a ( v6, v5 ); // invoke-virtual {p0, v6, v5}, Le/f/c/s/t/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
			 /* .line 4 */
			 v6 = this.a;
			 if ( v4 != null) { // if-eqz v4, :cond_1
				 /* .line 5 */
				 v5 = 				 (( java.lang.String ) v4 ).isEmpty ( ); // invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z
				 /* if-nez v5, :cond_1 */
				 final String v1 = "{"; // const-string v1, "{"
				 /* .line 6 */
				 v1 = 				 (( java.lang.String ) v4 ).startsWith ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 (( e.f.c.s.t.d ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Le/f/c/s/t/d;->a(Ljava/lang/String;)Ljava/lang/String;
				 } // :cond_0
				 /* monitor-exit v0 */
			 } // :cond_1
			 /* add-int/lit8 v3, v3, 0x1 */
			 /* .line 7 */
		 } // :cond_2
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* .line 8 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v1 */
	 } // .end method
