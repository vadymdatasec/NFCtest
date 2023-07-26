public class c.c.a.a.e extends c.c.a.a.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.Object a;
	 public final java.util.concurrent.ExecutorService b;
	 public volatile android.os.Handler c;
	 /* # direct methods */
	 public c.c.a.a.e ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/c/a/a/f;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Lc/c/a/a/d; */
		 /* invoke-direct {v0, p0}, Lc/c/a/a/d;-><init>(Lc/c/a/a/e;)V */
		 int v1 = 4; // const/4 v1, 0x4
		 java.util.concurrent.Executors .newFixedThreadPool ( v1,v0 );
		 this.b = v0;
		 return;
	 } // .end method
	 public static android.os.Handler a ( android.os.Looper p0 ) {
		 /* .locals 7 */
		 /* .line 3 */
		 /* const/16 v1, 0x1c */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 4 */
		 android.os.Handler .createAsync ( p0 );
	 } // :cond_0
	 /* const/16 v1, 0x10 */
	 /* if-lt v0, v1, :cond_1 */
	 /* .line 5 */
	 try { // :try_start_0
		 /* const-class v0, Landroid/os/Handler; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-array v2, v1, [Ljava/lang/Class; */
		 /* const-class v3, Landroid/os/Looper; */
		 int v4 = 0; // const/4 v4, 0x0
		 /* aput-object v3, v2, v4 */
		 /* const-class v3, Landroid/os/Handler$Callback; */
		 int v5 = 1; // const/4 v5, 0x1
		 /* aput-object v3, v2, v5 */
		 v3 = java.lang.Boolean.TYPE;
		 int v6 = 2; // const/4 v6, 0x2
		 /* aput-object v3, v2, v6 */
		 (( java.lang.Class ) v0 ).getDeclaredConstructor ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 /* aput-object p0, v1, v4 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v2, v1, v5 */
		 /* .line 6 */
		 java.lang.Boolean .valueOf ( v5 );
		 /* aput-object v2, v1, v6 */
		 (( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/os/Handler; */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 7 */
		 /* :catch_0 */
		 /* new-instance v0, Landroid/os/Handler; */
		 /* invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 /* .line 8 */
		 /* :catch_1 */
	 } // :cond_1
	 /* new-instance v0, Landroid/os/Handler; */
	 /* invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
} // .end method
/* # virtual methods */
public void a ( java.lang.Runnable p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 android.os.Looper .getMainLooper ( );
	 (( android.os.Looper ) v0 ).getThread ( ); // invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;
	 java.lang.Thread .currentThread ( );
	 /* if-ne v0, v1, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( java.lang.Runnable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_1 */
/* .line 2 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = this.c;
/* if-nez v1, :cond_0 */
/* .line 4 */
android.os.Looper .getMainLooper ( );
c.c.a.a.e .a ( v1 );
this.c = v1;
/* .line 5 */
} // :cond_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
/* .line 6 */
} // :cond_1
} // :goto_0
v0 = this.c;
(( android.os.Handler ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
