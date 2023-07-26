public class c.v.l1 extends c.v.k1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method e;
	 public static Boolean f;
	 public static java.lang.reflect.Method g;
	 public static Boolean h;
	 /* # direct methods */
	 public c.v.l1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/v/k1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0, android.graphics.Matrix p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( c.v.l1 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/v/l1;->c()V
		 /* .line 2 */
		 v0 = c.v.l1.e;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v1 = 1; // const/4 v1, 0x1
			 try { // :try_start_0
				 /* new-array v1, v1, [Ljava/lang/Object; */
				 int v2 = 0; // const/4 v2, 0x0
				 /* aput-object p2, v1, v2 */
				 /* .line 3 */
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
	 public void b ( android.view.View p0, android.graphics.Matrix p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( c.v.l1 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/v/l1;->d()V
		 /* .line 2 */
		 v0 = c.v.l1.g;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v1 = 1; // const/4 v1, 0x1
			 try { // :try_start_0
				 /* new-array v1, v1, [Ljava/lang/Object; */
				 int v2 = 0; // const/4 v2, 0x0
				 /* aput-object p2, v1, v2 */
				 /* .line 3 */
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
	 public final void c ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* sget-boolean v0, Lc/v/l1;->f:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 try { // :try_start_0
			 /* const-class v1, Landroid/view/View; */
			 final String v2 = "transformMatrixToGlobal"; // const-string v2, "transformMatrixToGlobal"
			 /* new-array v3, v0, [Ljava/lang/Class; */
			 int v4 = 0; // const/4 v4, 0x0
			 /* const-class v5, Landroid/graphics/Matrix; */
			 /* aput-object v5, v3, v4 */
			 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 3 */
			 (( java.lang.reflect.Method ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 final String v2 = "ViewUtilsApi21"; // const-string v2, "ViewUtilsApi21"
			 final String v3 = "Failed to retrieve transformMatrixToGlobal method"; // const-string v3, "Failed to retrieve transformMatrixToGlobal method"
			 /* .line 4 */
			 android.util.Log .i ( v2,v3,v1 );
			 /* .line 5 */
		 } // :goto_0
		 c.v.l1.f = (v0!= 0);
	 } // :cond_0
	 return;
} // .end method
public final void d ( ) {
	 /* .locals 6 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/v/l1;->h:Z */
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 2 */
	 try { // :try_start_0
		 /* const-class v1, Landroid/view/View; */
		 final String v2 = "transformMatrixToLocal"; // const-string v2, "transformMatrixToLocal"
		 /* new-array v3, v0, [Ljava/lang/Class; */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const-class v5, Landroid/graphics/Matrix; */
		 /* aput-object v5, v3, v4 */
		 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 3 */
		 (( java.lang.reflect.Method ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 final String v2 = "ViewUtilsApi21"; // const-string v2, "ViewUtilsApi21"
		 final String v3 = "Failed to retrieve transformMatrixToLocal method"; // const-string v3, "Failed to retrieve transformMatrixToLocal method"
		 /* .line 4 */
		 android.util.Log .i ( v2,v3,v1 );
		 /* .line 5 */
	 } // :goto_0
	 c.v.l1.h = (v0!= 0);
} // :cond_0
return;
} // .end method
