public class c.v.m1 extends c.v.l1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method i;
	 public static Boolean j;
	 /* # direct methods */
	 public c.v.m1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/v/l1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( c.v.m1 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/v/m1;->e()V
		 /* .line 2 */
		 v0 = c.v.m1.i;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v1 = 4; // const/4 v1, 0x4
			 try { // :try_start_0
				 /* new-array v1, v1, [Ljava/lang/Object; */
				 int v2 = 0; // const/4 v2, 0x0
				 /* .line 3 */
				 java.lang.Integer .valueOf ( p2 );
				 /* aput-object p2, v1, v2 */
				 int p2 = 1; // const/4 p2, 0x1
				 java.lang.Integer .valueOf ( p3 );
				 /* aput-object p3, v1, p2 */
				 int p2 = 2; // const/4 p2, 0x2
				 java.lang.Integer .valueOf ( p4 );
				 /* aput-object p3, v1, p2 */
				 int p2 = 3; // const/4 p2, 0x3
				 java.lang.Integer .valueOf ( p5 );
				 /* aput-object p3, v1, p2 */
				 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* move-exception p1 */
				 /* .line 4 */
				 /* new-instance p2, Ljava/lang/RuntimeException; */
				 (( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
				 /* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
				 /* throw p2 */
				 /* :catch_1 */
			 } // :cond_0
		 } // :goto_0
		 return;
	 } // .end method
	 public final void e ( ) {
		 /* .locals 6 */
		 /* .annotation build Landroid/annotation/SuppressLint; */
		 /* value = { */
		 /* "PrivateApi" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* sget-boolean v0, Lc/v/m1;->j:Z */
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 2 */
	 try { // :try_start_0
		 /* const-class v1, Landroid/view/View; */
		 final String v2 = "setLeftTopRightBottom"; // const-string v2, "setLeftTopRightBottom"
		 int v3 = 4; // const/4 v3, 0x4
		 /* new-array v3, v3, [Ljava/lang/Class; */
		 int v4 = 0; // const/4 v4, 0x0
		 v5 = java.lang.Integer.TYPE;
		 /* aput-object v5, v3, v4 */
		 v4 = java.lang.Integer.TYPE;
		 /* aput-object v4, v3, v0 */
		 int v4 = 2; // const/4 v4, 0x2
		 v5 = java.lang.Integer.TYPE;
		 /* aput-object v5, v3, v4 */
		 int v4 = 3; // const/4 v4, 0x3
		 v5 = java.lang.Integer.TYPE;
		 /* aput-object v5, v3, v4 */
		 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 3 */
		 (( java.lang.reflect.Method ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 final String v2 = "ViewUtilsApi22"; // const-string v2, "ViewUtilsApi22"
		 final String v3 = "Failed to retrieve setLeftTopRightBottom method"; // const-string v3, "Failed to retrieve setLeftTopRightBottom method"
		 /* .line 4 */
		 android.util.Log .i ( v2,v3,v1 );
		 /* .line 5 */
	 } // :goto_0
	 c.v.m1.j = (v0!= 0);
} // :cond_0
return;
} // .end method
