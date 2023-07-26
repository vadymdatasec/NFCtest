public class e.f.c.l.e.m.g1 implements java.lang.Thread$UncaughtExceptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.c.l.e.m.f1 a;
	 public final e.f.c.l.e.v.f b;
	 public final java.lang.Thread$UncaughtExceptionHandler c;
	 public final java.util.concurrent.atomic.AtomicBoolean d;
	 /* # direct methods */
	 public e.f.c.l.e.m.g1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 /* .line 5 */
		 /* new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean; */
		 int p2 = 0; // const/4 p2, 0x0
		 /* invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
		 this.d = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
		 v0 = 		 (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
	 } // .end method
	 public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.d;
		 int v1 = 1; // const/4 v1, 0x1
		 (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "Crashlytics completed exception processing.Invoking default exception handler."; // const-string v1, "Crashlytics completed exception processing.Invoking default exception handler."
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
		 try { // :try_start_0
			 e.f.c.l.e.b .a ( );
			 final String v3 = "Could not handle uncaught exception; null thread"; // const-string v3, "Could not handle uncaught exception; null thread"
			 (( e.f.c.l.e.b ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V
			 /* :catchall_0 */
			 /* move-exception v2 */
			 /* :catch_0 */
			 /* move-exception v2 */
		 } // :cond_0
		 /* if-nez p2, :cond_1 */
		 /* .line 3 */
		 e.f.c.l.e.b .a ( );
		 final String v3 = "Could not handle uncaught exception; null throwable"; // const-string v3, "Could not handle uncaught exception; null throwable"
		 (( e.f.c.l.e.b ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V
		 /* .line 4 */
	 } // :cond_1
	 v2 = this.a;
	 v3 = this.b;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 5 */
} // :goto_0
e.f.c.l.e.b .a ( );
/* .line 6 */
(( e.f.c.l.e.b ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 7 */
v1 = this.c;
/* .line 8 */
p1 = this.d;
(( java.util.concurrent.atomic.AtomicBoolean ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* .line 9 */
} // :goto_1
try { // :try_start_1
e.f.c.l.e.b .a ( );
final String v4 = "An error occurred in the uncaught exception handler"; // const-string v4, "An error occurred in the uncaught exception handler"
(( e.f.c.l.e.b ) v3 ).b ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_2
return;
/* .line 10 */
} // :goto_3
e.f.c.l.e.b .a ( );
/* .line 11 */
(( e.f.c.l.e.b ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 12 */
v1 = this.c;
/* .line 13 */
p1 = this.d;
(( java.util.concurrent.atomic.AtomicBoolean ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* .line 14 */
/* throw v2 */
} // .end method
