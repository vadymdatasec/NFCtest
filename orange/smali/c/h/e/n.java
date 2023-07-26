public abstract class c.h.e.n {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 public static Boolean b;
	 /* # direct methods */
	 public static android.os.IBinder a ( android.os.Bundle p0, java.lang.String p1 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* sget-boolean v0, Lc/h/e/n;->b:Z */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "BundleCompatBaseImpl"; // const-string v2, "BundleCompatBaseImpl"
		 int v3 = 1; // const/4 v3, 0x1
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/os/Bundle; */
			 final String v4 = "getIBinder"; // const-string v4, "getIBinder"
			 /* new-array v5, v3, [Ljava/lang/Class; */
			 /* const-class v6, Ljava/lang/String; */
			 /* aput-object v6, v5, v1 */
			 (( java.lang.Class ) v0 ).getMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 3 */
			 (( java.lang.reflect.Method ) v0 ).setAccessible ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 final String v4 = "Failed to retrieve getIBinder method"; // const-string v4, "Failed to retrieve getIBinder method"
			 /* .line 4 */
			 android.util.Log .i ( v2,v4,v0 );
			 /* .line 5 */
		 } // :goto_0
		 c.h.e.n.b = (v3!= 0);
		 /* .line 6 */
	 } // :cond_0
	 v0 = c.h.e.n.a;
	 int v4 = 0; // const/4 v4, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 try { // :try_start_1
			 /* new-array v3, v3, [Ljava/lang/Object; */
			 /* aput-object p1, v3, v1 */
			 /* .line 7 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v3 ); // invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast p0, Landroid/os/IBinder; */
			 /* :try_end_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_3 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
			 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
			 /* move-exception p0 */
			 /* :catch_2 */
			 /* move-exception p0 */
			 /* :catch_3 */
			 /* move-exception p0 */
		 } // :goto_1
		 final String p1 = "Failed to invoke getIBinder via reflection"; // const-string p1, "Failed to invoke getIBinder via reflection"
		 /* .line 8 */
		 android.util.Log .i ( v2,p1,p0 );
		 /* .line 9 */
	 } // :cond_1
} // .end method
