public abstract class e.b.a.d0.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.concurrent.ConcurrentMap a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/ConcurrentMap<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/b/a/y/n;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.d0.b ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
return;
} // .end method
public static android.content.pm.PackageInfo a ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 3 */
try { // :try_start_0
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 /* :try_end_0 */
	 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 4 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Cannot resolve info for"; // const-string v2, "Cannot resolve info for"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "AppVersionSignature"; // const-string v1, "AppVersionSignature"
	 android.util.Log .e ( v1,p0,v0 );
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.String a ( android.content.pm.PackageInfo p0 ) {
	 /* .locals 0 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 1 */
		 /* iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I */
		 java.lang.String .valueOf ( p0 );
		 /* .line 2 */
	 } // :cond_0
	 java.util.UUID .randomUUID ( );
	 (( java.util.UUID ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
public static e.b.a.y.n b ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 2 */
v1 = e.b.a.d0.b.a;
/* check-cast v1, Le/b/a/y/n; */
/* if-nez v1, :cond_1 */
/* .line 3 */
e.b.a.d0.b .c ( p0 );
/* .line 4 */
p0 = e.b.a.d0.b.a;
/* check-cast p0, Le/b/a/y/n; */
/* if-nez p0, :cond_0 */
} // :cond_0
/* move-object v1, p0 */
} // :cond_1
} // :goto_0
} // .end method
public static e.b.a.y.n c ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 1 */
e.b.a.d0.b .a ( p0 );
/* .line 2 */
e.b.a.d0.b .a ( p0 );
/* .line 3 */
/* new-instance v0, Le/b/a/d0/d; */
/* invoke-direct {v0, p0}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V */
} // .end method
