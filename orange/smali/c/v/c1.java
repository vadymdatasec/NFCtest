public abstract class c.v.c1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 public static Boolean b;
	 /* # direct methods */
	 public static void a ( ) {
		 /* .locals 6 */
		 /* .line 6 */
		 /* sget-boolean v0, Lc/v/c1;->b:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 7 */
		 try { // :try_start_0
			 /* const-class v1, Landroid/view/ViewGroup; */
			 final String v2 = "suppressLayout"; // const-string v2, "suppressLayout"
			 /* new-array v3, v0, [Ljava/lang/Class; */
			 int v4 = 0; // const/4 v4, 0x0
			 v5 = java.lang.Boolean.TYPE;
			 /* aput-object v5, v3, v4 */
			 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 8 */
			 (( java.lang.reflect.Method ) v1 ).setAccessible ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 final String v2 = "ViewUtilsApi18"; // const-string v2, "ViewUtilsApi18"
			 final String v3 = "Failed to retrieve suppressLayout method"; // const-string v3, "Failed to retrieve suppressLayout method"
			 /* .line 9 */
			 android.util.Log .i ( v2,v3,v1 );
			 /* .line 10 */
		 } // :goto_0
		 c.v.c1.b = (v0!= 0);
	 } // :cond_0
	 return;
} // .end method
public static void a ( android.view.ViewGroup p0, Boolean p1 ) {
	 /* .locals 4 */
	 final String v0 = "ViewUtilsApi18"; // const-string v0, "ViewUtilsApi18"
	 /* .line 1 */
	 c.v.c1 .a ( );
	 /* .line 2 */
	 v1 = c.v.c1.a;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 int v2 = 1; // const/4 v2, 0x1
		 try { // :try_start_0
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* .line 3 */
			 java.lang.Boolean .valueOf ( p1 );
			 /* aput-object p1, v2, v3 */
			 (( java.lang.reflect.Method ) v1 ).invoke ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 final String p1 = "Error invoking suppressLayout method"; // const-string p1, "Error invoking suppressLayout method"
			 /* .line 4 */
			 android.util.Log .i ( v0,p1,p0 );
			 /* :catch_1 */
			 /* move-exception p0 */
			 final String p1 = "Failed to invoke suppressLayout method"; // const-string p1, "Failed to invoke suppressLayout method"
			 /* .line 5 */
			 android.util.Log .i ( v0,p1,p0 );
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
