public class e.f.c.l.e.t.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final h;
	 /* # instance fields */
	 public final e.f.c.l.e.t.h.c a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 public final e.f.c.l.e.m.j1 d;
	 public final e.f.c.l.e.t.a e;
	 public final e.f.c.l.e.t.b f;
	 public java.lang.Thread g;
	 /* # direct methods */
	 public static e.f.c.l.e.t.f ( ) {
		 /* .locals 1 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* new-array v0, v0, [S */
		 /* .line 1 */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0xas */
		 /* 0x14s */
		 /* 0x1es */
		 /* 0x3cs */
		 /* 0x78s */
		 /* 0x12cs */
	 } // .end array-data
} // .end method
public e.f.c.l.e.t.f ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 if ( p5 != null) { // if-eqz p5, :cond_0
		 /* .line 2 */
		 this.a = p5;
		 /* .line 3 */
		 this.b = p1;
		 /* .line 4 */
		 this.c = p2;
		 /* .line 5 */
		 this.d = p3;
		 /* .line 6 */
		 this.e = p4;
		 /* .line 7 */
		 this.f = p6;
		 return;
		 /* .line 8 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String p2 = "createReportCall must not be null."; // const-string p2, "createReportCall must not be null."
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public static e.f.c.l.e.t.b a ( Object p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 p0 = this.f;
} // .end method
public static java.lang.Thread a ( Object p0, java.lang.Thread p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 this.g = p1;
} // .end method
public static a ( ) { //synthethic
	 /* .locals 1 */
	 /* .line 3 */
	 v0 = e.f.c.l.e.t.f.h;
} // .end method
/* # virtual methods */
public synchronized void a ( java.util.List p0, Boolean p1, Float p2 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/List<", */
	 /* "Le/f/c/l/e/t/g/d;", */
	 /* ">;ZF)V" */
	 /* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
	 v0 = this.g;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 5 */
		 e.f.c.l.e.b .a ( );
		 final String p2 = "Report upload has already been started."; // const-string p2, "Report upload has already been started."
		 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 6 */
		 /* monitor-exit p0 */
		 return;
		 /* .line 7 */
	 } // :cond_0
	 try { // :try_start_1
		 /* new-instance v0, Le/f/c/l/e/t/e; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Le/f/c/l/e/t/e;-><init>(Le/f/c/l/e/t/f;Ljava/util/List;ZF)V */
		 /* .line 8 */
		 /* new-instance p1, Ljava/lang/Thread; */
		 final String p2 = "Crashlytics Report Uploader"; // const-string p2, "Crashlytics Report Uploader"
		 /* invoke-direct {p1, v0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
		 this.g = p1;
		 /* .line 9 */
		 (( java.lang.Thread ) p1 ).start ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->start()V
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* .line 10 */
		 /* monitor-exit p0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* throw p1 */
	 } // .end method
	 public Boolean a ( Object p0, Boolean p1 ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 11 */
		 try { // :try_start_0
			 /* new-instance v1, Le/f/c/l/e/t/g/a; */
			 v2 = this.b;
			 v3 = this.c;
			 /* invoke-direct {v1, v2, v3, p1}, Le/f/c/l/e/t/g/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/t/g/d;)V */
			 /* .line 12 */
			 v2 = this.d;
			 v3 = e.f.c.l.e.m.j1.d;
			 int v4 = 1; // const/4 v4, 0x1
			 /* if-ne v2, v3, :cond_0 */
			 /* .line 13 */
			 e.f.c.l.e.b .a ( );
			 final String v1 = "Send to Reports Endpoint disabled.Removing Reports Endpoint report."; // const-string v1, "Send to Reports Endpoint disabled.Removing Reports Endpoint report."
			 /* .line 14 */
			 (( e.f.c.l.e.b ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 15 */
		 } // :cond_0
		 v2 = this.d;
		 v3 = e.f.c.l.e.m.j1.c;
		 /* if-ne v2, v3, :cond_1 */
		 /* .line 16 */
		 v3 = e.f.c.l.e.t.g.c.b;
		 /* if-ne v2, v3, :cond_1 */
		 /* .line 17 */
		 e.f.c.l.e.b .a ( );
		 final String v1 = "Send to Reports Endpoint for non-native reports disabled.Removing Reports Uploader report."; // const-string v1, "Send to Reports Endpoint for non-native reports disabled.Removing Reports Uploader report."
		 /* .line 18 */
		 (( e.f.c.l.e.b ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 } // :goto_0
	 int p2 = 1; // const/4 p2, 0x1
	 /* .line 19 */
} // :cond_1
p2 = v2 = this.a;
/* .line 20 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Crashlytics Reports Endpoint upload "; // const-string v3, "Crashlytics Reports Endpoint upload "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( p2 != null) { // if-eqz p2, :cond_2
	 final String v3 = "complete: "; // const-string v3, "complete: "
} // :cond_2
final String v3 = "FAILED: "; // const-string v3, "FAILED: "
/* .line 21 */
} // :goto_1
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 22 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 23 */
(( e.f.c.l.e.b ) v1 ).c ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->c(Ljava/lang/String;)V
} // :goto_2
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 24 */
p2 = this.e;
(( e.f.c.l.e.t.a ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/c/l/e/t/a;->a(Le/f/c/l/e/t/g/d;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 1; // const/4 v0, 0x1
/* :catch_0 */
/* move-exception p2 */
/* .line 25 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Error occurred sending report "; // const-string v3, "Error occurred sending report "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).b ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_3
} // :goto_3
} // .end method
