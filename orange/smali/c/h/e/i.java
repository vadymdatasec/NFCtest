public class c.h.e.i implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Object b; //synthetic
	 public final java.lang.Object c; //synthetic
	 /* # direct methods */
	 public c.h.e.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = c.h.e.k.d;
			 int v1 = 1; // const/4 v1, 0x1
			 int v2 = 2; // const/4 v2, 0x2
			 int v3 = 0; // const/4 v3, 0x0
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 v0 = c.h.e.k.d;
				 v4 = this.b;
				 int v5 = 3; // const/4 v5, 0x3
				 /* new-array v5, v5, [Ljava/lang/Object; */
				 v6 = this.c;
				 /* aput-object v6, v5, v3 */
				 /* .line 3 */
				 java.lang.Boolean .valueOf ( v3 );
				 /* aput-object v3, v5, v1 */
				 final String v1 = "AppCompat recreation"; // const-string v1, "AppCompat recreation"
				 /* aput-object v1, v5, v2 */
				 /* .line 4 */
				 (( java.lang.reflect.Method ) v0 ).invoke ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
				 /* .line 5 */
			 } // :cond_0
			 v0 = c.h.e.k.e;
			 v4 = this.b;
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 v5 = this.c;
			 /* aput-object v5, v2, v3 */
			 /* .line 6 */
			 java.lang.Boolean .valueOf ( v3 );
			 /* aput-object v3, v2, v1 */
			 /* .line 7 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( v4, v2 ); // invoke-virtual {v0, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 final String v1 = "ActivityRecreator"; // const-string v1, "ActivityRecreator"
			 final String v2 = "Exception while invoking performStopActivity"; // const-string v2, "Exception while invoking performStopActivity"
			 /* .line 8 */
			 android.util.Log .e ( v1,v2,v0 );
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 9 */
			 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 /* const-class v2, Ljava/lang/RuntimeException; */
			 /* if-ne v1, v2, :cond_2 */
			 /* .line 10 */
			 (( java.lang.RuntimeException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* .line 11 */
				 (( java.lang.RuntimeException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;
				 final String v2 = "Unable to stop"; // const-string v2, "Unable to stop"
				 v1 = 				 (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
				 /* if-nez v1, :cond_1 */
				 /* .line 12 */
			 } // :cond_1
			 /* throw v0 */
		 } // :cond_2
	 } // :goto_0
	 return;
} // .end method
