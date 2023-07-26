public class e.f.c.l.e.m.q1 implements e.f.c.l.e.m.r1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.util.regex.Pattern f;
	 public static final java.lang.String g;
	 /* # instance fields */
	 public final e.f.c.l.e.m.s1 a;
	 public final android.content.Context b;
	 public final java.lang.String c;
	 public final e.f.c.s.k d;
	 public java.lang.String e;
	 /* # direct methods */
	 public static e.f.c.l.e.m.q1 ( ) {
		 /* .locals 1 */
		 final String v0 = "[^\\p{Alnum}]"; // const-string v0, "[^\\p{Alnum}]"
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0 );
		 final String v0 = "/"; // const-string v0, "/"
		 /* .line 2 */
		 java.util.regex.Pattern .quote ( v0 );
		 return;
	 } // .end method
	 public e.f.c.l.e.m.q1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 2 */
				 this.b = p1;
				 /* .line 3 */
				 this.c = p2;
				 /* .line 4 */
				 this.d = p3;
				 /* .line 5 */
				 /* new-instance p1, Le/f/c/l/e/m/s1; */
				 /* invoke-direct {p1}, Le/f/c/l/e/m/s1;-><init>()V */
				 this.a = p1;
				 return;
				 /* .line 6 */
			 } // :cond_0
			 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
			 final String p2 = "appIdentifier must not be null"; // const-string p2, "appIdentifier must not be null"
			 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw p1 */
			 /* .line 7 */
		 } // :cond_1
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "appContext must not be null"; // const-string p2, "appContext must not be null"
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public static java.lang.String b ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 1 */
	 } // :cond_0
	 v0 = e.f.c.l.e.m.q1.f;
	 (( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
	 final String v0 = ""; // const-string v0, ""
	 (( java.util.regex.Matcher ) p0 ).replaceAll ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
	 v0 = java.util.Locale.US;
	 (( java.lang.String ) p0 ).toLowerCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
} // :goto_0
} // .end method
/* # virtual methods */
public synchronized java.lang.String a ( ) {
/* .locals 7 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 v0 = this.e;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = this.e;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 /* .line 3 */
	 } // :cond_0
	 try { // :try_start_1
		 v0 = this.b;
		 e.f.c.l.e.m.j .h ( v0 );
		 /* .line 4 */
		 v1 = this.d;
		 final String v2 = "firebase.installation.id"; // const-string v2, "firebase.installation.id"
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 5 */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* .line 6 */
		 try { // :try_start_2
			 e.f.c.l.e.m.h2 .a ( v1 );
			 /* check-cast v1, Ljava/lang/String; */
			 /* :try_end_2 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* .line 7 */
			 try { // :try_start_3
				 e.f.c.l.e.b .a ( );
				 final String v5 = "Failed to retrieve installation id"; // const-string v5, "Failed to retrieve installation id"
				 (( e.f.c.l.e.b ) v4 ).a ( v5, v1 ); // invoke-virtual {v4, v5, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 /* move-object v1, v2 */
				 } // :cond_1
				 /* move-object v1, v3 */
			 } // :goto_0
			 /* if-nez v2, :cond_3 */
			 /* .line 8 */
			 v2 = this.b;
			 e.f.c.l.e.m.j .d ( v2 );
			 final String v4 = "crashlytics.installation.id"; // const-string v4, "crashlytics.installation.id"
			 /* .line 9 */
			 /* .line 10 */
			 e.f.c.l.e.b .a ( );
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v6 = "No cached FID; legacy id is "; // const-string v6, "No cached FID; legacy id is "
			 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.f.c.l.e.b ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* if-nez v3, :cond_2 */
			 /* .line 11 */
			 (( e.f.c.l.e.m.q1 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;Landroid/content/SharedPreferences;)Ljava/lang/String;
			 this.e = v0;
			 /* .line 12 */
		 } // :cond_2
		 this.e = v3;
		 /* .line 13 */
		 (( e.f.c.l.e.m.q1 ) p0 ).a ( v3, v1, v0, v2 ); // invoke-virtual {p0, v3, v1, v0, v2}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)V
		 /* .line 14 */
	 } // :goto_1
	 v0 = this.e;
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* monitor-exit p0 */
	 /* .line 15 */
} // :cond_3
try { // :try_start_4
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_4
		 final String v2 = "crashlytics.installation.id"; // const-string v2, "crashlytics.installation.id"
		 /* .line 16 */
		 this.e = v2;
		 /* .line 17 */
		 e.f.c.l.e.b .a ( );
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "Found matching FID, using Crashlytics IID: "; // const-string v4, "Found matching FID, using Crashlytics IID: "
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v4 = this.e;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( e.f.c.l.e.b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
		 /* .line 18 */
		 v2 = this.e;
		 /* if-nez v2, :cond_5 */
		 /* .line 19 */
		 (( e.f.c.l.e.m.q1 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;Landroid/content/SharedPreferences;)Ljava/lang/String;
		 this.e = v0;
		 /* .line 20 */
	 } // :cond_4
	 (( e.f.c.l.e.m.q1 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;Landroid/content/SharedPreferences;)Ljava/lang/String;
	 this.e = v0;
	 /* .line 21 */
} // :cond_5
} // :goto_2
v0 = this.e;
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 39 */
v0 = e.f.c.l.e.m.q1.g;
final String v1 = ""; // const-string v1, ""
(( java.lang.String ) p1 ).replaceAll ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public synchronized final java.lang.String a ( java.lang.String p0, android.content.SharedPreferences p1 ) {
/* .locals 4 */
/* monitor-enter p0 */
/* .line 32 */
try { // :try_start_0
java.util.UUID .randomUUID ( );
(( java.util.UUID ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
e.f.c.l.e.m.q1 .b ( v0 );
/* .line 33 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Created new Crashlytics IID: "; // const-string v3, "Created new Crashlytics IID: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 34 */
final String v1 = "crashlytics.installation.id"; // const-string v1, "crashlytics.installation.id"
/* .line 35 */
final String v1 = "firebase.installation.id"; // const-string v1, "firebase.installation.id"
/* .line 36 */
/* .line 37 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 38 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized final void a ( java.lang.String p0, java.lang.String p1, android.content.SharedPreferences p2, android.content.SharedPreferences p3 ) {
/* .locals 3 */
/* monitor-enter p0 */
/* .line 22 */
try { // :try_start_0
	 e.f.c.l.e.b .a ( );
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Migrating legacy Crashlytics IID: "; // const-string v2, "Migrating legacy Crashlytics IID: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 23 */
	 final String v0 = "crashlytics.installation.id"; // const-string v0, "crashlytics.installation.id"
	 /* .line 24 */
	 final String p3 = "firebase.installation.id"; // const-string p3, "firebase.installation.id"
	 /* .line 25 */
	 /* .line 26 */
	 /* .line 27 */
	 final String p2 = "crashlytics.installation.id"; // const-string p2, "crashlytics.installation.id"
	 /* .line 28 */
	 final String p2 = "crashlytics.advertising.id"; // const-string p2, "crashlytics.advertising.id"
	 /* .line 29 */
	 /* .line 30 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 31 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
public java.lang.String b ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = this.c;
} // .end method
public java.lang.String c ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.a;
	 v1 = this.b;
	 (( e.f.c.l.e.m.s1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/m/s1;->a(Landroid/content/Context;)Ljava/lang/String;
} // .end method
public java.lang.String d ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 v0 = java.util.Locale.US;
	 int v1 = 2; // const/4 v1, 0x2
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 v2 = android.os.Build.MANUFACTURER;
	 /* .line 2 */
	 (( e.f.c.l.e.m.q1 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;)Ljava/lang/String;
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object v2, v1, v3 */
	 v2 = android.os.Build.MODEL;
	 /* .line 3 */
	 (( e.f.c.l.e.m.q1 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;)Ljava/lang/String;
	 int v3 = 1; // const/4 v3, 0x1
	 /* aput-object v2, v1, v3 */
	 final String v2 = "%s/%s"; // const-string v2, "%s/%s"
	 /* .line 4 */
	 java.lang.String .format ( v0,v2,v1 );
} // .end method
public java.lang.String e ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = android.os.Build$VERSION.INCREMENTAL;
	 (( e.f.c.l.e.m.q1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String f ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = android.os.Build$VERSION.RELEASE;
	 (( e.f.c.l.e.m.q1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/q1;->a(Ljava/lang/String;)Ljava/lang/String;
} // .end method
