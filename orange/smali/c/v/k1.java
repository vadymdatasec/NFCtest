public class c.v.k1 extends c.v.n1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 public static Boolean b;
	 public static java.lang.reflect.Method c;
	 public static Boolean d;
	 /* # direct methods */
	 public c.v.k1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/v/n1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 4 */
		 /* .line 6 */
		 /* sget-boolean v0, Lc/v/k1;->d:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 7 */
		 try { // :try_start_0
			 /* const-class v1, Landroid/view/View; */
			 final String v2 = "getTransitionAlpha"; // const-string v2, "getTransitionAlpha"
			 int v3 = 0; // const/4 v3, 0x0
			 /* new-array v3, v3, [Ljava/lang/Class; */
			 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 8 */
			 (( java.lang.reflect.Method ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 final String v2 = "ViewUtilsApi19"; // const-string v2, "ViewUtilsApi19"
			 final String v3 = "Failed to retrieve getTransitionAlpha method"; // const-string v3, "Failed to retrieve getTransitionAlpha method"
			 /* .line 9 */
			 android.util.Log .i ( v2,v3,v1 );
			 /* .line 10 */
		 } // :goto_0
		 c.v.k1.d = (v0!= 0);
	 } // :cond_0
	 return;
} // .end method
public void a ( android.view.View p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( android.view.View p0, Float p1 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 (( c.v.k1 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/v/k1;->b()V
	 /* .line 2 */
	 v0 = c.v.k1.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 1; // const/4 v1, 0x1
		 try { // :try_start_0
			 /* new-array v1, v1, [Ljava/lang/Object; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .line 3 */
			 java.lang.Float .valueOf ( p2 );
			 /* aput-object p2, v1, v2 */
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
			 /* .line 5 */
		 } // :cond_0
		 (( android.view.View ) p1 ).setAlpha ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V
		 /* :catch_1 */
	 } // :goto_0
	 return;
} // .end method
public Float b ( android.view.View p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( c.v.k1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/k1;->a()V
	 /* .line 2 */
	 v0 = c.v.k1.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 /* new-array v1, v1, [Ljava/lang/Object; */
			 /* .line 3 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/Float; */
			 p1 = 			 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 4 */
			 /* new-instance v0, Ljava/lang/RuntimeException; */
			 (( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
			 /* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
			 /* throw v0 */
			 /* .line 5 */
			 /* :catch_1 */
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Lc/v/n1;->b(Landroid/view/View;)F */
	 } // .end method
	 public final void b ( ) {
		 /* .locals 6 */
		 /* .line 6 */
		 /* sget-boolean v0, Lc/v/k1;->b:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 7 */
		 try { // :try_start_0
			 /* const-class v1, Landroid/view/View; */
			 final String v2 = "setTransitionAlpha"; // const-string v2, "setTransitionAlpha"
			 /* new-array v3, v0, [Ljava/lang/Class; */
			 int v4 = 0; // const/4 v4, 0x0
			 v5 = java.lang.Float.TYPE;
			 /* aput-object v5, v3, v4 */
			 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 8 */
			 (( java.lang.reflect.Method ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 final String v2 = "ViewUtilsApi19"; // const-string v2, "ViewUtilsApi19"
			 final String v3 = "Failed to retrieve setTransitionAlpha method"; // const-string v3, "Failed to retrieve setTransitionAlpha method"
			 /* .line 9 */
			 android.util.Log .i ( v2,v3,v1 );
			 /* .line 10 */
		 } // :goto_0
		 c.v.k1.b = (v0!= 0);
	 } // :cond_0
	 return;
} // .end method
public void c ( android.view.View p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
