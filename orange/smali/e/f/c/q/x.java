public class e.f.c.q.x {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/f/c/q/x$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.content.SharedPreferences a;
public final android.content.Context b;
public final java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.q.x ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.c = v0;
/* .line 3 */
this.b = p1;
final String v0 = "com.google.android.gms.appid"; // const-string v0, "com.google.android.gms.appid"
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
(( android.content.Context ) p1 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
this.a = p1;
final String p1 = "com.google.android.gms.appid-no-backup"; // const-string p1, "com.google.android.gms.appid-no-backup"
/* .line 5 */
(( e.f.c.q.x ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/x;->a(Ljava/lang/String;)V
return;
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 12 */
java.lang.String .valueOf ( p0 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x3 */
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, v1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "|S|"; // const-string p0, "|S|"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public final java.lang.String a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 11 */
java.lang.String .valueOf ( p1 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x4 */
java.lang.String .valueOf ( p2 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, v1 */
java.lang.String .valueOf ( p3 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, v1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "|T|"; // const-string p1, "|T|"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "|"; // const-string p1, "|"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public synchronized void a ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 13 */
try { // :try_start_0
v0 = this.c;
/* .line 14 */
v0 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 15 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 3 */
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 1 */
v1 = this.b;
c.h.f.f .c ( v1 );
/* .line 2 */
/* new-instance v2, Ljava/io/File; */
/* invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 3 */
p1 = (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
if ( p1 != null) { // if-eqz p1, :cond_0
	 return;
	 /* .line 4 */
} // :cond_0
try { // :try_start_0
	 p1 = 	 (( java.io.File ) v2 ).createNewFile ( ); // invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 5 */
		 p1 = 		 (( e.f.c.q.x ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/q/x;->b()Z
		 /* if-nez p1, :cond_1 */
		 final String p1 = "App restored, clearing state"; // const-string p1, "App restored, clearing state"
		 /* .line 6 */
		 android.util.Log .i ( v0,p1 );
		 /* .line 7 */
		 (( e.f.c.q.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/x;->a()V
		 /* .line 8 */
		 com.google.firebase.iid.FirebaseInstanceId .m ( );
		 (( com.google.firebase.iid.FirebaseInstanceId ) p1 ).j ( ); // invoke-virtual {p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->j()V
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :cond_1
	 return;
	 /* :catch_0 */
	 /* move-exception p1 */
	 int v1 = 3; // const/4 v1, 0x3
	 /* .line 9 */
	 v1 = 	 android.util.Log .isLoggable ( v0,v1 );
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 final String v1 = "Error creating file in no backup dir: "; // const-string v1, "Error creating file in no backup dir: "
		 /* .line 10 */
		 (( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
		 java.lang.String .valueOf ( p1 );
		 v2 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 (( java.lang.String ) v1 ).concat ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_2
		 /* new-instance p1, Ljava/lang/String; */
		 /* invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
	 } // :goto_0
	 android.util.Log .d ( v0,p1 );
} // :cond_3
return;
} // .end method
public synchronized void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 16 */
try { // :try_start_0
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 e.f.c.q.x$a .a ( p4,p5,v0,v1 );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* if-nez p4, :cond_0 */
	 /* .line 17 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 18 */
} // :cond_0
try { // :try_start_1
	 p5 = this.a;
	 /* .line 19 */
	 (( e.f.c.q.x ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/f/c/q/x;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 /* .line 20 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* .line 21 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
public final Long b ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 3 */
	 v0 = this.a;
	 final String v1 = "cre"; // const-string v1, "cre"
	 /* .line 4 */
	 e.f.c.q.x .a ( p1,v1 );
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 5 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 6 */
		 try { // :try_start_0
			 java.lang.Long .parseLong ( p1 );
			 /* move-result-wide v0 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* return-wide v0 */
			 /* :catch_0 */
		 } // :cond_0
		 /* const-wide/16 v0, 0x0 */
		 /* return-wide v0 */
	 } // .end method
	 public synchronized e.f.c.q.x$a b ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( e.f.c.q.x ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/f/c/q/x;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
			 int p2 = 0; // const/4 p2, 0x0
			 e.f.c.q.x$a .b ( p1 );
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
		 public synchronized Boolean b ( ) {
			 /* .locals 1 */
			 /* monitor-enter p0 */
			 /* .line 1 */
			 try { // :try_start_0
				 v0 = 				 v0 = this.a;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public synchronized Long c ( java.lang.String p0 ) {
				 /* .locals 4 */
				 /* monitor-enter p0 */
				 /* .line 1 */
				 try { // :try_start_0
					 (( e.f.c.q.x ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/x;->d(Ljava/lang/String;)J
					 /* move-result-wide v0 */
					 /* .line 2 */
					 v2 = this.c;
					 java.lang.Long .valueOf ( v0,v1 );
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 3 */
					 /* monitor-exit p0 */
					 /* return-wide v0 */
					 /* :catchall_0 */
					 /* move-exception p1 */
					 /* monitor-exit p0 */
					 /* throw p1 */
				 } // .end method
				 public final Long d ( java.lang.String p0 ) {
					 /* .locals 5 */
					 /* .line 1 */
					 java.lang.System .currentTimeMillis ( );
					 /* move-result-wide v0 */
					 final String v2 = "cre"; // const-string v2, "cre"
					 /* .line 2 */
					 e.f.c.q.x .a ( p1,v2 );
					 /* .line 3 */
					 v3 = 					 v4 = this.a;
					 /* if-nez v3, :cond_0 */
					 /* .line 4 */
					 v3 = this.a;
					 /* .line 5 */
					 e.f.c.q.x .a ( p1,v2 );
					 /* .line 6 */
					 java.lang.String .valueOf ( v0,v1 );
					 /* .line 7 */
					 /* .line 8 */
					 /* return-wide v0 */
					 /* .line 9 */
				 } // :cond_0
				 (( e.f.c.q.x ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/q/x;->b(Ljava/lang/String;)J
				 /* move-result-wide v0 */
				 /* return-wide v0 */
			 } // .end method
